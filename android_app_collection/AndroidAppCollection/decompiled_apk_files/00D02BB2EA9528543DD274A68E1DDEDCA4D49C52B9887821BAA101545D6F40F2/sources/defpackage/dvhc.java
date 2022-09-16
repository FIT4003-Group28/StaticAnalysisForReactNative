package defpackage;
/* compiled from: PG */
/* renamed from: dvhc  reason: default package */
/* loaded from: classes.dex */
public final class dvhc extends dsqw<dvhc, dvhb> implements dssk {
    public static final dvhc c;
    private static volatile dssr<dvhc> e;
    public dqpe a;
    public int b;
    private int d;

    static {
        dvhc dvhcVar = new dvhc();
        c = dvhcVar;
        dsqw.cc(dvhc.class, dvhcVar);
    }

    private dvhc() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဌ\u0002", new Object[]{"d", "a", "b", drbs.a});
            }
            if (i2 == 3) {
                return new dvhc();
            }
            if (i2 == 4) {
                return new dvhb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvhc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvhc.class) {
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
