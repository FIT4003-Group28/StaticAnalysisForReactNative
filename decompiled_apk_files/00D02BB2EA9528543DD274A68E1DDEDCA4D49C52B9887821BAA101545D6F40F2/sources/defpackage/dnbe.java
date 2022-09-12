package defpackage;
/* compiled from: PG */
/* renamed from: dnbe  reason: default package */
/* loaded from: classes.dex */
public final class dnbe extends dsqw<dnbe, dnbd> implements dssk {
    public static final dnbe a;
    private static volatile dssr<dnbe> b;

    static {
        dnbe dnbeVar = new dnbe();
        a = dnbeVar;
        dsqw.cc(dnbe.class, dnbeVar);
    }

    private dnbe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnbe();
            }
            if (i2 == 4) {
                return new dnbd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnbe> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnbe.class) {
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
