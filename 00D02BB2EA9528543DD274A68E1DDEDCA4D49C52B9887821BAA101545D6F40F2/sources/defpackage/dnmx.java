package defpackage;
/* compiled from: PG */
/* renamed from: dnmx  reason: default package */
/* loaded from: classes6.dex */
public final class dnmx extends dsqw<dnmx, dnmw> implements dssk {
    public static final dnmx e;
    private static volatile dssr<dnmx> f;
    public int a;
    public int b;
    public String c = "";
    public boolean d;

    static {
        dnmx dnmxVar = new dnmx();
        e = dnmxVar;
        dsqw.cc(dnmx.class, dnmxVar);
    }

    private dnmx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnmx();
            }
            if (i2 == 4) {
                return new dnmw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnmx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnmx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
