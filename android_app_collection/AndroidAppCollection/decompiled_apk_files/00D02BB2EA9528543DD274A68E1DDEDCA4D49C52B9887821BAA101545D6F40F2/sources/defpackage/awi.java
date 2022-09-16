package defpackage;

import android.database.sqlite.SQLiteProgram;
/* compiled from: PG */
/* renamed from: awi  reason: default package */
/* loaded from: classes3.dex */
class awi implements awa {
    private final SQLiteProgram a;

    public awi(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.awa
    public final void f(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.awa
    public final void g(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.awa
    public final void h(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.awa
    public final void i(int i, String str) {
        this.a.bindString(i, str);
    }

    @Override // defpackage.awa
    public final void j(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }
}
