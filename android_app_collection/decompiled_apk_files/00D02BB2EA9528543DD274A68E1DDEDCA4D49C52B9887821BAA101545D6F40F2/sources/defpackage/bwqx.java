package defpackage;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: bwqx  reason: default package */
/* loaded from: classes.dex */
final class bwqx extends bvjw {
    public bwqx(Application application, afec afecVar) {
        super(application, afecVar, "gmm_storage.db", 4);
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS gmm_storage_table;");
        d(sQLiteDatabase);
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder(105);
        sb.append("CREATE TABLE gmm_storage_table (_key_pri TEXT, _key_sec TEXT,_data BLOB,");
        sb.append("");
        sb.append("");
        sb.append("PRIMARY KEY(");
        sb.append("_key_pri");
        sb.append(", ");
        sb.append("_key_sec");
        sb.append("));");
        sQLiteDatabase.execSQL(sb.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
    }
}
