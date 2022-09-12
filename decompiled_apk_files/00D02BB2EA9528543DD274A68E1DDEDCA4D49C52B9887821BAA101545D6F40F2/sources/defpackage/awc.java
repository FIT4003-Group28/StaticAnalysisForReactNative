package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
/* compiled from: PG */
/* renamed from: awc  reason: default package */
/* loaded from: classes3.dex */
final class awc implements SQLiteDatabase.CursorFactory {
    final /* synthetic */ awb a;

    public awc(awb awbVar) {
        this.a = awbVar;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.a.e(new awi(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
