package defpackage;
/* compiled from: PG */
/* renamed from: dnwp  reason: default package */
/* loaded from: classes6.dex */
public final class dnwp extends dsqw<dnwp, dnwo> implements dssk {
    public static final dnwp a;
    private static volatile dssr<dnwp> b;

    static {
        dnwp dnwpVar = new dnwp();
        a = dnwpVar;
        dsqw.cc(dnwp.class, dnwpVar);
    }

    private dnwp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnwp();
            }
            if (i2 == 4) {
                return new dnwo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnwp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnwp.class) {
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
