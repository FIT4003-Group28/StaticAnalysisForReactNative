package defpackage;
/* compiled from: PG */
/* renamed from: dvbm  reason: default package */
/* loaded from: classes6.dex */
public final class dvbm extends dsqw<dvbm, dvbl> implements dssk {
    public static final dvbm d;
    private static volatile dssr<dvbm> f;
    public dnhe a;
    public dnhe b;
    public boolean c;
    private int e;

    static {
        dvbm dvbmVar = new dvbm();
        d = dvbmVar;
        dsqw.cc(dvbm.class, dvbmVar);
    }

    private dvbm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvbm();
            }
            if (i2 == 4) {
                return new dvbl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvbm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvbm.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
