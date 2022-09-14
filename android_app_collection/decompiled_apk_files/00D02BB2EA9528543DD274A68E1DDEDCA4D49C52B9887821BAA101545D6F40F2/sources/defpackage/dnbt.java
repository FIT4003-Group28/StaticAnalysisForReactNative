package defpackage;
/* compiled from: PG */
/* renamed from: dnbt  reason: default package */
/* loaded from: classes.dex */
public final class dnbt extends dsqw<dnbt, dnbs> implements dssk {
    public static final dnbt a;
    private static volatile dssr<dnbt> b;

    static {
        dnbt dnbtVar = new dnbt();
        a = dnbtVar;
        dsqw.cc(dnbt.class, dnbtVar);
    }

    private dnbt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnbt();
            }
            if (i2 == 4) {
                return new dnbs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnbt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnbt.class) {
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
