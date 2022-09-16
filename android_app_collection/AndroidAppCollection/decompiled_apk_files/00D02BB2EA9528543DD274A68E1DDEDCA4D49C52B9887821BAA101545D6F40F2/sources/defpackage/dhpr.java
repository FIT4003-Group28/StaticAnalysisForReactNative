package defpackage;
/* compiled from: PG */
/* renamed from: dhpr  reason: default package */
/* loaded from: classes.dex */
public final class dhpr extends dsqw<dhpr, dhpq> implements dssk {
    public static final dhpr d;
    private static volatile dssr<dhpr> f;
    public int a = 2;
    public int b = 1440;
    public int c = 5000;
    private int e;

    static {
        dhpr dhprVar = new dhpr();
        d = dhprVar;
        dsqw.cc(dhpr.class, dhprVar);
    }

    private dhpr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhpr();
            }
            if (i2 == 4) {
                return new dhpq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhpr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhpr.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
