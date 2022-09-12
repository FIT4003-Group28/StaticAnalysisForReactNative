package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: boko  reason: default package */
/* loaded from: classes3.dex */
public final class boko extends bvjw {
    public boko(Context context, afec afecVar) {
        super(context, afecVar, "editsPublished.db", 1);
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE edits;");
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table edits(_id integer primary key autoincrement, account_id text not null, feature_id text not null, seen boolean not null, created_at long not null, edit blob not null); ");
        sQLiteDatabase.execSQL("create index account_idx on edits(account_id);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
        d(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        c(sQLiteDatabase);
        d(sQLiteDatabase);
    }
}
