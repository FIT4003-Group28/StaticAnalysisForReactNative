package defpackage;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dspp  reason: default package */
/* loaded from: classes.dex */
public abstract class dspp extends dsor {
    private static final Logger a = Logger.getLogger(dspp.class.getName());
    public static final boolean e = dsui.b;
    dspq f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static dspp B(OutputStream outputStream) {
        return C(outputStream, 4096);
    }

    public static dspp C(OutputStream outputStream, int i) {
        return new dspo(outputStream, i);
    }

    public static dspp D(byte[] bArr) {
        return E(bArr, 0, bArr.length);
    }

    public static dspp E(byte[] bArr, int i, int i2) {
        return new dspm(bArr, i, i2);
    }

    public static int O(int i, int i2) {
        return Y(i) + Z(i2);
    }

    public static int P(int i, int i2) {
        return Y(i) + aa(i2);
    }

    public static int Q(int i, int i2) {
        return Y(i) + ab(i2);
    }

    public static int R(int i, long j) {
        return Y(i) + ac(j);
    }

    public static int S(int i, long j) {
        return Y(i) + ac(j);
    }

    public static int T(int i, long j) {
        return Y(i) + ad(j);
    }

    public static int U(int i, int i2) {
        return Y(i) + Z(i2);
    }

    public static int V(int i, String str) {
        return Y(i) + ae(str);
    }

    public static int W(int i, dspd dspdVar) {
        return Y(i) + ag(dspdVar);
    }

    public static int X(int i, dsrr dsrrVar) {
        return Y(i) + af(dsrrVar);
    }

    public static int Y(int i) {
        return aa(dsut.c(i, 0));
    }

    public static int Z(int i) {
        if (i >= 0) {
            return aa(i);
        }
        return 10;
    }

    public static int aa(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int ab(int i) {
        return aa(al(i));
    }

    public static int ac(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int ad(long j) {
        return ac(am(j));
    }

    public static int ae(String str) {
        int length;
        try {
            length = dsuo.f(str);
        } catch (dsum unused) {
            length = str.getBytes(dsrk.a).length;
        }
        return ak(length);
    }

    public static int af(dsrr dsrrVar) {
        int cb;
        if (dsrrVar.b != null) {
            cb = dsrrVar.b.c();
        } else {
            cb = dsrrVar.a != null ? dsrrVar.a.cb() : 0;
        }
        return ak(cb);
    }

    public static int ag(dspd dspdVar) {
        return ak(dspdVar.c());
    }

    public static int ah(byte[] bArr) {
        return ak(bArr.length);
    }

    public static int ai(dssj dssjVar) {
        return ak(dssjVar.cb());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int aj(dssj dssjVar, dstc dstcVar) {
        dsoe dsoeVar = (dsoe) dssjVar;
        int bV = dsoeVar.bV();
        if (bV == -1) {
            bV = dstcVar.e(dsoeVar);
            dsoeVar.bW(bV);
        }
        return ak(bV);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int ak(int i) {
        return aa(i) + i;
    }

    public static int al(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long am(long j) {
        return (j >> 63) ^ (j + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int aq(int i, dssj dssjVar, dstc dstcVar) {
        int Y = Y(i);
        int i2 = Y + Y;
        dsoe dsoeVar = (dsoe) dssjVar;
        int bV = dsoeVar.bV();
        if (bV == -1) {
            bV = dstcVar.e(dsoeVar);
            dsoeVar.bW(bV);
        }
        return i2 + bV;
    }

    @Deprecated
    public static int ar(dssj dssjVar) {
        return dssjVar.cb();
    }

    public static int as(int i) {
        return Y(i) + 1;
    }

    public static int at(int i) {
        return Y(i) + 8;
    }

    public static int au(int i) {
        return Y(i) + 4;
    }

    public static int av(int i) {
        return Y(i) + 8;
    }

    public static int aw(int i) {
        return Y(i) + 4;
    }

    public static int ax(int i) {
        return Y(i) + 4;
    }

    public static int ay(int i) {
        return Y(i) + 8;
    }

    public final void F(int i, int i2) {
        aD(i, al(i2));
    }

    public final void G(int i, long j) {
        aF(i, am(j));
    }

    public final void H(int i, float f) {
        aE(i, Float.floatToRawIntBits(f));
    }

    public final void I(int i, double d) {
        aG(i, Double.doubleToRawLongBits(d));
    }

    public final void J(int i) {
        s(al(i));
    }

    public final void K(long j) {
        u(am(j));
    }

    public final void L(float f) {
        t(Float.floatToRawIntBits(f));
    }

    public final void M(double d) {
        v(Double.doubleToRawLongBits(d));
    }

    public final void N(byte[] bArr) {
        z(bArr, bArr.length);
    }

    @Override // defpackage.dsor
    public abstract void a(byte[] bArr, int i, int i2);

    public abstract void aB(int i, int i2);

    public abstract void aC(int i, int i2);

    public abstract void aD(int i, int i2);

    public abstract void aE(int i, int i2);

    public abstract void aF(int i, long j);

    public abstract void aG(int i, long j);

    public final void an() {
        if (b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ao(String str, dsum dsumVar) {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dsumVar);
        byte[] bytes = str.getBytes(dsrk.a);
        try {
            int length = bytes.length;
            s(length);
            a(bytes, 0, length);
        } catch (dspn e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new dspn(e3);
        }
    }

    @Deprecated
    public final void ap(dssj dssjVar) {
        dssjVar.Pv(this);
    }

    public abstract int b();

    public abstract void i(int i, boolean z);

    public abstract void j(int i, String str);

    public abstract void k(int i, dspd dspdVar);

    public abstract void l(dspd dspdVar);

    public abstract void m(int i, dssj dssjVar, dstc dstcVar);

    public abstract void n(int i, dssj dssjVar);

    public abstract void o(int i, dspd dspdVar);

    public abstract void p(dssj dssjVar);

    public abstract void q(byte b);

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(int i);

    public abstract void u(long j);

    public abstract void v(long j);

    public abstract void x(String str);

    public abstract void y();

    public abstract void z(byte[] bArr, int i);
}
