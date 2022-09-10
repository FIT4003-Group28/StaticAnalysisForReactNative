package defpackage;
/* compiled from: PG */
/* renamed from: dnry  reason: default package */
/* loaded from: classes6.dex */
public final class dnry extends dsqw<dnry, dnrx> implements dssk {
    public static final dnry a;
    private static volatile dssr<dnry> b;

    static {
        dnry dnryVar = new dnry();
        a = dnryVar;
        dsqw.cc(dnry.class, dnryVar);
    }

    private dnry() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnry();
            }
            if (i2 == 4) {
                return new dnrx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnry> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnry.class) {
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
