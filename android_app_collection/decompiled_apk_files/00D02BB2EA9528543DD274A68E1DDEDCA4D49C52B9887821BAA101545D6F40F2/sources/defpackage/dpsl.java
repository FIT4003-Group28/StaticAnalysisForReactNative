package defpackage;
/* compiled from: PG */
/* renamed from: dpsl  reason: default package */
/* loaded from: classes6.dex */
public final class dpsl extends dsqw<dpsl, dpsk> implements dssk {
    public static final dpsl c;
    private static volatile dssr<dpsl> d;
    public int a;
    public int b;

    static {
        dpsl dpslVar = new dpsl();
        c = dpslVar;
        dsqw.cc(dpsl.class, dpslVar);
    }

    private dpsl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqgh.c()});
            }
            if (i2 == 3) {
                return new dpsl();
            }
            if (i2 == 4) {
                return new dpsk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpsl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpsl.class) {
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
