package defpackage;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: aool  reason: default package */
/* loaded from: classes.dex */
public abstract class aool extends aont {
    private static final Logger a = Logger.getLogger(aool.class.getName());
    public static final boolean e = aosg.b;
    aoom f;

    public static int H(byte[] bArr) {
        return S(bArr.length);
    }

    public static int I(int i, aoob aoobVar) {
        return ac(i) + J(aoobVar);
    }

    public static int J(aoob aoobVar) {
        return S(aoobVar.d());
    }

    public static int K(int i, int i2) {
        return ac(i) + O(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int L(int i, aoqu aoquVar, aorm aormVar) {
        int ac = ac(i);
        return ac + ac + ((aonk) aoquVar).getSerializedSize(aormVar);
    }

    @Deprecated
    public static int M(aoqu aoquVar) {
        return aoquVar.getSerializedSize();
    }

    public static int N(int i, int i2) {
        return ac(i) + O(i2);
    }

    public static int O(int i) {
        if (i >= 0) {
            return ae(i);
        }
        return 10;
    }

    public static int P(int i, long j) {
        return ac(i) + ag(j);
    }

    public static int Q(int i, aoqd aoqdVar) {
        return ac(i) + R(aoqdVar);
    }

    public static int R(aoqd aoqdVar) {
        int serializedSize;
        if (aoqdVar.b != null) {
            serializedSize = aoqdVar.b.d();
        } else {
            serializedSize = aoqdVar.a != null ? aoqdVar.a.getSerializedSize() : 0;
        }
        return S(serializedSize);
    }

    public static int S(int i) {
        return ae(i) + i;
    }

    public static int T(aoqu aoquVar) {
        return S(aoquVar.getSerializedSize());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int U(aoqu aoquVar, aorm aormVar) {
        return S(((aonk) aoquVar).getSerializedSize(aormVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int V(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int W(int i, int i2) {
        return ac(i) + X(i2);
    }

    public static int X(int i) {
        return ae(ah(i));
    }

    public static int Y(int i, long j) {
        return ac(i) + Z(j);
    }

    public static int Z(long j) {
        return ag(ai(j));
    }

    public static int aA(int i) {
        return ac(i) + 4;
    }

    public static int aB(int i) {
        return ac(i) + 8;
    }

    public static int aC(int i) {
        return ac(i) + 4;
    }

    public static int aD(int i) {
        return ac(i) + 4;
    }

    public static int aE(int i) {
        return ac(i) + 8;
    }

    public static int aa(int i, String str) {
        return ac(i) + ab(str);
    }

    public static int ab(String str) {
        int length;
        try {
            length = aosi.b(str);
        } catch (aosh unused) {
            length = str.getBytes(aopv.a).length;
        }
        return S(length);
    }

    public static int ac(int i) {
        return ae(aosl.c(i, 0));
    }

    public static int ad(int i, int i2) {
        return ac(i) + ae(i2);
    }

    public static int ae(int i) {
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

    public static int af(int i, long j) {
        return ac(i) + ag(j);
    }

    public static int ag(long j) {
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

    public static int ah(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static long ai(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static aool aj(OutputStream outputStream) {
        return al(outputStream, 4096);
    }

    public static aool ak(byte[] bArr) {
        return am(bArr, 0, bArr.length);
    }

    public static aool al(OutputStream outputStream, int i) {
        return new aooi(outputStream, i);
    }

    public static aool am(byte[] bArr, int i, int i2) {
        return new aooj(bArr, i, i2);
    }

    public static int ay(int i) {
        return ac(i) + 1;
    }

    public static int az(int i) {
        return ac(i) + 8;
    }

    public abstract void A(String str);

    public abstract void B(int i, int i2);

    public abstract void C(int i, int i2);

    public abstract void D(int i);

    public abstract void E(int i, long j);

    public abstract void F(long j);

    public abstract void G(byte[] bArr, int i);

    @Override // defpackage.aont
    public abstract void a(byte[] bArr, int i, int i2);

    public final void an() {
        if (b() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ao(String str, aosh aoshVar) {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) aoshVar);
        byte[] bytes = str.getBytes(aopv.a);
        try {
            int length = bytes.length;
            D(length);
            a(bytes, 0, length);
        } catch (aook e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new aook(e3);
        }
    }

    public final void ap(int i, double d) {
        r(i, Double.doubleToRawLongBits(d));
    }

    public final void aq(double d) {
        s(Double.doubleToRawLongBits(d));
    }

    public final void ar(int i, float f) {
        p(i, Float.floatToRawIntBits(f));
    }

    public final void as(float f) {
        q(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void at(aoqu aoquVar) {
        aoquVar.writeTo(this);
    }

    public final void au(int i, int i2) {
        C(i, ah(i2));
    }

    public final void av(int i) {
        D(ah(i));
    }

    public final void aw(int i, long j) {
        E(i, ai(j));
    }

    public final void ax(long j) {
        F(ai(j));
    }

    public abstract int b();

    public abstract void i();

    public abstract void j(byte b);

    public abstract void l(int i, boolean z);

    public abstract void m(int i, byte[] bArr);

    public abstract void n(int i, aoob aoobVar);

    public abstract void o(aoob aoobVar);

    public abstract void p(int i, int i2);

    public abstract void q(int i);

    public abstract void r(int i, long j);

    public abstract void s(long j);

    public abstract void t(int i, int i2);

    public abstract void u(int i);

    public abstract void v(int i, aoqu aoquVar, aorm aormVar);

    public abstract void w(aoqu aoquVar);

    public abstract void x(int i, aoqu aoquVar);

    public abstract void y(int i, aoob aoobVar);

    public abstract void z(int i, String str);
}
