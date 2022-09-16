package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aork  reason: default package */
/* loaded from: classes.dex */
final class aork extends InputStream {
    final /* synthetic */ aorl a;
    private aorj b;
    private aony c;
    private int d;
    private int e;
    private int f;
    private int g;

    public aork(aorl aorlVar) {
        this.a = aorlVar;
        d();
    }

    private final int a() {
        return this.a.d - (this.f + this.e);
    }

    private final int b(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            c();
            if (this.c == null) {
                break;
            }
            int min = Math.min(this.d - this.e, i3);
            if (bArr != null) {
                this.c.G(bArr, this.e, i, min);
                i += min;
            }
            this.e += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    private final void c() {
        if (this.c != null) {
            int i = this.e;
            int i2 = this.d;
            if (i != i2) {
                return;
            }
            this.f += i2;
            int i3 = 0;
            this.e = 0;
            if (this.b.hasNext()) {
                aony mo416next = this.b.mo416next();
                this.c = mo416next;
                i3 = mo416next.d();
            } else {
                this.c = null;
            }
            this.d = i3;
        }
    }

    private final void d() {
        aorj aorjVar = new aorj(this.a);
        this.b = aorjVar;
        aony mo416next = aorjVar.mo416next();
        this.c = mo416next;
        this.d = mo416next.d();
        this.e = 0;
        this.f = 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        return a();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.g = this.f + this.e;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        c();
        aony aonyVar = this.c;
        if (aonyVar == null) {
            return -1;
        }
        int i = this.e;
        this.e = i + 1;
        return aonyVar.a(i) & 255;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        d();
        b(null, 0, this.g);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return b(null, 0, (int) j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int b = b(bArr, i, i2);
        return b == 0 ? (i2 > 0 || a() == 0) ? -1 : 0 : b;
    }
}
