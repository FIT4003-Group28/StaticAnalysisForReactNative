package defpackage;
/* compiled from: PG */
/* renamed from: dvyn  reason: default package */
/* loaded from: classes.dex */
public final class dvyn extends dsqw<dvyn, dvym> implements dssk {
    public static final dvyn d;
    private static volatile dssr<dvyn> f;
    public String a = "";
    public int b;
    public int c;
    private int e;

    static {
        dvyn dvynVar = new dvyn();
        d = dvynVar;
        dsqw.cc(dvyn.class, dvynVar);
    }

    private dvyn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", dqcz.a});
            }
            if (i2 == 3) {
                return new dvyn();
            }
            if (i2 == 4) {
                return new dvym();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvyn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvyn.class) {
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
