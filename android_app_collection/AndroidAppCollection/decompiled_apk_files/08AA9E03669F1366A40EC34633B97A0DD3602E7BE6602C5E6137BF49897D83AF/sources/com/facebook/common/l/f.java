package com.facebook.common.l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
/* compiled from: UriUtil.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2328a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo").getPath();

    public static boolean a(Uri uri) {
        String j = j(uri);
        return "https".equals(j) || "http".equals(j);
    }

    public static boolean b(Uri uri) {
        return "file".equals(j(uri));
    }

    public static boolean c(Uri uri) {
        return "content".equals(j(uri));
    }

    public static boolean d(Uri uri) {
        return c(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(f2328a);
    }

    public static boolean e(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean f(Uri uri) {
        return "asset".equals(j(uri));
    }

    public static boolean g(Uri uri) {
        return "res".equals(j(uri));
    }

    public static boolean h(Uri uri) {
        return "android.resource".equals(j(uri));
    }

    public static boolean i(Uri uri) {
        return DataBufferSafeParcelable.DATA_FIELD.equals(j(uri));
    }

    public static String j(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static String a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor;
        int columnIndex;
        String str = null;
        if (c(uri)) {
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
        } else if (!b(uri)) {
            return null;
        } else {
            return uri.getPath();
        }
    }

    public static Uri a(int i) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i)).build();
    }
}
