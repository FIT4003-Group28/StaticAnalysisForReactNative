package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: cgey  reason: default package */
/* loaded from: classes4.dex */
public final class cgey extends bvjw {
    public cgey(Context context, afec afecVar) {
        super(context, afecVar, "ugc_tasks.db", 1);
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE task_status;");
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table task_status(_id integer primary key autoincrement, account_id text not null, feature_id text not null, task_status_at_place blob not null, created_at long not null); ");
        sQLiteDatabase.execSQL("create index account_idx on task_status(account_id);");
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
