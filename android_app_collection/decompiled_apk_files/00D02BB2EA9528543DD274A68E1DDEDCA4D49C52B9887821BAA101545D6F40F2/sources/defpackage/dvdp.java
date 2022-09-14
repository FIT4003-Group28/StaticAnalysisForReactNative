package defpackage;
/* compiled from: PG */
/* renamed from: dvdp  reason: default package */
/* loaded from: classes.dex */
public final class dvdp extends dsqw<dvdp, dvdk> implements dvdq {
    public static final dvdp f;
    private static volatile dssr<dvdp> g;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;

    static {
        dvdp dvdpVar = new dvdp();
        f = dvdpVar;
        dsqw.cc(dvdp.class, dvdpVar);
    }

    private dvdp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", dvdm.c(), "c", "d", "e", dvdo.c()});
            }
            if (i2 == 3) {
                return new dvdp();
            }
            if (i2 == 4) {
                return new dvdk();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvdp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvdp.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
