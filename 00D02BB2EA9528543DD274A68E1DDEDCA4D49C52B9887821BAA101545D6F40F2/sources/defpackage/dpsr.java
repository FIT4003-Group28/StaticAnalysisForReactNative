package defpackage;
/* compiled from: PG */
/* renamed from: dpsr  reason: default package */
/* loaded from: classes6.dex */
public final class dpsr extends dsqw<dpsr, dpsq> implements dssk {
    public static final dpsr c;
    private static volatile dssr<dpsr> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dpsr dpsrVar = new dpsr();
        c = dpsrVar;
        dsqw.cc(dpsr.class, dpsrVar);
    }

    private dpsr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpsr();
            }
            if (i2 == 4) {
                return new dpsq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpsr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpsr.class) {
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
