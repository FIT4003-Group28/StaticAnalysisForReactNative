package defpackage;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dstb  reason: default package */
/* loaded from: classes.dex */
public final class dstb extends dspd {
    static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public static final /* synthetic */ int h = 0;
    private static final long serialVersionUID = 1;
    public final int d;
    public final dspd e;
    public final dspd f;
    public final int g;
    private final int i;

    public dstb(dspd dspdVar, dspd dspdVar2) {
        this.e = dspdVar;
        this.f = dspdVar2;
        int c = dspdVar.c();
        this.i = c;
        this.d = c + dspdVar2.c();
        this.g = Math.max(dspdVar.f(), dspdVar2.f()) + 1;
    }

    public static dspd d(dspd dspdVar, dspd dspdVar2) {
        int c = dspdVar.c();
        int c2 = dspdVar2.c();
        byte[] bArr = new byte[c + c2];
        dspdVar.F(bArr, 0, 0, c);
        dspdVar2.F(bArr, 0, c, c2);
        return dspd.y(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.dspd
    public final byte a(int i) {
        N(i, this.d);
        return b(i);
    }

    @Override // defpackage.dspd
    public final byte b(int i) {
        int i2 = this.i;
        if (i < i2) {
            return this.e.b(i);
        }
        return this.f.b(i - i2);
    }

    @Override // defpackage.dspd
    public final int c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dspd
    public final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.i;
        if (i + i3 <= i4) {
            this.e.e(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.f.e(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.e.e(bArr, i, i2, i5);
            this.f.e(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // defpackage.dspd
    public final boolean equals(Object obj) {
        boolean h2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dspd)) {
            return false;
        }
        dspd dspdVar = (dspd) obj;
        if (this.d != dspdVar.c()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        int i = this.c;
        int i2 = dspdVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        dssz dsszVar = new dssz(this);
        dsoz next = dsszVar.next();
        dssz dsszVar2 = new dssz(dspdVar);
        dsoz next2 = dsszVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int c = next.c() - i3;
            int c2 = next2.c() - i4;
            int min = Math.min(c, c2);
            if (i3 == 0) {
                h2 = next.h(next2, i4, min);
            } else {
                h2 = next2.h(next, i3, min);
            }
            if (!h2) {
                return false;
            }
            i5 += min;
            int i6 = this.d;
            if (i5 >= i6) {
                if (i5 != i6) {
                    throw new IllegalStateException();
                }
                return true;
            }
            if (min == c) {
                next = dsszVar.next();
                i3 = 0;
            } else {
                i3 += min;
            }
            if (min == c2) {
                next2 = dsszVar2.next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dspd
    public final int f() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dspd
    public final boolean g() {
        return this.d >= h(this.g);
    }

    @Override // defpackage.dspd
    public final dspd i(int i, int i2) {
        int O = O(i, i2, this.d);
        if (O == 0) {
            return dspd.b;
        }
        if (O == this.d) {
            return this;
        }
        int i3 = this.i;
        if (i2 <= i3) {
            return this.e.i(i, i2);
        }
        if (i >= i3) {
            return this.f.i(i - i3, i2 - i3);
        }
        return new dstb(this.e.v(i), this.f.i(0, i2 - this.i));
    }

    @Override // defpackage.dspd, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return iterator();
    }

    @Override // defpackage.dspd
    public final void j(ByteBuffer byteBuffer) {
        this.e.j(byteBuffer);
        this.f.j(byteBuffer);
    }

    @Override // defpackage.dspd
    public final ByteBuffer k() {
        return ByteBuffer.wrap(G()).asReadOnlyBuffer();
    }

    @Override // defpackage.dspd
    public final void l(OutputStream outputStream) {
        this.e.l(outputStream);
        this.f.l(outputStream);
    }

    @Override // defpackage.dspd
    public final void m(dsor dsorVar) {
        this.e.m(dsorVar);
        this.f.m(dsorVar);
    }

    @Override // defpackage.dspd
    protected final String n(Charset charset) {
        return new String(G(), charset);
    }

    @Override // defpackage.dspd
    public final boolean o() {
        int p = this.e.p(0, 0, this.i);
        dspd dspdVar = this.f;
        return dspdVar.p(p, 0, dspdVar.c()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dspd
    public final int p(int i, int i2, int i3) {
        int i4 = this.i;
        if (i2 + i3 <= i4) {
            return this.e.p(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f.p(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f.p(this.e.p(i, i2, i5), 0, i3 - i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dspd
    public final int q(int i, int i2, int i3) {
        int i4 = this.i;
        if (i2 + i3 <= i4) {
            return this.e.q(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f.q(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f.q(this.e.q(i, i2, i5), 0, i3 - i5);
    }

    @Override // defpackage.dspd
    public final InputStream r() {
        return new dsta(this);
    }

    @Override // defpackage.dspd
    public final dspj s() {
        return dspj.I(new dsta(this));
    }

    @Override // defpackage.dspd
    public final dsox t() {
        return new dssx(this);
    }

    Object writeReplace() {
        return dspd.y(G());
    }
}
