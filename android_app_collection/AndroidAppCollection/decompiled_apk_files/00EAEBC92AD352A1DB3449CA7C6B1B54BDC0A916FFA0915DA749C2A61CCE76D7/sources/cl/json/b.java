package cl.json;

import android.app.Application;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<String> f4930a = new ArrayList<>();

    public static Uri a(ReactContext reactContext, File file) {
        a(reactContext);
        String authority = Uri.fromFile(file).getAuthority();
        if ((TextUtils.isEmpty(authority) || !f4930a.contains(authority)) && !file.getAbsolutePath().startsWith("content://")) {
            Uri uri = null;
            for (int i = 0; i < f4930a.size(); i++) {
                try {
                    uri = a.g.e.c.a(reactContext, f4930a.get(i), file);
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("RNSharePathUtil::compatUriFromFile ERROR " + e2.getMessage());
                }
                if (uri != null) {
                    break;
                }
            }
            return uri;
        }
        return Uri.fromFile(file);
    }

    public static String a(Context context, Uri uri) {
        Uri uri2 = null;
        if (Build.VERSION.SDK_INT < 19 || !DocumentsContract.isDocumentUri(context, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (c(uri)) {
                    return uri.getLastPathSegment();
                }
                return "" + a(context, uri, null, null);
            } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        } else if (b(uri)) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            String str = split[0];
            if ("primary".equalsIgnoreCase(str) || "0".equalsIgnoreCase(str)) {
                return "" + Environment.getExternalStorageDirectory() + "/" + split[1];
            } else if ("raw".equalsIgnoreCase(str)) {
                return "" + split[1];
            } else if (!TextUtils.isEmpty(str)) {
                return "/storage/" + str + "/" + split[1];
            }
        } else if (a(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (documentId.startsWith("raw:")) {
                return "" + documentId.replaceFirst("raw:", "");
            }
            Uri withAppendedId = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue());
            return "" + a(context, withAppendedId, null, null);
        } else if (d(uri)) {
            String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
            String str2 = split2[0];
            if ("image".equals(str2)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str2)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str2)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            } else if ("raw".equalsIgnoreCase(str2)) {
                return "" + split2[1];
            }
            String[] strArr = {split2[1]};
            return "" + a(context, uri2, "_id=?", strArr);
        }
        return null;
    }

    public static String a(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor;
        try {
            cursor = new a.n.b.b(context, uri, new String[]{"_data"}, str, strArr, null).mo18y();
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    public static void a(ReactContext reactContext) {
        if (f4930a.size() == 0) {
            Application application = (Application) reactContext.getApplicationContext();
            if (application instanceof c) {
                f4930a.add(((c) application).a());
            }
            ArrayList<String> arrayList = f4930a;
            arrayList.add(reactContext.getPackageName() + ".rnshare.fileprovider");
        }
    }

    public static boolean a(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean b(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean c(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean d(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
