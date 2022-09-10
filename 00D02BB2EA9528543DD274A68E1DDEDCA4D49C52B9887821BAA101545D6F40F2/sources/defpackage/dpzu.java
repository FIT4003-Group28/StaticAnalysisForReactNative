package defpackage;
/* compiled from: PG */
/* renamed from: dpzu  reason: default package */
/* loaded from: classes.dex */
public final class dpzu extends dsqw<dpzu, dpzt> implements dssk {
    public static final dpzu b;
    private static volatile dssr<dpzu> c;
    public dsrj<dqfj> a = dssu.b;

    static {
        dpzu dpzuVar = new dpzu();
        b = dpzuVar;
        dsqw.cc(dpzu.class, dpzuVar);
    }

    private dpzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqfj.class});
            }
            if (i2 == 3) {
                return new dpzu();
            }
            if (i2 == 4) {
                return new dpzt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpzu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dpzu.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
