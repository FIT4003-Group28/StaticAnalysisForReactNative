package com.facebook.react.modules.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ImageEditingManager.NAME)
/* loaded from: classes.dex */
public class ImageEditingManager extends ReactContextBaseJavaModule {
    private static final int COMPRESS_QUALITY = 90;
    public static final String NAME = "ImageEditingManager";
    private static final String TEMP_FILE_PREFIX = "ReactNative_cropped_image_";
    private static final List<String> LOCAL_URI_PREFIXES = Arrays.asList("file://", "content://");
    @SuppressLint({"InlinedApi"})
    private static final String[] EXIF_ATTRIBUTES = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};

    /* loaded from: classes.dex */
    private static class b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5580a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements FilenameFilter {
            a(b bVar) {
            }

            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith(ImageEditingManager.TEMP_FILE_PREFIX);
            }
        }

        private b(ReactContext reactContext) {
            super(reactContext);
            this.f5580a = reactContext;
        }

        private void a(File file) {
            File[] listFiles = file.listFiles(new a(this));
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            a(this.f5580a.getCacheDir());
            File externalCacheDir = this.f5580a.getExternalCacheDir();
            if (externalCacheDir != null) {
                a(externalCacheDir);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class c extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final Context f5581a;

        /* renamed from: b  reason: collision with root package name */
        final String f5582b;

        /* renamed from: c  reason: collision with root package name */
        final int f5583c;

        /* renamed from: d  reason: collision with root package name */
        final int f5584d;

        /* renamed from: e  reason: collision with root package name */
        final int f5585e;

        /* renamed from: f  reason: collision with root package name */
        final int f5586f;

        /* renamed from: g  reason: collision with root package name */
        int f5587g;

        /* renamed from: h  reason: collision with root package name */
        int f5588h;
        final Callback i;
        final Callback j;

        private c(ReactContext reactContext, String str, int i, int i2, int i3, int i4, Callback callback, Callback callback2) {
            super(reactContext);
            this.f5587g = 0;
            this.f5588h = 0;
            if (i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            this.f5581a = reactContext;
            this.f5582b = str;
            this.f5583c = i;
            this.f5584d = i2;
            this.f5585e = i3;
            this.f5586f = i4;
            this.i = callback;
            this.j = callback2;
        }

        private Bitmap a(int i, int i2, BitmapFactory.Options options) {
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            c.d.k.a.a.a(options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            InputStream a2 = a();
            try {
                BitmapFactory.decodeStream(a2, null, options2);
                if (a2 != null) {
                    a2.close();
                }
                int i3 = this.f5585e;
                int i4 = this.f5586f;
                float f7 = i;
                float f8 = i2;
                float f9 = f7 / f8;
                if (i3 / i4 > f9) {
                    f2 = i4 * f9;
                    f4 = i4;
                    f3 = this.f5583c + ((i3 - f2) / 2.0f);
                    f6 = this.f5584d;
                    f5 = f8 / i4;
                } else {
                    f2 = i3;
                    float f10 = i3 / f9;
                    f3 = this.f5583c;
                    float f11 = (i4 - f10) / 2.0f;
                    float f12 = f7 / i3;
                    f4 = f10;
                    f5 = f12;
                    f6 = f11 + this.f5584d;
                }
                options.inSampleSize = ImageEditingManager.getDecodeSampleSize(this.f5585e, this.f5586f, i, i2);
                options2.inJustDecodeBounds = false;
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(a(), null, options);
                    if (decodeStream != null) {
                        float f13 = f5 * options.inSampleSize;
                        Matrix matrix = new Matrix();
                        matrix.setScale(f13, f13);
                        return Bitmap.createBitmap(decodeStream, (int) Math.floor(f3 / options.inSampleSize), (int) Math.floor(f6 / options.inSampleSize), (int) Math.floor(f2 / options.inSampleSize), (int) Math.floor(f4 / options.inSampleSize), matrix, true);
                    }
                    throw new IOException("Cannot decode bitmap: " + this.f5582b);
                } finally {
                }
            } finally {
                if (a2 != null) {
                    a2.close();
                }
            }
        }

        private Bitmap a(BitmapFactory.Options options) {
            InputStream a2 = a();
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(a2, false);
            try {
                return newInstance.decodeRegion(new Rect(this.f5583c, this.f5584d, this.f5583c + this.f5585e, this.f5584d + this.f5586f), options);
            } finally {
                if (a2 != null) {
                    a2.close();
                }
                newInstance.recycle();
            }
        }

        private InputStream a() {
            InputStream openInputStream = ImageEditingManager.isLocalUri(this.f5582b) ? this.f5581a.getContentResolver().openInputStream(Uri.parse(this.f5582b)) : new URL(this.f5582b).openConnection().getInputStream();
            if (openInputStream != null) {
                return openInputStream;
            }
            throw new IOException("Cannot open bitmap: " + this.f5582b);
        }

        public void a(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f5587g = i;
            this.f5588h = i2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                Bitmap a2 = this.f5587g > 0 && this.f5588h > 0 ? a(this.f5587g, this.f5588h, options) : a(options);
                String str = options.outMimeType;
                if (str == null || str.isEmpty()) {
                    throw new IOException("Could not determine MIME type");
                }
                File createTempFile = ImageEditingManager.createTempFile(this.f5581a, str);
                ImageEditingManager.writeCompressedBitmapToFile(a2, str, createTempFile);
                if (str.equals("image/jpeg")) {
                    ImageEditingManager.copyExif(this.f5581a, Uri.parse(this.f5582b), createTempFile);
                }
                this.i.invoke(Uri.fromFile(createTempFile).toString());
            } catch (Exception e2) {
                this.j.invoke(e2.getMessage());
            }
        }
    }

    public ImageEditingManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        new b(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void copyExif(Context context, Uri uri, File file) {
        String[] strArr;
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri == null) {
            c.d.d.e.a.d("ReactNative", "Couldn't get real path for uri: " + uri);
            return;
        }
        ExifInterface exifInterface = new ExifInterface(fileFromUri.getAbsolutePath());
        ExifInterface exifInterface2 = new ExifInterface(file.getAbsolutePath());
        for (String str : EXIF_ATTRIBUTES) {
            String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File createTempFile(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        return File.createTempFile(TEMP_FILE_PREFIX, getFileExtensionForType(str), externalCacheDir);
    }

    private static Bitmap.CompressFormat getCompressFormatForType(String str) {
        return "image/png".equals(str) ? Bitmap.CompressFormat.PNG : "image/webp".equals(str) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getDecodeSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i3 || i > i4) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i7 / i5 >= i3 && i6 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    private static String getFileExtensionForType(String str) {
        return "image/png".equals(str) ? ".png" : "image/webp".equals(str) ? ".webp" : ".jpg";
    }

    private static File getFileFromUri(Context context, Uri uri) {
        Cursor query;
        if (uri.getScheme().equals("file")) {
            return new File(uri.getPath());
        }
        if (!uri.getScheme().equals("content") || (query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
            }
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isLocalUri(String str) {
        for (String str2 : LOCAL_URI_PREFIXES) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeCompressedBitmapToFile(Bitmap bitmap, String str, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(getCompressFormatForType(str), 90, fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    @ReactMethod
    public void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2) {
        ReadableMap readableMap2 = null;
        ReadableMap mo210getMap = readableMap.hasKey("offset") ? readableMap.mo210getMap("offset") : null;
        if (readableMap.hasKey("size")) {
            readableMap2 = readableMap.mo210getMap("size");
        }
        if (mo210getMap == null || readableMap2 == null || !mo210getMap.hasKey("x") || !mo210getMap.hasKey("y") || !readableMap2.hasKey("width") || !readableMap2.hasKey("height")) {
            throw new JSApplicationIllegalArgumentException("Please specify offset and size");
        }
        if (str == null || str.isEmpty()) {
            throw new JSApplicationIllegalArgumentException("Please specify a URI");
        }
        c cVar = new c(getReactApplicationContext(), str, (int) mo210getMap.getDouble("x"), (int) mo210getMap.getDouble("y"), (int) readableMap2.getDouble("width"), (int) readableMap2.getDouble("height"), callback, callback2);
        if (readableMap.hasKey("displaySize")) {
            ReadableMap mo210getMap2 = readableMap.mo210getMap("displaySize");
            cVar.a((int) mo210getMap2.getDouble("width"), (int) mo210getMap2.getDouble("height"));
        }
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        new b(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
