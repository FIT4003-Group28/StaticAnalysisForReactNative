package defpackage;
/* compiled from: PG */
/* renamed from: djjg  reason: default package */
/* loaded from: classes6.dex */
public final class djjg extends dsqw<djjg, djje> implements dssk {
    public static final djjg c;
    private static volatile dssr<djjg> d;
    public int a = 0;
    public Object b;

    static {
        djjg djjgVar = new djjg();
        c = djjgVar;
        dsqw.cc(djjg.class, djjgVar);
    }

    private djjg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0007\u0001\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ဿ\u0000\u0007ြ\u0000\bဿ\u0000", new Object[]{"b", "a", dpvi.class, djji.class, dpum.class, dpwt.c(), dpsd.class, dprz.c()});
            }
            if (i2 == 3) {
                return new djjg();
            }
            if (i2 == 4) {
                return new djje();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djjg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djjg.class) {
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
