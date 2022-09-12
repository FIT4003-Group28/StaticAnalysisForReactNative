package defpackage;
/* compiled from: PG */
/* renamed from: dpyh  reason: default package */
/* loaded from: classes6.dex */
public final class dpyh extends dsqw<dpyh, dpyg> implements dssk {
    public static final dpyh a;
    private static volatile dssr<dpyh> b;

    static {
        dpyh dpyhVar = new dpyh();
        a = dpyhVar;
        dsqw.cc(dpyh.class, dpyhVar);
    }

    private dpyh() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dpyh();
            }
            if (i2 == 4) {
                return new dpyg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpyh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dpyh.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
