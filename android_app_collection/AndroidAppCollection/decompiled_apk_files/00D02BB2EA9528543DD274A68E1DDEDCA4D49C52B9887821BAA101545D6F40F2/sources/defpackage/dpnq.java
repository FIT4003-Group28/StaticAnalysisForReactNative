package defpackage;
/* compiled from: PG */
/* renamed from: dpnq  reason: default package */
/* loaded from: classes6.dex */
public final class dpnq extends dsqw<dpnq, dpnp> implements dssk {
    public static final dpnq a;
    private static volatile dssr<dpnq> b;

    static {
        dpnq dpnqVar = new dpnq();
        a = dpnqVar;
        dsqw.cc(dpnq.class, dpnqVar);
    }

    private dpnq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dpnq();
            }
            if (i2 == 4) {
                return new dpnp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpnq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dpnq.class) {
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
