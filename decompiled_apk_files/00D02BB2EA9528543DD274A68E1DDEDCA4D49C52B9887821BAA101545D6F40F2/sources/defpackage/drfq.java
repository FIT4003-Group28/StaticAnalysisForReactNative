package defpackage;
/* compiled from: PG */
/* renamed from: drfq  reason: default package */
/* loaded from: classes6.dex */
public final class drfq extends dsqw<drfq, drfp> implements dssk {
    public static final drfq a;
    private static volatile dssr<drfq> b;

    static {
        drfq drfqVar = new drfq();
        a = drfqVar;
        dsqw.cc(drfq.class, drfqVar);
    }

    private drfq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new drfq();
            }
            if (i2 == 4) {
                return new drfp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drfq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (drfq.class) {
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
