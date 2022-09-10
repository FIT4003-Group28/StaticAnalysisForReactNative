package defpackage;
/* compiled from: PG */
/* renamed from: dnbc  reason: default package */
/* loaded from: classes.dex */
public final class dnbc extends dsqw<dnbc, dnbb> implements dssk {
    public static final dnbc c;
    private static volatile dssr<dnbc> d;
    public int a;
    public dnpo b;

    static {
        dnbc dnbcVar = new dnbc();
        c = dnbcVar;
        dsqw.cc(dnbc.class, dnbcVar);
    }

    private dnbc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnbc();
            }
            if (i2 == 4) {
                return new dnbb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnbc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnbc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
