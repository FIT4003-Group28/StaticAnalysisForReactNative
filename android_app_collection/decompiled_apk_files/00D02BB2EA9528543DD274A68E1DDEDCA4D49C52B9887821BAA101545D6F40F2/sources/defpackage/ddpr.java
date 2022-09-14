package defpackage;
/* compiled from: PG */
/* renamed from: ddpr  reason: default package */
/* loaded from: classes6.dex */
public final class ddpr extends dsqw<ddpr, ddpq> implements dssk {
    public static final ddpr a;
    private static volatile dssr<ddpr> b;

    static {
        ddpr ddprVar = new ddpr();
        a = ddprVar;
        dsqw.cc(ddpr.class, ddprVar);
    }

    private ddpr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddpr();
            }
            if (i2 == 4) {
                return new ddpq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddpr> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddpr.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
