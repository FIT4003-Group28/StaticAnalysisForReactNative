package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: eaiy  reason: default package */
/* loaded from: classes6.dex */
final class eaiy extends InputStream {
    final /* synthetic */ eaiz a;

    public eaiy(eaiz eaizVar) {
        this.a = eaizVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.a.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read() {
        eaiz eaizVar = this.a;
        if (eaizVar.b > 0) {
            return eaizVar.h() & 255;
        }
        return -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(".inputStream()");
        return sb.toString();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.y(bArr, i, i2);
    }
}
