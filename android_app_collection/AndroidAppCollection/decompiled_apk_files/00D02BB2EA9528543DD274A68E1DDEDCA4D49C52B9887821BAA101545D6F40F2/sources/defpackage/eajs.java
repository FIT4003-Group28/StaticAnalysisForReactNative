package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: eajs  reason: default package */
/* loaded from: classes6.dex */
final class eajs extends InputStream {
    final /* synthetic */ eajt a;

    public eajs(eajt eajtVar) {
        this.a = eajtVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        eajt eajtVar = this.a;
        if (!eajtVar.c) {
            return (int) Math.min(eajtVar.a.b, 2147483647L);
        }
        throw new IOException("closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        eajt eajtVar = this.a;
        if (!eajtVar.c) {
            eaiz eaizVar = eajtVar.a;
            if (eaizVar.b != 0 || eajtVar.b.Te(eaizVar, 8192L) != -1) {
                return this.a.a.h() & 255;
            }
            return -1;
        }
        throw new IOException("closed");
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
        if (this.a.c) {
            throw new IOException("closed");
        }
        eakb.a(bArr.length, i, i2);
        eajt eajtVar = this.a;
        eaiz eaizVar = eajtVar.a;
        if (eaizVar.b != 0 || eajtVar.b.Te(eaizVar, 8192L) != -1) {
            return this.a.a.y(bArr, i, i2);
        }
        return -1;
    }
}
