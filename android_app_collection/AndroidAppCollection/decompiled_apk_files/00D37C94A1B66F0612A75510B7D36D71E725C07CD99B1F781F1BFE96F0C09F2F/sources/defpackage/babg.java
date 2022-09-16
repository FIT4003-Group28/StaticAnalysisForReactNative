package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: babg  reason: default package */
/* loaded from: classes2.dex */
final class babg extends InputStream {
    final /* synthetic */ babh a;

    public babg(babh babhVar) {
        this.a = babhVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        babh babhVar = this.a;
        if (babhVar.c) {
            throw new IOException("closed");
        }
        return (int) Math.min(babhVar.a.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        babh babhVar = this.a;
        if (!babhVar.c) {
            baay baayVar = babhVar.a;
            if (baayVar.b != 0 || babhVar.b.e(baayVar, 8192L) != -1) {
                return this.a.a.b() & 255;
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
        babm.a(bArr.length, i, i2);
        babh babhVar = this.a;
        baay baayVar = babhVar.a;
        if (baayVar.b != 0 || babhVar.b.e(baayVar, 8192L) != -1) {
            return this.a.a.c(bArr, i, i2);
        }
        return -1;
    }
}
