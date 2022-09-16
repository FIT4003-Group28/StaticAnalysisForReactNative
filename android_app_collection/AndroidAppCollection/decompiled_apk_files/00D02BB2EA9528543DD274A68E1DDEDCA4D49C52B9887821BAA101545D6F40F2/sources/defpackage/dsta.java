package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dsta  reason: default package */
/* loaded from: classes6.dex */
final class dsta extends InputStream {
    final /* synthetic */ dstb a;
    private dssz b;
    private dsoz c;
    private int d;
    private int e;
    private int f;
    private int g;

    public dsta(dstb dstbVar) {
        this.a = dstbVar;
        b();
    }

    private final int a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            c();
            if (this.c == null) {
                break;
            }
            int min = Math.min(this.d - this.e, i3);
            if (bArr != null) {
                this.c.F(bArr, this.e, i, min);
                i += min;
            }
            this.e += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    private final void b() {
        dssz dsszVar = new dssz(this.a);
        this.b = dsszVar;
        dsoz next = dsszVar.next();
        this.c = next;
        this.d = next.c();
        this.e = 0;
        this.f = 0;
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
                dsoz next = this.b.next();
                this.c = next;
                i3 = next.c();
            } else {
                this.c = null;
            }
            this.d = i3;
        }
    }

    private final int d() {
        return this.a.d - (this.f + this.e);
    }

    @Override // java.io.InputStream
    public final int available() {
        return d();
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
        dsoz dsozVar = this.c;
        if (dsozVar == null) {
            return -1;
        }
        int i = this.e;
        this.e = i + 1;
        return dsozVar.a(i) & 255;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        b();
        a(null, 0, this.g);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return a(null, 0, (int) j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int a = a(bArr, i, i2);
        return a == 0 ? (i2 > 0 || d() == 0) ? -1 : 0 : a;
    }
}
