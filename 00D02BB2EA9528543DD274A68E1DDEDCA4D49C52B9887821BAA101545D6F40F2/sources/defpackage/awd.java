package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: PG */
/* renamed from: awd  reason: default package */
/* loaded from: classes3.dex */
public final class awd implements avu {
    public static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] c = new String[0];
    public final SQLiteDatabase b;

    public awd(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    @Override // defpackage.avu
    public final void a() {
        this.b.beginTransaction();
    }

    @Override // defpackage.avu
    public final void b() {
        this.b.beginTransactionNonExclusive();
    }

    @Override // defpackage.avu
    public final void c() {
        this.b.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.avu
    public final void d() {
        this.b.setTransactionSuccessful();
    }

    @Override // defpackage.avu
    public final boolean e() {
        return this.b.inTransaction();
    }

    @Override // defpackage.avu
    public final Cursor f(String str) {
        return g(new avt(str));
    }

    @Override // defpackage.avu
    public final Cursor g(awb awbVar) {
        return this.b.rawQueryWithFactory(new awc(awbVar), awbVar.d(), c, null);
    }

    @Override // defpackage.avu
    public final void h(String str) {
        this.b.execSQL(str);
    }

    @Override // defpackage.avu
    public final boolean i() {
        return this.b.isOpen();
    }

    @Override // defpackage.avu
    public final String j() {
        return this.b.getPath();
    }

    @Override // defpackage.avu
    public final boolean k() {
        return this.b.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.avu
    public final awj l(String str) {
        return new awj(this.b.compileStatement(str));
    }

    @Override // defpackage.avu
    public final void m(Object[] objArr) {
        this.b.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
