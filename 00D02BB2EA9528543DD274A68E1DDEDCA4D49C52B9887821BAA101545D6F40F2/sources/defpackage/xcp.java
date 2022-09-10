package defpackage;
/* compiled from: PG */
/* renamed from: xcp  reason: default package */
/* loaded from: classes7.dex */
public final class xcp extends dsqw<xcp, xco> implements dssk {
    public static final xcp a;
    private static volatile dssr<xcp> d;
    private dssd<String, xcm> b = dssd.b;
    private byte c = 2;

    static {
        xcp xcpVar = new xcp();
        a = xcpVar;
        dsqw.cc(xcp.class, xcpVar);
    }

    private xcp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", xcn.a});
            }
            if (i2 == 3) {
                return new xcp();
            }
            if (i2 == 4) {
                return new xco();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.c = b;
                return null;
            }
            dssr<xcp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (xcp.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
