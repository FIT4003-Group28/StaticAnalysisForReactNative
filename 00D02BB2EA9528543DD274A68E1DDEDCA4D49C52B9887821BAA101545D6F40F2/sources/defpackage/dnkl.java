package defpackage;
/* compiled from: PG */
/* renamed from: dnkl  reason: default package */
/* loaded from: classes6.dex */
public final class dnkl extends dsqw<dnkl, dnkk> implements dssk {
    public static final dnkl a;
    private static volatile dssr<dnkl> b;

    static {
        dnkl dnklVar = new dnkl();
        a = dnklVar;
        dsqw.cc(dnkl.class, dnklVar);
    }

    private dnkl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnkl();
            }
            if (i2 == 4) {
                return new dnkk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnkl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnkl.class) {
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
