package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ctir  reason: default package */
/* loaded from: classes5.dex */
public final class ctir {
    private final SQLiteOpenHelper a;

    public ctir(SQLiteOpenHelper sQLiteOpenHelper) {
        this.a = sQLiteOpenHelper;
    }

    private static final String i(Uri uri) {
        return uri.getPathSegments().get(1);
    }

    public final Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, String str3) {
        return this.a.getReadableDatabase().query(i(uri), strArr, str, strArr2, null, null, str2, str3);
    }

    public final long b(Uri uri, ContentValues contentValues, int i) {
        return this.a.getWritableDatabase().insertWithOnConflict(i(uri), null, contentValues, i);
    }

    public final int c(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.a.getWritableDatabase().update(i(uri), contentValues, str, strArr);
    }

    public final int d(Uri uri, String str, String[] strArr) {
        return this.a.getWritableDatabase().delete(i(uri), str, strArr);
    }

    public final void e() {
        this.a.getWritableDatabase().beginTransaction();
    }

    public final void f() {
        this.a.getWritableDatabase().endTransaction();
    }

    public final boolean g() {
        return this.a.getWritableDatabase().inTransaction();
    }

    public final void h() {
        this.a.getWritableDatabase().setTransactionSuccessful();
    }
}
