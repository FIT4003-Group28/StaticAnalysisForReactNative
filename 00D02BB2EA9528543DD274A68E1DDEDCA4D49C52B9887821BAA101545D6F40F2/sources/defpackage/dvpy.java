package defpackage;
/* compiled from: PG */
/* renamed from: dvpy  reason: default package */
/* loaded from: classes.dex */
public final class dvpy extends dsqw<dvpy, dvpx> implements dssk {
    public static final dvpy a;
    private static volatile dssr<dvpy> b;

    static {
        dvpy dvpyVar = new dvpy();
        a = dvpyVar;
        dsqw.cc(dvpy.class, dvpyVar);
    }

    private dvpy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvpy();
            }
            if (i2 == 4) {
                return new dvpx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvpy> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvpy.class) {
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
