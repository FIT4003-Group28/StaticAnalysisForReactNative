package defpackage;
/* compiled from: PG */
/* renamed from: ddvy  reason: default package */
/* loaded from: classes6.dex */
public final class ddvy extends dsqw<ddvy, ddvx> implements dssk {
    public static final ddvy b;
    private static volatile dssr<ddvy> d;
    public dstv a;
    private int c;

    static {
        ddvy ddvyVar = new ddvy();
        b = ddvyVar;
        dsqw.cc(ddvy.class, ddvyVar);
    }

    private ddvy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new ddvy();
            }
            if (i2 == 4) {
                return new ddvx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddvy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddvy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
