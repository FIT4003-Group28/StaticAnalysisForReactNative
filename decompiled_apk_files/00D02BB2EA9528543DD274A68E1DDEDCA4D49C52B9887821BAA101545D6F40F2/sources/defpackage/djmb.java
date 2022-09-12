package defpackage;
/* compiled from: PG */
/* renamed from: djmb  reason: default package */
/* loaded from: classes6.dex */
public final class djmb extends dsqw<djmb, djlw> implements dssk {
    public static final djmb e;
    private static volatile dssr<djmb> f;
    public Object b;
    public Object d;
    public int a = 0;
    public int c = 0;

    static {
        djmb djmbVar = new djmb();
        e = djmbVar;
        dsqw.cc(djmb.class, djmbVar);
    }

    private djmb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0003ဿ\u0001\u0004ှ\u0001", new Object[]{"b", "a", "d", "c", djjv.class, dpol.c(), djlz.c()});
            }
            if (i2 == 3) {
                return new djmb();
            }
            if (i2 == 4) {
                return new djlw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djmb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djmb.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
