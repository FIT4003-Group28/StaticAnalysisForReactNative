package defpackage;
/* compiled from: PG */
/* renamed from: dnup  reason: default package */
/* loaded from: classes6.dex */
public final class dnup extends dsqw<dnup, dnuo> implements dssk {
    public static final dnup a;
    private static volatile dssr<dnup> b;

    static {
        dnup dnupVar = new dnup();
        a = dnupVar;
        dsqw.cc(dnup.class, dnupVar);
    }

    private dnup() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnup();
            }
            if (i2 == 4) {
                return new dnuo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnup> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnup.class) {
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
