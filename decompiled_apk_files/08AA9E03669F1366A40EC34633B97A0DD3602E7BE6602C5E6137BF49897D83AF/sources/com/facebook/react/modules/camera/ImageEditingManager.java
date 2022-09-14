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
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.d;
import com.facebook.react.bridge.j;
import com.facebook.react.bridge.n;
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
/* loaded from: classes.dex */
public class ImageEditingManager extends ReactContextBaseJavaModule {
    private static final int COMPRESS_QUALITY = 90;
    protected static final String NAME = "ImageEditingManager";
    private static final String TEMP_FILE_PREFIX = "ReactNative_cropped_image_";
    private static final List<String> LOCAL_URI_PREFIXES = Arrays.asList("file://", "content://");
    @SuppressLint({"InlinedApi"})
    private static final String[] EXIF_ATTRIBUTES = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public ImageEditingManager(ah ahVar) {
        super(ahVar);
        new a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        new a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* loaded from: classes.dex */
    private static class a extends j<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3491a;

        private a(aj ajVar) {
            super(ajVar);
            this.f3491a = ajVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.j
        /* renamed from: a */
        public void b(Void... voidArr) {
            a(this.f3491a.getCacheDir());
            File externalCacheDir = this.f3491a.getExternalCacheDir();
            if (externalCacheDir != null) {
                a(externalCacheDir);
            }
        }

        private void a(File file) {
            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.facebook.react.modules.camera.ImageEditingManager.a.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file2, String str) {
                    return str.startsWith(ImageEditingManager.TEMP_FILE_PREFIX);
                }
            });
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }
    }

    @al
    public void cropImage(String str, an anVar, d dVar, d dVar2) {
        an anVar2 = null;
        an d2 = anVar.hasKey("offset") ? anVar.d("offset") : null;
        if (anVar.hasKey("size")) {
            anVar2 = anVar.d("size");
        }
        if (d2 == null || anVar2 == null || !d2.hasKey("x") || !d2.hasKey("y") || !anVar2.hasKey("width") || !anVar2.hasKey("height")) {
            throw new n("Please specify offset and size");
        }
        if (str == null || str.isEmpty()) {
            throw new n("Please specify a URI");
        }
        b bVar = new b(getReactApplicationContext(), str, (int) d2.getDouble("x"), (int) d2.getDouble("y"), (int) anVar2.getDouble("width"), (int) anVar2.getDouble("height"), dVar, dVar2);
        if (anVar.hasKey("displaySize")) {
            an d3 = anVar.d("displaySize");
            bVar.a((int) d3.getDouble("width"), (int) d3.getDouble("height"));
        }
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* loaded from: classes.dex */
    private static class b extends j<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final Context f3493a;

        /* renamed from: b  reason: collision with root package name */
        final String f3494b;

        /* renamed from: c  reason: collision with root package name */
        final int f3495c;

        /* renamed from: d  reason: collision with root package name */
        final int f3496d;
        final int e;
        final int f;
        int g;
        int h;
        final d i;
        final d j;

        private b(aj ajVar, String str, int i, int i2, int i3, int i4, d dVar, d dVar2) {
            super(ajVar);
            this.g = 0;
            this.h = 0;
            if (i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
                throw new n(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            this.f3493a = ajVar;
            this.f3494b = str;
            this.f3495c = i;
            this.f3496d = i2;
            this.e = i3;
            this.f = i4;
            this.i = dVar;
            this.j = dVar2;
        }

        public void a(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                throw new n(String.format("Invalid target size: [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.g = i;
            this.h = i2;
        }

        private InputStream a() {
            InputStream inputStream;
            if (ImageEditingManager.isLocalUri(this.f3494b)) {
                inputStream = this.f3493a.getContentResolver().openInputStream(Uri.parse(this.f3494b));
            } else {
                inputStream = new URL(this.f3494b).openConnection().getInputStream();
            }
            if (inputStream == null) {
                throw new IOException("Cannot open bitmap: " + this.f3494b);
            }
            return inputStream;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.j
        /* renamed from: a */
        public void b(Void... voidArr) {
            Bitmap a2;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.g > 0 && this.h > 0) {
                    a2 = a(this.g, this.h, options);
                } else {
                    a2 = a(options);
                }
                String str = options.outMimeType;
                if (str != null && !str.isEmpty()) {
                    File createTempFile = ImageEditingManager.createTempFile(this.f3493a, str);
                    ImageEditingManager.writeCompressedBitmapToFile(a2, str, createTempFile);
                    if (str.equals("image/jpeg")) {
                        ImageEditingManager.copyExif(this.f3493a, Uri.parse(this.f3494b), createTempFile);
                    }
                    this.i.a(Uri.fromFile(createTempFile).toString());
                    return;
                }
                throw new IOException("Could not determine MIME type");
            } catch (Exception e) {
                this.j.a(e.getMessage());
            }
        }

        private Bitmap a(BitmapFactory.Options options) {
            InputStream a2 = a();
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(a2, false);
            try {
                return newInstance.decodeRegion(new Rect(this.f3495c, this.f3496d, this.f3495c + this.e, this.f3496d + this.f), options);
            } finally {
                if (a2 != null) {
                    a2.close();
                }
                newInstance.recycle();
            }
        }

        private Bitmap a(int i, int i2, BitmapFactory.Options options) {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            com.facebook.j.a.a.b(options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeStream(a(), null, options2);
                float f6 = i;
                float f7 = i2;
                float f8 = f6 / f7;
                if (this.e / this.f > f8) {
                    f = this.f * f8;
                    f5 = this.f;
                    f2 = this.f3495c + ((this.e - f) / 2.0f);
                    f3 = this.f3496d;
                    f4 = f7 / this.f;
                } else {
                    f = this.e;
                    float f9 = this.e / f8;
                    f2 = this.f3495c;
                    f3 = this.f3496d + ((this.f - f9) / 2.0f);
                    f4 = f6 / this.e;
                    f5 = f9;
                }
                options.inSampleSize = ImageEditingManager.getDecodeSampleSize(this.e, this.f, i, i2);
                options2.inJustDecodeBounds = false;
                InputStream a2 = a();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(a2, null, options);
                    if (decodeStream == null) {
                        throw new IOException("Cannot decode bitmap: " + this.f3494b);
                    }
                    if (a2 != null) {
                        a2.close();
                    }
                    float f10 = f4 * options.inSampleSize;
                    Matrix matrix = new Matrix();
                    matrix.setScale(f10, f10);
                    return Bitmap.createBitmap(decodeStream, (int) Math.floor(f2 / options.inSampleSize), (int) Math.floor(f3 / options.inSampleSize), (int) Math.floor(f / options.inSampleSize), (int) Math.floor(f5 / options.inSampleSize), matrix, true);
                } finally {
                    if (a2 != null) {
                        a2.close();
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void copyExif(Context context, Uri uri, File file) {
        String[] strArr;
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri == null) {
            com.facebook.common.e.a.c("ReactNative", "Couldn't get real path for uri: " + uri);
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

    private static String getFileExtensionForType(String str) {
        return "image/png".equals(str) ? ".png" : "image/webp".equals(str) ? ".webp" : ".jpg";
    }

    private static Bitmap.CompressFormat getCompressFormatForType(String str) {
        if ("image/png".equals(str)) {
            return Bitmap.CompressFormat.PNG;
        }
        if ("image/webp".equals(str)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeCompressedBitmapToFile(Bitmap bitmap, String str, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(getCompressFormatForType(str), 90, fileOutputStream);
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
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
}
