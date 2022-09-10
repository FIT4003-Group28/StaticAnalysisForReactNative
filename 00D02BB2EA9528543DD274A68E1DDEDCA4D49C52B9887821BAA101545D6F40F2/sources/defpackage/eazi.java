package defpackage;
/* compiled from: PG */
/* renamed from: eazi  reason: default package */
/* loaded from: classes6.dex */
public final class eazi extends dsqw<eazi, eazh> implements dssk {
    public static final eazi e;
    private static volatile dssr<eazi> f;
    public int a;
    public int b;
    public long c;
    public int d;

    static {
        eazi eaziVar = new eazi();
        e = eaziVar;
        dsqw.cc(eazi.class, eaziVar);
    }

    private eazi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", eazj.a, "c", "d", eayp.a});
            }
            if (i2 == 3) {
                return new eazi();
            }
            if (i2 == 4) {
                return new eazh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eazi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (eazi.class) {
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
