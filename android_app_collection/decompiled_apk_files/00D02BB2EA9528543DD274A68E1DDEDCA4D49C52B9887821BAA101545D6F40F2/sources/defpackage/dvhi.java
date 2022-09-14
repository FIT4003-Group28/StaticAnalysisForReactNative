package defpackage;
/* compiled from: PG */
/* renamed from: dvhi  reason: default package */
/* loaded from: classes.dex */
public final class dvhi extends dsqw<dvhi, dvhh> implements dssk {
    public static final dvhi c;
    private static volatile dssr<dvhi> e;
    public dqpe a;
    public int b;
    private int d;

    static {
        dvhi dvhiVar = new dvhi();
        c = dvhiVar;
        dsqw.cc(dvhi.class, dvhiVar);
    }

    private dvhi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဌ\u0004", new Object[]{"d", "a", "b", drbs.a});
            }
            if (i2 == 3) {
                return new dvhi();
            }
            if (i2 == 4) {
                return new dvhh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvhi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvhi.class) {
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
