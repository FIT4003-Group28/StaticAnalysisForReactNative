package defpackage;
/* compiled from: PG */
/* renamed from: dvmc  reason: default package */
/* loaded from: classes.dex */
public final class dvmc extends dsqw<dvmc, dvlv> implements dssk {
    public static final dvmc l;
    private static volatile dssr<dvmc> n;
    public dvmb a;
    public int b = 2;
    public dsrf c = dsqz.b;
    public int d = 200;
    public boolean e = true;
    public int f = 1;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    private int m;

    static {
        dvmc dvmcVar = new dvmc();
        l = dvmcVar;
        dsqw.cc(dvmc.class, dvmcVar);
    }

    private dvmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\u000b\u0000\u0001\u0001\u0012\u000b\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u0016\u0005ဌ\u0002\u0006င\u0004\bဇ\u0006\tဌ\u0007\rဇ\u000b\u000eဇ\f\u000fဇ\r\u0011ဇ\u000f\u0012ဇ\u0010", new Object[]{"m", "a", "c", "b", dvly.a, "d", "e", "f", dvlw.a, "g", "h", "i", "j", "k"});
            }
            if (i2 == 3) {
                return new dvmc();
            }
            if (i2 == 4) {
                return new dvlv();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvmc> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dvmc.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
