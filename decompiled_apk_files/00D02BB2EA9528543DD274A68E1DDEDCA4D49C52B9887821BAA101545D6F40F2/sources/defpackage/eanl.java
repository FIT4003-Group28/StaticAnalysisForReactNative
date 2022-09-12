package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
/* compiled from: PG */
/* renamed from: eanl  reason: default package */
/* loaded from: classes6.dex */
abstract class eanl extends Reader {
    protected final eanm a;
    protected InputStream b;
    protected byte[] c;
    protected int d;
    protected int e;
    protected char[] f = null;

    /* JADX INFO: Access modifiers changed from: protected */
    public eanl(eanm eanmVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.a = eanmVar;
        this.b = inputStream;
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void b() {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    public final void a() {
        byte[] bArr = this.c;
        if (bArr != null) {
            this.c = null;
            this.a.c(bArr);
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            this.b = null;
            a();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.f == null) {
            this.f = new char[1];
        }
        if (read(this.f, 0, 1) <= 0) {
            return -1;
        }
        return this.f[0];
    }
}
