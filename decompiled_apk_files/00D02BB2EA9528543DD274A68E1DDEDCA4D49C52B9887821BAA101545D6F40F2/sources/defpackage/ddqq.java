package defpackage;
/* compiled from: PG */
/* renamed from: ddqq  reason: default package */
/* loaded from: classes6.dex */
public final class ddqq extends dsqw<ddqq, ddqp> implements dssk {
    public static final ddqq a;
    private static volatile dssr<ddqq> b;

    static {
        ddqq ddqqVar = new ddqq();
        a = ddqqVar;
        dsqw.cc(ddqq.class, ddqqVar);
    }

    private ddqq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddqq();
            }
            if (i2 == 4) {
                return new ddqp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddqq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddqq.class) {
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
