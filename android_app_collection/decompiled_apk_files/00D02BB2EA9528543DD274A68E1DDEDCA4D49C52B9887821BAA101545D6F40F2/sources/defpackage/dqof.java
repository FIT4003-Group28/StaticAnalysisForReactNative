package defpackage;
/* compiled from: PG */
/* renamed from: dqof  reason: default package */
/* loaded from: classes6.dex */
public final class dqof extends dsqw<dqof, dqoc> implements dssk {
    public static final dqof c;
    private static volatile dssr<dqof> d;
    public int a;
    public int b;

    static {
        dqof dqofVar = new dqof();
        c = dqofVar;
        dsqw.cc(dqof.class, dqofVar);
    }

    private dqof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqod.a});
            }
            if (i2 == 3) {
                return new dqof();
            }
            if (i2 == 4) {
                return new dqoc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqof> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqof.class) {
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
