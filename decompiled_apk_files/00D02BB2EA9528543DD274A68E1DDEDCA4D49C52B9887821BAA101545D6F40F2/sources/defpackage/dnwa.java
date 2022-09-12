package defpackage;
/* compiled from: PG */
/* renamed from: dnwa  reason: default package */
/* loaded from: classes6.dex */
public final class dnwa extends dsqw<dnwa, dnvz> implements dssk {
    public static final dnwa a;
    private static volatile dssr<dnwa> b;

    static {
        dnwa dnwaVar = new dnwa();
        a = dnwaVar;
        dsqw.cc(dnwa.class, dnwaVar);
    }

    private dnwa() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnwa();
            }
            if (i2 == 4) {
                return new dnvz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnwa> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnwa.class) {
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
