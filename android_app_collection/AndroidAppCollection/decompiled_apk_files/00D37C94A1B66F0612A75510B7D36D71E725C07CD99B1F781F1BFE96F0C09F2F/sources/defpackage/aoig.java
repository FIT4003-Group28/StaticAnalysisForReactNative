package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
/* compiled from: PG */
/* renamed from: aoig  reason: default package */
/* loaded from: classes.dex */
public final class aoig extends SQLiteOpenHelper {
    private static final amzy a = amzy.l("com/google/mediapipe/framework/AssetCacheDbHelper");

    public aoig(Context context) {
        super(context, "drishti.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    public static final Cursor a(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String[] strArr2) {
        return sQLiteDatabase.query("AssetVersion", strArr, str, strArr2, null, null, null);
    }

    public static final void b(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        Cursor a2 = a(sQLiteDatabase, new String[]{"cache_path"}, str, strArr);
        if (a2.moveToFirst()) {
            do {
                String string = a2.getString(a2.getColumnIndexOrThrow("cache_path"));
                File file = new File(string);
                if (file.exists() && !file.delete()) {
                    ((amzw) ((amzw) a.g()).i("com/google/mediapipe/framework/AssetCacheDbHelper", "removeCachedFiles", 168, "AssetCacheDbHelper.java")).s("Stale cached file: %s can't be deleted.", string);
                }
            } while (a2.moveToNext());
            a2.close();
        }
        a2.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE AssetVersion (_id INTEGER PRIMARY KEY,asset TEXT NOT NULL UNIQUE,cache_path TEXT,version INTEGER )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS AssetVersion");
        onCreate(sQLiteDatabase);
    }
}
