package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* compiled from: PG */
/* renamed from: cvqb  reason: default package */
/* loaded from: classes5.dex */
public final class cvqb extends SQLiteOpenHelper {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cvqb(android.content.Context r3, long r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 52
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "_thread_surveys.notifications.db"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5 = 0
            r0 = 1
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvqb.<init>(android.content.Context, long):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        cvlw.a("ChimeThreadSurveySQLiteHelper", "Creating SQLite Database [%s]", getDatabaseName());
        sQLiteDatabase.execSQL("CREATE TABLE thread_surveys(thread_id TEXT PRIMARY KEY NOT NULL,view_index INTEGER NOT NULL DEFAULT(0));");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        cvlw.a("ChimeThreadSurveySQLiteHelper", "Upgrading SQLite Database [%s], from version [%d] to [%d]", getDatabaseName(), Integer.valueOf(i), Integer.valueOf(i2));
    }
}
