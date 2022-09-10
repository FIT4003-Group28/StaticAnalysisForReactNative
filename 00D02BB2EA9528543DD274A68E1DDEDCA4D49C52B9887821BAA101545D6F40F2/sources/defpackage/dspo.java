package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: dspo  reason: default package */
/* loaded from: classes.dex */
public final class dspo extends dspl {
    private final OutputStream g;

    public dspo(OutputStream outputStream, int i) {
        super(i);
        if (outputStream != null) {
            this.g = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    private final void aA() {
        this.g.write(this.a, 0, this.c);
        this.c = 0;
    }

    private final void az(int i) {
        if (this.b - this.c < i) {
            aA();
        }
    }

    @Override // defpackage.dspp, defpackage.dsor
    public final void a(byte[] bArr, int i, int i2) {
        w(bArr, i, i2);
    }

    @Override // defpackage.dspp
    public final void aB(int i, int i2) {
        s(dsut.c(i, i2));
    }

    @Override // defpackage.dspp
    public final void aC(int i, int i2) {
        az(20);
        d(i, 0);
        if (i2 >= 0) {
            e(i2);
        } else {
            f(i2);
        }
    }

    @Override // defpackage.dspp
    public final void aD(int i, int i2) {
        az(20);
        d(i, 0);
        e(i2);
    }

    @Override // defpackage.dspp
    public final void aE(int i, int i2) {
        az(14);
        d(i, 5);
        g(i2);
    }

    @Override // defpackage.dspp
    public final void aF(int i, long j) {
        az(20);
        d(i, 0);
        f(j);
    }

    @Override // defpackage.dspp
    public final void aG(int i, long j) {
        az(18);
        d(i, 1);
        h(j);
    }

    @Override // defpackage.dspp
    public final void i(int i, boolean z) {
        az(11);
        d(i, 0);
        c(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.dspp
    public final void j(int i, String str) {
        aB(i, 2);
        x(str);
    }

    @Override // defpackage.dspp
    public final void k(int i, dspd dspdVar) {
        aB(i, 2);
        l(dspdVar);
    }

    @Override // defpackage.dspp
    public final void l(dspd dspdVar) {
        s(dspdVar.c());
        dspdVar.m(this);
    }

    @Override // defpackage.dspp
    public final void m(int i, dssj dssjVar, dstc dstcVar) {
        aB(i, 2);
        dsoe dsoeVar = (dsoe) dssjVar;
        int bV = dsoeVar.bV();
        if (bV == -1) {
            bV = dstcVar.e(dsoeVar);
            dsoeVar.bW(bV);
        }
        s(bV);
        dstcVar.n(dssjVar, this.f);
    }

    @Override // defpackage.dspp
    public final void n(int i, dssj dssjVar) {
        aB(1, 3);
        aD(2, i);
        aB(3, 2);
        p(dssjVar);
        aB(1, 4);
    }

    @Override // defpackage.dspp
    public final void o(int i, dspd dspdVar) {
        aB(1, 3);
        aD(2, i);
        k(3, dspdVar);
        aB(1, 4);
    }

    @Override // defpackage.dspp
    public final void p(dssj dssjVar) {
        s(dssjVar.cb());
        dssjVar.Pv(this);
    }

    @Override // defpackage.dspp
    public final void q(byte b) {
        if (this.c == this.b) {
            aA();
        }
        c(b);
    }

    @Override // defpackage.dspp
    public final void r(int i) {
        if (i >= 0) {
            s(i);
        } else {
            u(i);
        }
    }

    @Override // defpackage.dspp
    public final void s(int i) {
        az(5);
        e(i);
    }

    @Override // defpackage.dspp
    public final void t(int i) {
        az(4);
        g(i);
    }

    @Override // defpackage.dspp
    public final void u(long j) {
        az(10);
        f(j);
    }

    @Override // defpackage.dspp
    public final void v(long j) {
        az(8);
        h(j);
    }

    public final void w(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        int i4 = this.c;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, this.a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        this.d += i5;
        aA();
        if (i7 <= this.b) {
            System.arraycopy(bArr, i6, this.a, 0, i7);
            this.c = i7;
        } else {
            this.g.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    @Override // defpackage.dspp
    public final void y() {
        if (this.c > 0) {
            aA();
        }
    }

    @Override // defpackage.dspp
    public final void z(byte[] bArr, int i) {
        s(i);
        w(bArr, 0, i);
    }

    @Override // defpackage.dspp
    public final void x(String str) {
        int f;
        try {
            int length = str.length() * 3;
            int aa = aa(length);
            int i = aa + length;
            int i2 = this.b;
            if (i <= i2) {
                if (i > i2 - this.c) {
                    aA();
                }
                int aa2 = aa(str.length());
                int i3 = this.c;
                try {
                    if (aa2 != aa) {
                        f = dsuo.f(str);
                        e(f);
                        this.c = dsuo.g(str, this.a, this.c, f);
                    } else {
                        int i4 = i3 + aa2;
                        this.c = i4;
                        int g = dsuo.g(str, this.a, i4, this.b - i4);
                        this.c = i3;
                        f = (g - i3) - aa2;
                        e(f);
                        this.c = g;
                    }
                    this.d += f;
                    return;
                } catch (dsum e) {
                    this.d -= this.c - i3;
                    this.c = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new dspn(e2);
                }
            }
            byte[] bArr = new byte[length];
            int g2 = dsuo.g(str, bArr, 0, length);
            s(g2);
            w(bArr, 0, g2);
        } catch (dsum e3) {
            ao(str, e3);
        }
    }
}
