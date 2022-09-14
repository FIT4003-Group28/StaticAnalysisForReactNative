package com.google.android.gms.common.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.stable.zzk;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Set;
/* loaded from: classes.dex */
public final class DbUtils {
    private DbUtils() {
    }

    public static void clearDatabase(SQLiteDatabase sQLiteDatabase) {
        zza(sQLiteDatabase, "table", "sqlite_sequence", "android_metadata");
        zza(sQLiteDatabase, "trigger", new String[0]);
        zza(sQLiteDatabase, Promotion.ACTION_VIEW, new String[0]);
    }

    public static long countCurrentRowBytes(Cursor cursor) {
        return countCurrentRowBytes(cursor, Charset.forName("UTF-8"));
    }

    public static long countCurrentRowBytes(Cursor cursor, Charset charset) {
        long j;
        int length;
        long j2 = 0;
        for (int i = 0; i < cursor.getColumnCount(); i++) {
            switch (cursor.getType(i)) {
                case 0:
                case 1:
                case 2:
                    j = 4;
                    break;
                case 3:
                    length = cursor.getString(i).getBytes(charset).length;
                    j = length;
                    break;
                case 4:
                    length = cursor.getBlob(i).length;
                    j = length;
                    break;
                default:
            }
            j2 += j;
        }
        return j2;
    }

    public static long getDatabaseSize(Context context, String str) {
        try {
            File databasePath = context.getDatabasePath(str);
            if (databasePath == null) {
                return 0L;
            }
            return databasePath.length();
        } catch (SecurityException unused) {
            String valueOf = String.valueOf(str);
            Log.w("DbUtils", valueOf.length() != 0 ? "Failed to get db size for ".concat(valueOf) : new String("Failed to get db size for "));
            return 0L;
        }
    }

    public static Integer getIntegerFromCursor(Cursor cursor, int i) {
        return getIntegerFromCursor(cursor, i, null);
    }

    public static Integer getIntegerFromCursor(Cursor cursor, int i, Integer num) {
        return (i < 0 || cursor.isNull(i)) ? num : Integer.valueOf(cursor.getInt(i));
    }

    public static Long getLongFromCursor(Cursor cursor, int i) {
        return getLongFromCursor(cursor, i, null);
    }

    public static Long getLongFromCursor(Cursor cursor, int i, Long l) {
        return (i < 0 || cursor.isNull(i)) ? l : Long.valueOf(cursor.getLong(i));
    }

    public static String getStringFromCursor(Cursor cursor, int i) {
        return getStringFromCursor(cursor, i, null);
    }

    public static String getStringFromCursor(Cursor cursor, int i, String str) {
        return (i < 0 || cursor.isNull(i)) ? str : cursor.getString(i);
    }

    public static void putIntegerIntoContentValues(ContentValues contentValues, String str, Integer num) {
        if (num != null) {
            contentValues.put(str, num);
        } else {
            contentValues.putNull(str);
        }
    }

    public static void putLongIntoContentValues(ContentValues contentValues, String str, Long l) {
        if (l != null) {
            contentValues.put(str, l);
        } else {
            contentValues.putNull(str);
        }
    }

    public static void putStringIntoContentValues(ContentValues contentValues, String str, String str2) {
        if (str2 != null) {
            contentValues.put(str, str2);
        } else {
            contentValues.putNull(str);
        }
    }

    private static void zza(SQLiteDatabase sQLiteDatabase, String str, String... strArr) {
        Preconditions.checkArgument("table".equals(str) || Promotion.ACTION_VIEW.equals(str) || "trigger".equals(str));
        Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "type == ?", new String[]{str}, null, null, null);
        try {
            Set of = CollectionUtils.setOf((Object[]) strArr);
            while (query.moveToNext()) {
                String string = query.getString(0);
                if (!of.contains(string)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(string).length());
                    sb.append("DROP ");
                    sb.append(str);
                    sb.append(" '");
                    sb.append(string);
                    sb.append("'");
                    sQLiteDatabase.execSQL(sb.toString());
                }
            }
            if (query == null) {
                return;
            }
            query.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (query != null) {
                    if (th != null) {
                        try {
                            query.close();
                        } catch (Throwable th3) {
                            zzk.zza(th, th3);
                        }
                    } else {
                        query.close();
                    }
                }
                throw th2;
            }
        }
    }
}
