package defpackage;

import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aykm  reason: default package */
/* loaded from: classes2.dex */
public final class aykm extends InputStream implements axzx {
    private final aykl a;

    public aykm(aykl ayklVar) {
        ayklVar.getClass();
        this.a = ayklVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((ayey) this.a).a;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.b();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read() {
        aykl ayklVar = this.a;
        if (((ayey) ayklVar).a == 0) {
            return -1;
        }
        return ayklVar.e();
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.c();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int min = (int) Math.min(((ayey) this.a).a, j);
        this.a.l(min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = ((ayey) this.a).a;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i3, i2);
        this.a.k(bArr, i, min);
        return min;
    }
}
