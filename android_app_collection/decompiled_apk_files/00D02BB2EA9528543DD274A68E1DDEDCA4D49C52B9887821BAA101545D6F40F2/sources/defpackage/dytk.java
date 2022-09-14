package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dytk  reason: default package */
/* loaded from: classes6.dex */
final class dytk extends InputStream implements dygt {
    final dytj a;

    public dytk(dytj dytjVar) {
        dbsk.t(dytjVar, "buffer");
        this.a = dytjVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.c();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.a.c() == 0) {
            return -1;
        }
        return this.a.d();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.a.c() == 0) {
            return -1;
        }
        int min = Math.min(this.a.c(), i2);
        this.a.e(bArr, i, min);
        return min;
    }
}
