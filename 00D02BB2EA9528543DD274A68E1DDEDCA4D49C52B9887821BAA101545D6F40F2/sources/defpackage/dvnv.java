package defpackage;
/* compiled from: PG */
/* renamed from: dvnv  reason: default package */
/* loaded from: classes6.dex */
public final class dvnv extends dsqw<dvnv, dvnu> implements dssk {
    public static final dvnv a;
    private static volatile dssr<dvnv> b;

    static {
        dvnv dvnvVar = new dvnv();
        a = dvnvVar;
        dsqw.cc(dvnv.class, dvnvVar);
    }

    private dvnv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvnv();
            }
            if (i2 == 4) {
                return new dvnu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvnv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvnv.class) {
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
