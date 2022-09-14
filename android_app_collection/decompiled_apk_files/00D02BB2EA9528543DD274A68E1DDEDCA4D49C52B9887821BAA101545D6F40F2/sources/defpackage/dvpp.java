package defpackage;
/* compiled from: PG */
/* renamed from: dvpp  reason: default package */
/* loaded from: classes6.dex */
public final class dvpp extends dsqw<dvpp, dvpo> implements dssk {
    public static final dvpp a;
    private static volatile dssr<dvpp> b;

    static {
        dvpp dvppVar = new dvpp();
        a = dvppVar;
        dsqw.cc(dvpp.class, dvppVar);
    }

    private dvpp() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvpp();
            }
            if (i2 == 4) {
                return new dvpo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvpp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvpp.class) {
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
