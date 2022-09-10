package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: cjvt  reason: default package */
/* loaded from: classes.dex */
final class cjvt extends bvjw {
    public cjvt(Context context, afec afecVar) {
        super(context, afecVar, "ue3.db", 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        cjvv.c(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        cjvv.d(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        cjvv.d(sQLiteDatabase);
    }
}
