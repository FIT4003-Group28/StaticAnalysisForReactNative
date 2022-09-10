package defpackage;
/* compiled from: PG */
/* renamed from: dqmc  reason: default package */
/* loaded from: classes6.dex */
public final class dqmc extends dsqw<dqmc, dqma> implements dssk {
    public static final dqmc c;
    private static volatile dssr<dqmc> d;
    public int a;
    public int b;

    static {
        dqmc dqmcVar = new dqmc();
        c = dqmcVar;
        dsqw.cc(dqmc.class, dqmcVar);
    }

    private dqmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqmb.a});
            }
            if (i2 == 3) {
                return new dqmc();
            }
            if (i2 == 4) {
                return new dqma();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqmc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqmc.class) {
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
