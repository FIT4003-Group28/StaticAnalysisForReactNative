package defpackage;
/* compiled from: PG */
/* renamed from: dvgu  reason: default package */
/* loaded from: classes.dex */
public final class dvgu extends dsqw<dvgu, dvgt> implements dssk {
    public static final dvgu c;
    private static volatile dssr<dvgu> e;
    public dqpe a;
    public int b;
    private int d;

    static {
        dvgu dvguVar = new dvgu();
        c = dvguVar;
        dsqw.cc(dvgu.class, dvguVar);
    }

    private dvgu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", drbs.a});
            }
            if (i2 == 3) {
                return new dvgu();
            }
            if (i2 == 4) {
                return new dvgt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvgu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvgu.class) {
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
