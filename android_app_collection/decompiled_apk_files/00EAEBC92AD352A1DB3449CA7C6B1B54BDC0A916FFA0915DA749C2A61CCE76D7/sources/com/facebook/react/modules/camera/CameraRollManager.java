package com.facebook.react.modules.camera;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.IOException;
import java.util.ArrayList;
@com.facebook.react.d0.a.a(name = CameraRollManager.NAME)
/* loaded from: classes.dex */
public class CameraRollManager extends ReactContextBaseJavaModule {
    private static final String ASSET_TYPE_ALL = "All";
    private static final String ASSET_TYPE_PHOTOS = "Photos";
    private static final String ASSET_TYPE_VIDEOS = "Videos";
    private static final String ERROR_UNABLE_TO_FILTER = "E_UNABLE_TO_FILTER";
    private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final String NAME = "CameraRollManager";
    private static final String[] PROJECTION = {"_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", "longitude", "latitude", "_data"};
    private static final String SELECTION_BUCKET = "bucket_display_name = ?";
    private static final String SELECTION_DATE_TAKEN = "datetaken < ?";
    private static final String SELECTION_MEDIA_SIZE = "_size < ?";

    /* loaded from: classes.dex */
    private static class b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5568a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5569b;

        /* renamed from: c  reason: collision with root package name */
        private final String f5570c;

        /* renamed from: d  reason: collision with root package name */
        private final String f5571d;

        /* renamed from: e  reason: collision with root package name */
        private final ReadableArray f5572e;

        /* renamed from: f  reason: collision with root package name */
        private final Promise f5573f;

        /* renamed from: g  reason: collision with root package name */
        private final String f5574g;

        /* renamed from: h  reason: collision with root package name */
        private final Integer f5575h;

        private b(ReactContext reactContext, int i, String str, String str2, ReadableArray readableArray, String str3, Integer num, Promise promise) {
            super(reactContext);
            this.f5568a = reactContext;
            this.f5569b = i;
            this.f5570c = str;
            this.f5571d = str2;
            this.f5572e = readableArray;
            this.f5573f = promise;
            this.f5574g = str3;
            this.f5575h = num;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            String str;
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f5570c)) {
                sb.append(" AND datetaken < ?");
                arrayList.add(this.f5570c);
            }
            if (!TextUtils.isEmpty(this.f5571d)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.f5571d);
            }
            if (this.f5575h != null) {
                sb.append(" AND _size < ?");
                arrayList.add(this.f5575h.toString());
            }
            String str2 = this.f5574g;
            char c2 = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1905167199) {
                if (hashCode != -1732810888) {
                    if (hashCode == 65921 && str2.equals(CameraRollManager.ASSET_TYPE_ALL)) {
                        c2 = 2;
                    }
                } else if (str2.equals(CameraRollManager.ASSET_TYPE_VIDEOS)) {
                    c2 = 1;
                }
            } else if (str2.equals(CameraRollManager.ASSET_TYPE_PHOTOS)) {
                c2 = 0;
            }
            if (c2 == 0) {
                str = " AND media_type = 1";
            } else if (c2 == 1) {
                str = " AND media_type = 3";
            } else if (c2 != 2) {
                Promise promise = this.f5573f;
                promise.reject(CameraRollManager.ERROR_UNABLE_TO_FILTER, "Invalid filter option: '" + this.f5574g + "'. Expected one of '" + CameraRollManager.ASSET_TYPE_PHOTOS + "', '" + CameraRollManager.ASSET_TYPE_VIDEOS + "' or '" + CameraRollManager.ASSET_TYPE_ALL + "'.");
                return;
            } else {
                str = " AND media_type IN (3,1)";
            }
            sb.append(str);
            ReadableArray readableArray = this.f5572e;
            if (readableArray != null && readableArray.size() > 0) {
                sb.append(" AND mime_type IN (");
                for (int i = 0; i < this.f5572e.size(); i++) {
                    sb.append("?,");
                    arrayList.add(this.f5572e.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), ")");
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.f5568a.getContentResolver();
            try {
                Uri contentUri = MediaStore.Files.getContentUri("external");
                String[] strArr = CameraRollManager.PROJECTION;
                String sb2 = sb.toString();
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                Cursor query = contentResolver.query(contentUri, strArr, sb2, strArr2, "datetaken DESC, date_modified DESC LIMIT " + (this.f5569b + 1));
                if (query == null) {
                    this.f5573f.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD, "Could not get media");
                } else {
                    CameraRollManager.putEdges(contentResolver, query, writableNativeMap, this.f5569b);
                    CameraRollManager.putPageInfo(query, writableNativeMap, this.f5569b);
                    query.close();
                    this.f5573f.resolve(writableNativeMap);
                }
            } catch (SecurityException e2) {
                this.f5573f.reject(CameraRollManager.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e2);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class c extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5576a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f5577b;

        /* renamed from: c  reason: collision with root package name */
        private final Promise f5578c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements MediaScannerConnection.OnScanCompletedListener {
            a() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                Promise promise = c.this.f5578c;
                if (uri != null) {
                    promise.resolve(uri.toString());
                } else {
                    promise.reject(CameraRollManager.ERROR_UNABLE_TO_SAVE, "Could not add image to gallery");
                }
            }
        }

        public c(ReactContext reactContext, Uri uri, Promise promise) {
            super(reactContext);
            this.f5576a = reactContext;
            this.f5577b = uri;
            this.f5578c = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't wrap try/catch for region: R(9:1|2|3|(4:8|9|10|(2:12|(1:24)(3:16|17|19))(17:26|(1:28)(1:107)|29|(2:32|30)|33|34|35|36|37|(2:40|38)|41|42|(2:45|43)|46|47|(2:51|52)|(1:63)(3:59|60|61)))|111|9|10|(0)(0)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x012f, code lost:
            r2 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0131, code lost:
            r2 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0132, code lost:
            r12 = r4;
            r4 = null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[Catch: all -> 0x012f, IOException -> 0x0131, TRY_LEAVE, TryCatch #11 {IOException -> 0x0131, all -> 0x012f, blocks: (B:10:0x0046, B:12:0x0055, B:21:0x006f, B:23:0x0085, B:25:0x009e, B:27:0x00a4, B:28:0x00c4), top: B:114:0x0046 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: all -> 0x012f, IOException -> 0x0131, TRY_ENTER, TryCatch #11 {IOException -> 0x0131, all -> 0x012f, blocks: (B:10:0x0046, B:12:0x0055, B:21:0x006f, B:23:0x0085, B:25:0x009e, B:27:0x00a4, B:28:0x00c4), top: B:114:0x0046 }] */
        /* JADX WARN: Type inference failed for: r4v10, types: [java.nio.channels.ReadableByteChannel] */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void doInBackgroundGuarded(java.lang.Void... r14) {
            /*
                Method dump skipped, instructions count: 390
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.camera.CameraRollManager.c.doInBackgroundGuarded(java.lang.Void[]):void");
        }
    }

    public CameraRollManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        writableMap.putDouble("timestamp", cursor.getLong(i3) / 1000.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeArray writableNativeArray;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex("mime_type");
        int columnIndex3 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor.getColumnIndex("datetaken");
        int columnIndex5 = cursor.getColumnIndex("width");
        int columnIndex6 = cursor.getColumnIndex("height");
        int columnIndex7 = cursor.getColumnIndex("longitude");
        int columnIndex8 = cursor.getColumnIndex("latitude");
        int columnIndex9 = cursor.getColumnIndex("_data");
        int i2 = i;
        int i3 = 0;
        while (i3 < i2 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableNativeArray writableNativeArray3 = writableNativeArray2;
            int i4 = columnIndex;
            int i5 = i3;
            int i6 = columnIndex5;
            int i7 = columnIndex;
            int i8 = columnIndex8;
            int i9 = columnIndex5;
            int i10 = columnIndex7;
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, i4, i6, columnIndex6, columnIndex9, columnIndex2)) {
                putBasicNodeInfo(cursor, writableNativeMap2, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor, writableNativeMap2, i10, i8);
                writableNativeMap.putMap("node", writableNativeMap2);
                writableNativeArray = writableNativeArray3;
                writableNativeArray.pushMap(writableNativeMap);
            } else {
                writableNativeArray = writableNativeArray3;
                i5--;
            }
            cursor.moveToNext();
            i3 = i5 + 1;
            i2 = i;
            writableNativeArray2 = writableNativeArray;
            columnIndex8 = i8;
            columnIndex7 = i10;
            columnIndex = i7;
            columnIndex5 = i9;
        }
        writableMap.putArray("edges", writableNativeArray2);
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4, int i5) {
        StringBuilder sb;
        String str;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri parse = Uri.parse("file://" + cursor.getString(i4));
        writableNativeMap.putString("uri", parse.toString());
        float f2 = (float) cursor.getInt(i2);
        float f3 = (float) cursor.getInt(i3);
        String string = cursor.getString(i5);
        if (string != null && string.startsWith("video")) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                if (f2 <= 0.0f || f3 <= 0.0f) {
                    try {
                        f2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        f3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    } catch (NumberFormatException e2) {
                        c.d.d.e.a.b("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + parse.toString(), e2);
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        return false;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
            } catch (Exception e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Could not get video metadata for ";
                sb.append(str);
                sb.append(parse.toString());
                c.d.d.e.a.b("ReactNative", sb.toString(), e);
                return false;
            }
        }
        if (f2 <= 0.0f || f3 <= 0.0f) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(parse, "r");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), null, options);
                float f4 = options.outWidth;
                float f5 = options.outHeight;
                openAssetFileDescriptor2.close();
                f3 = f5;
                f2 = f4;
            } catch (IOException e4) {
                e = e4;
                sb = new StringBuilder();
                str = "Could not get width/height for ";
                sb.append(str);
                sb.append(parse.toString());
                c.d.d.e.a.b("ReactNative", sb.toString(), e);
                return false;
            }
        }
        writableNativeMap.putDouble("width", f2);
        writableNativeMap.putDouble("height", f3);
        writableMap.putMap("image", writableNativeMap);
        return true;
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        double d2 = cursor.getDouble(i);
        double d3 = cursor.getDouble(i2);
        if (d2 > 0.0d || d3 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("longitude", d2);
            writableNativeMap.putDouble("latitude", d3);
            writableMap.putMap("location", writableNativeMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("has_next_page", i < cursor.getCount());
        if (i < cursor.getCount()) {
            cursor.moveToPosition(i - 1);
            writableNativeMap.putString("end_cursor", cursor.getString(cursor.getColumnIndex("datetaken")));
        }
        writableMap.putMap("page_info", writableNativeMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        int i = readableMap.getInt("first");
        String string = readableMap.hasKey("after") ? readableMap.getString("after") : null;
        String string2 = readableMap.hasKey("groupName") ? readableMap.getString("groupName") : null;
        String string3 = readableMap.hasKey("assetType") ? readableMap.getString("assetType") : ASSET_TYPE_PHOTOS;
        Integer valueOf = readableMap.hasKey("maxSize") ? Integer.valueOf(readableMap.getInt("maxSize")) : null;
        ReadableArray array = readableMap.hasKey("mimeTypes") ? readableMap.getArray("mimeTypes") : null;
        if (!readableMap.hasKey("groupTypes")) {
            new b(getReactApplicationContext(), i, string, string2, array, string3, valueOf, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new JSApplicationIllegalArgumentException("groupTypes is not supported on Android");
    }

    @ReactMethod
    public void saveToCameraRoll(String str, String str2, Promise promise) {
        new c(getReactApplicationContext(), Uri.parse(str), promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
