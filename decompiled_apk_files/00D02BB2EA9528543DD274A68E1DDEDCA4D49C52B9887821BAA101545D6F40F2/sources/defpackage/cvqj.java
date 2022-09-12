package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: cvqj  reason: default package */
/* loaded from: classes5.dex */
final class cvqj extends SQLiteOpenHelper {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cvqj(android.content.Context r3, long r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 55
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "_optimized_threads.notifications.db"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 0
            r0 = 2
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvqj.<init>(android.content.Context, long):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        cvlw.a("OptimizedThreadSQLiteHelper", "Creating SQLite Database [%s]", getDatabaseName());
        sQLiteDatabase.execSQL("CREATE TABLE optimized_threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,last_updated__version INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),schedule BLOB);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        cvlw.a("OptimizedThreadSQLiteHelper", "Upgrading SQLite Database [%s], from version [%d] to [%d]", getDatabaseName(), Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS optimized_threads");
            sQLiteDatabase.execSQL("CREATE TABLE optimized_threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,last_updated__version INTEGER NOT NULL DEFAULT(0),thread_stored_timestamp INTEGER NOT NULL DEFAULT(0),schedule BLOB);");
        }
    }
}
