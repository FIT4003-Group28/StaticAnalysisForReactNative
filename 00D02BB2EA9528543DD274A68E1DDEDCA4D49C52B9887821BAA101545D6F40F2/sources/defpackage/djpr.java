package defpackage;
/* compiled from: PG */
/* renamed from: djpr  reason: default package */
/* loaded from: classes6.dex */
public final class djpr extends dsqw<djpr, djpq> implements dssk {
    public static final djpr d;
    private static volatile dssr<djpr> f;
    public int a = 0;
    public Object b;
    public djpk c;
    private int e;

    static {
        djpr djprVar = new djpr();
        d = djprVar;
        dsqw.cc(djpr.class, djprVar);
    }

    private djpr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", "e", "c", djpt.class, djpp.class});
            }
            if (i2 == 3) {
                return new djpr();
            }
            if (i2 == 4) {
                return new djpq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djpr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djpr.class) {
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
