package defpackage;
/* compiled from: PG */
/* renamed from: dpwn  reason: default package */
/* loaded from: classes.dex */
public final class dpwn extends dsqw<dpwn, dpwm> implements dssk {
    public static final dpwn b;
    private static volatile dssr<dpwn> d;
    public boolean a;
    private int c;

    static {
        dpwn dpwnVar = new dpwn();
        b = dpwnVar;
        dsqw.cc(dpwn.class, dpwnVar);
    }

    private dpwn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpwn();
            }
            if (i2 == 4) {
                return new dpwm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpwn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpwn.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
