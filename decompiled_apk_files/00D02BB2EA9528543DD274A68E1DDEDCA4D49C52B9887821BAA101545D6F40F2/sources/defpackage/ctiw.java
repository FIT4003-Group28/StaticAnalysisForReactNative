package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: ctiw  reason: default package */
/* loaded from: classes5.dex */
public final class ctiw {
    private static final String[] a = {"name"};

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    public static String[] b(String str, String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = a(str, strArr[i]);
        }
        return strArr2;
    }

    public static String[] c(String[]... strArr) {
        int i = 0;
        for (String[] strArr2 : strArr) {
            i += strArr2.length;
        }
        String[] strArr3 = new String[i];
        int i2 = 0;
        for (String[] strArr4 : strArr) {
            int length = strArr4.length;
            System.arraycopy(strArr4, 0, strArr3, i2, length);
            i2 += length;
        }
        return strArr3;
    }

    public static void d(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", a, "type='view'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    try {
                        String valueOf = String.valueOf(string);
                        sQLiteDatabase.execSQL(valueOf.length() != 0 ? "DROP VIEW IF EXISTS ".concat(valueOf) : new String("DROP VIEW IF EXISTS "));
                    } catch (SQLiteException unused) {
                        if (String.valueOf(string).length() == 0) {
                            new String("View drop failure");
                        }
                        cstl.a("TableUtils");
                    }
                } finally {
                }
            }
            query.close();
        }
        query = sQLiteDatabase.query("sqlite_master", a, "type='index'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string2 = query.getString(0);
                    try {
                        String valueOf2 = String.valueOf(string2);
                        sQLiteDatabase.execSQL(valueOf2.length() != 0 ? "DROP INDEX IF EXISTS ".concat(valueOf2) : new String("DROP INDEX IF EXISTS "));
                    } catch (SQLiteException unused2) {
                        if (String.valueOf(string2).length() == 0) {
                            new String("Index drop failure");
                        }
                        cstl.a("TableUtils");
                    }
                } finally {
                }
            }
        }
        query = sQLiteDatabase.query("sqlite_master", a, "type='table'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string3 = query.getString(0);
                    if (!string3.startsWith("android_") && !string3.startsWith("sqlite_")) {
                        e(sQLiteDatabase, string3);
                    }
                } finally {
                }
            }
        }
    }

    public static void e(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            String valueOf = String.valueOf(str);
            sQLiteDatabase.execSQL(valueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(valueOf) : new String("DROP TABLE IF EXISTS "));
        } catch (SQLiteException unused) {
            if (String.valueOf(str).length() == 0) {
                new String("Table drop failure ");
            }
            cstl.a("TableUtils");
        }
    }

    public static Uri f(String str, String str2, String str3, String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(str);
        builder.appendEncodedPath(str2);
        builder.appendEncodedPath(str3);
        for (String str4 : strArr) {
            builder.appendEncodedPath(str4);
        }
        return builder.build();
    }

    public static void g(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        h(sQLiteDatabase, str, str2, null);
    }

    public static void h(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr) {
        String sb;
        String concat = str.concat("_backup");
        StringBuilder sb2 = new StringBuilder(str.length() + 23 + String.valueOf(concat).length());
        sb2.append("ALTER TABLE ");
        sb2.append(str);
        sb2.append(" RENAME TO ");
        sb2.append(concat);
        sQLiteDatabase.execSQL(sb2.toString());
        sQLiteDatabase.execSQL(str2);
        String h = strArr == null ? "*" : dbrz.e(", ").j().h(strArr);
        if (strArr == null) {
            sb = "";
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(h).length() + 3);
            sb3.append(" (");
            sb3.append(h);
            sb3.append(")");
            sb = sb3.toString();
        }
        int length = str.length();
        StringBuilder sb4 = new StringBuilder(length + 26 + String.valueOf(sb).length() + String.valueOf(h).length() + String.valueOf(concat).length());
        sb4.append("INSERT INTO ");
        sb4.append(str);
        sb4.append(sb);
        sb4.append(" SELECT ");
        sb4.append(h);
        sb4.append(" FROM ");
        sb4.append(concat);
        sQLiteDatabase.execSQL(sb4.toString());
        String valueOf = String.valueOf(concat);
        sQLiteDatabase.execSQL(valueOf.length() != 0 ? "DROP TABLE ".concat(valueOf) : new String("DROP TABLE "));
    }

    public static String i(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Invalid size for list placeholder: ");
            sb.append(i);
            sb.toString();
            cstl.a("TableUtils");
            return "";
        }
        return TextUtils.join(",", Collections.nCopies(i, "?"));
    }
}
