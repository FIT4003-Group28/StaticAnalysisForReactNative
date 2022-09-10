package defpackage;
/* compiled from: PG */
/* renamed from: dnba  reason: default package */
/* loaded from: classes.dex */
public final class dnba extends dsqw<dnba, dnaz> implements dssk {
    public static final dnba a;
    private static volatile dssr<dnba> b;

    static {
        dnba dnbaVar = new dnba();
        a = dnbaVar;
        dsqw.cc(dnba.class, dnbaVar);
    }

    private dnba() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnba();
            }
            if (i2 == 4) {
                return new dnaz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnba> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnba.class) {
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
