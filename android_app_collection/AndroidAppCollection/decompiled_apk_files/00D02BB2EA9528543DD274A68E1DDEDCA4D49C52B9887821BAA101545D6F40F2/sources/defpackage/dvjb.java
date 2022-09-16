package defpackage;
/* compiled from: PG */
/* renamed from: dvjb  reason: default package */
/* loaded from: classes.dex */
public final class dvjb extends dsqw<dvjb, dvja> implements dssk {
    public static final dvjb d;
    private static volatile dssr<dvjb> f;
    public dqpe a;
    public int b;
    public boolean c;
    private int e;

    static {
        dvjb dvjbVar = new dvjb();
        d = dvjbVar;
        dsqw.cc(dvjb.class, dvjbVar);
    }

    private dvjb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"e", "a", "b", drbs.a, "c"});
            }
            if (i2 == 3) {
                return new dvjb();
            }
            if (i2 == 4) {
                return new dvja();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvjb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvjb.class) {
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
