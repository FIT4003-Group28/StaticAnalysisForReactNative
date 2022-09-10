package defpackage;
/* compiled from: PG */
/* renamed from: dpik  reason: default package */
/* loaded from: classes6.dex */
public final class dpik extends dsqw<dpik, dpij> implements dssk {
    public static final dpik c;
    private static volatile dssr<dpik> e;
    public int a;
    public int b;
    private int d;

    static {
        dpik dpikVar = new dpik();
        c = dpikVar;
        dsqw.cc(dpik.class, dpikVar);
    }

    private dpik() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", dpih.a, "b", dpif.a});
            }
            if (i2 == 3) {
                return new dpik();
            }
            if (i2 == 4) {
                return new dpij();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpik> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpik.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
