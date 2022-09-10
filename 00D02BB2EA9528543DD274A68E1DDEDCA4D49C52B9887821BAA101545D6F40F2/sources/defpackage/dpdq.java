package defpackage;
/* compiled from: PG */
/* renamed from: dpdq  reason: default package */
/* loaded from: classes6.dex */
public final class dpdq extends dsqw<dpdq, dpcp> implements dssk {
    public static final dpdq x;
    private static volatile dssr<dpdq> z;
    public int a;
    public dpec c;
    public dpdl d;
    public dpea e;
    public douj f;
    public int g;
    public int h;
    public int j;
    public int k;
    public int l;
    public dnfi o;
    public int q;
    public boolean r;
    public int u;
    private byte y = 2;
    public String b = "";
    public int i = 3;
    public dsrj<dovv> m = dssu.b;
    public dsrj<doyj> n = dssu.b;
    public dsrj<doxz> p = dssu.b;
    public boolean s = true;
    public dsrj<dpdf> t = dssu.b;
    public dsrj<dpdj> v = dssu.b;
    public dsrj<dpcx> w = dssu.b;

    static {
        dpdq dpdqVar = new dpdq();
        x = dpdqVar;
        dsqw.cc(dpdq.class, dpdqVar);
    }

    private dpdq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(x, "\u0001\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0006\u0004\u0001ᐉ\u0001\u0003ဉ\u0003\u0005ᐉ\u0004\u0006ဈ\u0000\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nဌ\b\u000bင\t\fЛ\r\u001b\u000eဉ\u000b\u000fЛ\u0010င\f\u0012င\n\u0013ဉ\u0002\u0014\u001b\u0015ဌ\u0010\u0016\u001b\u0017ဇ\r\u0018ဇ\u000f\u0019\u001b", new Object[]{"a", "c", "e", "f", "b", "g", dgau.c(), "h", dpdp.c(), "i", dpdn.c(), "j", dpcq.a, "k", "m", dovv.class, "n", doyj.class, "o", "p", doxz.class, "q", "l", "d", "t", dpdf.class, "u", dozc.c(), "v", dpdj.class, "r", "s", "w", dpcx.class});
            }
            if (i2 == 3) {
                return new dpdq();
            }
            if (i2 == 4) {
                return new dpcp();
            }
            if (i2 == 5) {
                return x;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            }
            dssr<dpdq> dssrVar = z;
            if (dssrVar == null) {
                synchronized (dpdq.class) {
                    dssrVar = z;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(x);
                        z = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.y);
    }
}
