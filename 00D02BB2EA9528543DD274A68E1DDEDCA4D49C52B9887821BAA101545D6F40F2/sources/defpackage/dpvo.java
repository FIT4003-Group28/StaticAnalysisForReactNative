package defpackage;
/* compiled from: PG */
/* renamed from: dpvo  reason: default package */
/* loaded from: classes6.dex */
public final class dpvo extends dsqw<dpvo, dpvn> implements dssk {
    public static final dpvo e;
    private static volatile dssr<dpvo> g;
    public Object b;
    public boolean d;
    private int f;
    public int a = 0;
    public String c = "";

    static {
        dpvo dpvoVar = new dpvo();
        e = dpvoVar;
        dsqw.cc(dpvo.class, dpvoVar);
    }

    private dpvo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ြ\u0000\u0003ဈ\u0000\u0004ဇ\u0001", new Object[]{"b", "a", "f", dqhn.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dpvo();
            }
            if (i2 == 4) {
                return new dpvn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpvo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpvo.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
