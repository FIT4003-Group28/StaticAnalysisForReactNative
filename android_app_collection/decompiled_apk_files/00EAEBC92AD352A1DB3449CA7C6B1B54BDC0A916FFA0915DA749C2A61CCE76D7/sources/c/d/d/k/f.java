package c.d.d.k;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f2869a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static Uri a(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }

    public static String a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor;
        int columnIndex;
        String str = null;
        if (!f(uri)) {
            if (!g(uri)) {
                return null;
            }
            return uri.getPath();
        }
        try {
            cursor = contentResolver.query(uri, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst() && (columnIndex = cursor.getColumnIndex("_data")) != -1) {
                        str = cursor.getString(columnIndex);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor == null) {
                return str;
            }
            cursor.close();
            return str;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    public static String a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static boolean b(Uri uri) {
        return "data".equals(a(uri));
    }

    public static boolean c(Uri uri) {
        return "asset".equals(a(uri));
    }

    public static boolean d(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean e(Uri uri) {
        return f(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(f2869a.getPath());
    }

    public static boolean f(Uri uri) {
        return "content".equals(a(uri));
    }

    public static boolean g(Uri uri) {
        return "file".equals(a(uri));
    }

    public static boolean h(Uri uri) {
        return "res".equals(a(uri));
    }

    public static boolean i(Uri uri) {
        String a2 = a(uri);
        return "https".equals(a2) || "http".equals(a2);
    }

    public static boolean j(Uri uri) {
        return "android.resource".equals(a(uri));
    }

    public static URL k(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }
}
