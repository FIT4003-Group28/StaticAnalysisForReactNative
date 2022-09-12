package defpackage;
/* compiled from: PG */
/* renamed from: dvbv  reason: default package */
/* loaded from: classes6.dex */
public final class dvbv extends dsqw<dvbv, dvbu> implements dssk {
    public static final dvbv c;
    private static volatile dssr<dvbv> d;
    public int a = 0;
    public Object b;

    static {
        dvbv dvbvVar = new dvbv();
        c = dvbvVar;
        dsqw.cc(dvbv.class, dvbvVar);
    }

    private dvbv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dvbx.class, dvbz.class});
            }
            if (i2 == 3) {
                return new dvbv();
            }
            if (i2 == 4) {
                return new dvbu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvbv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvbv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
