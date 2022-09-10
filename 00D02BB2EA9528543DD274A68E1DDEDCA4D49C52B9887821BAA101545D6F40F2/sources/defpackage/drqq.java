package defpackage;
/* compiled from: PG */
/* renamed from: drqq  reason: default package */
/* loaded from: classes6.dex */
public final class drqq extends dsqw<drqq, drqp> implements dssk {
    public static final drqq a;
    private static volatile dssr<drqq> b;

    static {
        drqq drqqVar = new drqq();
        a = drqqVar;
        dsqw.cc(drqq.class, drqqVar);
    }

    private drqq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drqq();
            }
            if (i2 == 4) {
                return new drqp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drqq.class) {
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
