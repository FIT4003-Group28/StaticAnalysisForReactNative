package defpackage;
/* compiled from: PG */
/* renamed from: dnzb  reason: default package */
/* loaded from: classes6.dex */
public final class dnzb extends dsqw<dnzb, dnza> implements dssk {
    public static final dnzb c;
    private static volatile dssr<dnzb> d;
    public int a;
    public int b;

    static {
        dnzb dnzbVar = new dnzb();
        c = dnzbVar;
        dsqw.cc(dnzb.class, dnzbVar);
    }

    private dnzb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dgfb.c()});
            }
            if (i2 == 3) {
                return new dnzb();
            }
            if (i2 == 4) {
                return new dnza();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnzb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnzb.class) {
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
