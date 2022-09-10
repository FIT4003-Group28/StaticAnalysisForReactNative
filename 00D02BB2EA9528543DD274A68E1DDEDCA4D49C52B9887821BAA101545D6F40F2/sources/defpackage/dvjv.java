package defpackage;
/* compiled from: PG */
/* renamed from: dvjv  reason: default package */
/* loaded from: classes.dex */
public final class dvjv extends dsqw<dvjv, dvju> implements dssk {
    public static final dvjv b;
    private static volatile dssr<dvjv> d;
    public int a;
    private int c;

    static {
        dvjv dvjvVar = new dvjv();
        b = dvjvVar;
        dsqw.cc(dvjv.class, dvjvVar);
    }

    private dvjv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dnvw.a});
            }
            if (i2 == 3) {
                return new dvjv();
            }
            if (i2 == 4) {
                return new dvju();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvjv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvjv.class) {
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
