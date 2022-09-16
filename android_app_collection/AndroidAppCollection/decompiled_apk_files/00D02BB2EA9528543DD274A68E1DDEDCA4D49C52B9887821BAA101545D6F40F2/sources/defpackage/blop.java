package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: blop  reason: default package */
/* loaded from: classes3.dex */
final class blop extends bvjw {
    public blop(Context context, afec afecVar) {
        super(context, afecVar, "riddler.db", 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table interacted_questions(user_account_id text not null, similarity_token text not null, last_accessed_millis bigint not null, primary key (user_account_id, similarity_token));");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
