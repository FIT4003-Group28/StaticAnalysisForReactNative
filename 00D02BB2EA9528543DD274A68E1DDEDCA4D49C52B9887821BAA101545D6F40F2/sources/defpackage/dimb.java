package defpackage;
/* compiled from: PG */
/* renamed from: dimb  reason: default package */
/* loaded from: classes6.dex */
public final class dimb extends dsqw<dimb, dima> implements dssk {
    public static final dimb c;
    private static volatile dssr<dimb> d;
    public int a;
    public int b;

    static {
        dimb dimbVar = new dimb();
        c = dimbVar;
        dsqw.cc(dimb.class, dimbVar);
    }

    private dimb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dgef.c()});
            }
            if (i2 == 3) {
                return new dimb();
            }
            if (i2 == 4) {
                return new dima();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dimb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dimb.class) {
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
