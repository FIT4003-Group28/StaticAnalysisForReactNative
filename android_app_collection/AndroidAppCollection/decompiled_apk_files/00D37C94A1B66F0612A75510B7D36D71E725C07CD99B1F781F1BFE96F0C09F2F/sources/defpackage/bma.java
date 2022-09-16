package defpackage;

import android.database.sqlite.SQLiteProgram;
/* compiled from: PG */
/* renamed from: bma  reason: default package */
/* loaded from: classes2.dex */
public class bma implements bls {
    public final SQLiteProgram a;

    public bma(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.bls
    public final void c(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.bls
    public final void d(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.bls
    public final void e(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.bls
    public final void f(int i, String str) {
        this.a.bindString(i, str);
    }
}
