package defpackage;
/* compiled from: PG */
/* renamed from: dvbt  reason: default package */
/* loaded from: classes6.dex */
public final class dvbt extends dsqw<dvbt, dvbs> implements dssk {
    public static final dvbt c;
    private static volatile dssr<dvbt> e;
    public int a;
    public dvcj b;
    private int d;

    static {
        dvbt dvbtVar = new dvbt();
        c = dvbtVar;
        dsqw.cc(dvbt.class, dvbtVar);
    }

    private dvbt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဉ\u0003", new Object[]{"d", "a", dvcf.a, "b"});
            }
            if (i2 == 3) {
                return new dvbt();
            }
            if (i2 == 4) {
                return new dvbs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvbt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvbt.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
