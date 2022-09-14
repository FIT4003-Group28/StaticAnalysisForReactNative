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
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.j;
import com.facebook.react.bridge.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import ezvcard.property.Kind;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class CameraRollManager extends ReactContextBaseJavaModule {
    private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
    private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
    private static final String ERROR_UNABLE_TO_SAVE = "E_UNABLE_TO_SAVE";
    public static final boolean IS_JELLY_BEAN_OR_LATER;
    protected static final String NAME = "CameraRollManager";
    private static final String[] PROJECTION;
    private static final String SELECTION_BUCKET = "bucket_display_name = ?";
    private static final String SELECTION_DATE_TAKEN = "datetaken < ?";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    static {
        IS_JELLY_BEAN_OR_LATER = Build.VERSION.SDK_INT >= 16;
        if (IS_JELLY_BEAN_OR_LATER) {
            PROJECTION = new String[]{"_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", "longitude", "latitude"};
        } else {
            PROJECTION = new String[]{"_id", "mime_type", "bucket_display_name", "datetaken", "longitude", "latitude"};
        }
    }

    public CameraRollManager(ah ahVar) {
        super(ahVar);
    }

    @al
    public void saveToCameraRoll(String str, String str2, af afVar) {
        new b(getReactApplicationContext(), Uri.parse(str), afVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* loaded from: classes.dex */
    private static class b extends j<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3487a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f3488b;

        /* renamed from: c  reason: collision with root package name */
        private final af f3489c;

        public b(aj ajVar, Uri uri, af afVar) {
            super(ajVar);
            this.f3487a = ajVar;
            this.f3488b = uri;
            this.f3489c = afVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.j
        /* renamed from: a */
        public void b(Void... voidArr) {
            FileChannel fileChannel;
            File externalStoragePublicDirectory;
            String str;
            int i;
            File file = new File(this.f3488b.getPath());
            FileChannel fileChannel2 = null;
            try {
                try {
                    externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                    externalStoragePublicDirectory.mkdirs();
                } catch (IOException e) {
                    com.facebook.common.e.a.b("ReactNative", "Could not close output channel", e);
                    return;
                }
            } catch (IOException e2) {
                e = e2;
                fileChannel = null;
            } catch (Throwable th) {
                th = th;
                fileChannel = null;
            }
            if (!externalStoragePublicDirectory.isDirectory()) {
                this.f3489c.a(CameraRollManager.ERROR_UNABLE_TO_LOAD, "External media storage directory not available");
                return;
            }
            File file2 = new File(externalStoragePublicDirectory, file.getName());
            String name = file.getName();
            if (name.indexOf(46) >= 0) {
                String substring = name.substring(0, name.lastIndexOf(46));
                i = 0;
                str = name.substring(name.lastIndexOf(46));
                name = substring;
            } else {
                str = "";
                i = 0;
            }
            while (!file2.createNewFile()) {
                file2 = new File(externalStoragePublicDirectory, name + b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR + i + str);
                i++;
            }
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                fileChannel = new FileOutputStream(file2).getChannel();
                try {
                    fileChannel.transferFrom(channel, 0L, channel.size());
                    channel.close();
                    fileChannel.close();
                    MediaScannerConnection.scanFile(this.f3487a, new String[]{file2.getAbsolutePath()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.facebook.react.modules.camera.CameraRollManager.b.1
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public void onScanCompleted(String str2, Uri uri) {
                            if (uri != null) {
                                b.this.f3489c.a((Object) uri.toString());
                            } else {
                                b.this.f3489c.a(CameraRollManager.ERROR_UNABLE_TO_SAVE, "Could not add image to gallery");
                            }
                        }
                    });
                    if (channel != null && channel.isOpen()) {
                        try {
                            channel.close();
                        } catch (IOException e3) {
                            com.facebook.common.e.a.b("ReactNative", "Could not close input channel", e3);
                        }
                    }
                } catch (IOException e4) {
                    fileChannel2 = channel;
                    e = e4;
                    try {
                        this.f3489c.a((Throwable) e);
                        if (fileChannel2 != null && fileChannel2.isOpen()) {
                            try {
                                fileChannel2.close();
                            } catch (IOException e5) {
                                com.facebook.common.e.a.b("ReactNative", "Could not close input channel", e5);
                            }
                        }
                        if (fileChannel == null || !fileChannel.isOpen()) {
                            return;
                        }
                        fileChannel.close();
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileChannel2 != null && fileChannel2.isOpen()) {
                            try {
                                fileChannel2.close();
                            } catch (IOException e6) {
                                com.facebook.common.e.a.b("ReactNative", "Could not close input channel", e6);
                            }
                        }
                        if (fileChannel != null && fileChannel.isOpen()) {
                            try {
                                fileChannel.close();
                            } catch (IOException e7) {
                                com.facebook.common.e.a.b("ReactNative", "Could not close output channel", e7);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    fileChannel2 = channel;
                    th = th3;
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    throw th;
                }
            } catch (IOException e8) {
                fileChannel2 = channel;
                e = e8;
                fileChannel = null;
            } catch (Throwable th4) {
                fileChannel2 = channel;
                th = th4;
                fileChannel = null;
            }
            if (fileChannel == null || !fileChannel.isOpen()) {
                return;
            }
            fileChannel.close();
        }
    }

    @al
    public void getPhotos(an anVar, af afVar) {
        int i = anVar.getInt("first");
        String string = anVar.hasKey("after") ? anVar.getString("after") : null;
        String string2 = anVar.hasKey("groupName") ? anVar.getString("groupName") : null;
        String string3 = anVar.hasKey("assetType") ? anVar.getString("assetType") : null;
        am e = anVar.hasKey("mimeTypes") ? anVar.e("mimeTypes") : null;
        if (anVar.hasKey("groupTypes")) {
            throw new n("groupTypes is not supported on Android");
        }
        new a(getReactApplicationContext(), i, string, string2, e, string3, afVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* loaded from: classes.dex */
    private static class a extends j<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3483a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3484b;

        /* renamed from: c  reason: collision with root package name */
        private final String f3485c;

        /* renamed from: d  reason: collision with root package name */
        private final String f3486d;
        private final am e;
        private final af f;
        private final String g;

        private a(aj ajVar, int i, String str, String str2, am amVar, String str3, af afVar) {
            super(ajVar);
            this.f3483a = ajVar;
            this.f3484b = i;
            this.f3485c = str;
            this.f3486d = str2;
            this.e = amVar;
            this.f = afVar;
            this.g = str3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.j
        /* renamed from: a */
        public void b(Void... voidArr) {
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f3485c)) {
                sb.append(" AND datetaken < ?");
                arrayList.add(this.f3485c);
            }
            if (!TextUtils.isEmpty(this.f3486d)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.f3486d);
            }
            if (this.e != null && this.e.size() > 0) {
                sb.append(" AND mime_type IN (");
                for (int i = 0; i < this.e.size(); i++) {
                    sb.append("?,");
                    arrayList.add(this.e.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), ")");
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.f3483a.getContentResolver();
            try {
                Uri uri = (this.g == null || !this.g.equals("Videos")) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                String[] strArr = CameraRollManager.PROJECTION;
                String sb2 = sb.toString();
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                Cursor query = contentResolver.query(uri, strArr, sb2, strArr2, "datetaken DESC, date_modified DESC LIMIT " + (this.f3484b + 1));
                if (query != null) {
                    CameraRollManager.putEdges(contentResolver, query, writableNativeMap, this.f3484b, this.g);
                    CameraRollManager.putPageInfo(query, writableNativeMap, this.f3484b);
                    query.close();
                    this.f.a(writableNativeMap);
                    return;
                }
                this.f.a(CameraRollManager.ERROR_UNABLE_TO_LOAD, "Could not get photos");
            } catch (SecurityException e) {
                this.f.a(CameraRollManager.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get photos: need READ_EXTERNAL_STORAGE permission", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putPageInfo(Cursor cursor, ar arVar, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("has_next_page", i < cursor.getCount());
        if (i < cursor.getCount()) {
            cursor.moveToPosition(i - 1);
            writableNativeMap.putString("end_cursor", cursor.getString(cursor.getColumnIndex("datetaken")));
        }
        arVar.a("page_info", writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putEdges(ContentResolver contentResolver, Cursor cursor, ar arVar, int i, String str) {
        WritableNativeArray writableNativeArray;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex("mime_type");
        int columnIndex3 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor.getColumnIndex("datetaken");
        int columnIndex5 = IS_JELLY_BEAN_OR_LATER ? cursor.getColumnIndex("width") : -1;
        int columnIndex6 = IS_JELLY_BEAN_OR_LATER ? cursor.getColumnIndex("height") : -1;
        int columnIndex7 = cursor.getColumnIndex("longitude");
        int columnIndex8 = cursor.getColumnIndex("latitude");
        int i2 = i;
        int i3 = 0;
        while (i3 < i2 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableNativeArray writableNativeArray3 = writableNativeArray2;
            int i4 = i3;
            int i5 = columnIndex;
            int i6 = columnIndex8;
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, columnIndex, columnIndex5, columnIndex6, str)) {
                putBasicNodeInfo(cursor, writableNativeMap2, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor, writableNativeMap2, columnIndex7, i6);
                writableNativeMap.a("node", writableNativeMap2);
                writableNativeArray = writableNativeArray3;
                writableNativeArray.a(writableNativeMap);
            } else {
                writableNativeArray = writableNativeArray3;
                i4--;
            }
            cursor.moveToNext();
            i3 = i4 + 1;
            i2 = i;
            writableNativeArray2 = writableNativeArray;
            columnIndex8 = i6;
            columnIndex = i5;
        }
        arVar.a("edges", writableNativeArray2);
    }

    private static void putBasicNodeInfo(Cursor cursor, ar arVar, int i, int i2, int i3) {
        arVar.putString("type", cursor.getString(i));
        arVar.putString("group_name", cursor.getString(i2));
        arVar.putDouble("timestamp", cursor.getLong(i3) / 1000.0d);
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, ar arVar, int i, int i2, int i3, String str) {
        Uri withAppendedPath;
        float f;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str != null && str.equals("Videos")) {
            withAppendedPath = Uri.withAppendedPath(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, cursor.getString(i));
        } else {
            withAppendedPath = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, cursor.getString(i));
        }
        writableNativeMap.putString("uri", withAppendedPath.toString());
        float f2 = -1.0f;
        if (IS_JELLY_BEAN_OR_LATER) {
            f2 = cursor.getInt(i2);
            f = cursor.getInt(i3);
        } else {
            f = -1.0f;
        }
        if (str != null && str.equals("Videos") && Build.VERSION.SDK_INT >= 10) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(withAppendedPath, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                if (f2 <= BitmapDescriptorFactory.HUE_RED || f <= BitmapDescriptorFactory.HUE_RED) {
                    try {
                        float parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                        f2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        f = parseInt;
                    } catch (NumberFormatException e) {
                        com.facebook.common.e.a.b("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + withAppendedPath.toString(), e);
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        return false;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / NetstatsParserPatterns.NEW_TS_TO_MILLIS);
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
            } catch (IOException e2) {
                com.facebook.common.e.a.b("ReactNative", "Could not get video metadata for " + withAppendedPath.toString(), e2);
                return false;
            }
        }
        if (f2 <= BitmapDescriptorFactory.HUE_RED || f <= BitmapDescriptorFactory.HUE_RED) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(withAppendedPath, "r");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), null, options);
                f2 = options.outWidth;
                f = options.outHeight;
                openAssetFileDescriptor2.close();
            } catch (IOException e3) {
                com.facebook.common.e.a.b("ReactNative", "Could not get width/height for " + withAppendedPath.toString(), e3);
                return false;
            }
        }
        writableNativeMap.putDouble("width", f2);
        writableNativeMap.putDouble("height", f);
        arVar.a("image", writableNativeMap);
        return true;
    }

    private static void putLocationInfo(Cursor cursor, ar arVar, int i, int i2) {
        double d2 = cursor.getDouble(i);
        double d3 = cursor.getDouble(i2);
        if (d2 > 0.0d || d3 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("longitude", d2);
            writableNativeMap.putDouble("latitude", d3);
            arVar.a(Kind.LOCATION, writableNativeMap);
        }
    }
}
