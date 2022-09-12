package defpackage;
/* compiled from: PG */
/* renamed from: dveo  reason: default package */
/* loaded from: classes.dex */
public final class dveo extends dsqw<dveo, dven> implements dssk {
    public static final dveo a;
    private static volatile dssr<dveo> b;

    static {
        dveo dveoVar = new dveo();
        a = dveoVar;
        dsqw.cc(dveo.class, dveoVar);
    }

    private dveo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dveo();
            }
            if (i2 == 4) {
                return new dven();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dveo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dveo.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
