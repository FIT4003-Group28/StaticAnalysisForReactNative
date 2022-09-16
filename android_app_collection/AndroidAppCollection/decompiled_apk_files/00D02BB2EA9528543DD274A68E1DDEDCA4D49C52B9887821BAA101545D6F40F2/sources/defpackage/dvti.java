package defpackage;
/* compiled from: PG */
/* renamed from: dvti  reason: default package */
/* loaded from: classes.dex */
public final class dvti extends dsqw<dvti, dvth> implements dssk {
    public static final dvti b;
    private static volatile dssr<dvti> d;
    public boolean a;
    private int c;

    static {
        dvti dvtiVar = new dvti();
        b = dvtiVar;
        dsqw.cc(dvti.class, dvtiVar);
    }

    private dvti() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0015\u0015\u0001\u0000\u0000\u0000\u0015ဇ\u0014", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvti();
            }
            if (i2 == 4) {
                return new dvth();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvti> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvti.class) {
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
