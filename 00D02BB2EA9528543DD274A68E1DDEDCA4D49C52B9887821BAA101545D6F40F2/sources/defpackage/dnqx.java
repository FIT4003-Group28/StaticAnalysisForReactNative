package defpackage;
/* compiled from: PG */
/* renamed from: dnqx  reason: default package */
/* loaded from: classes6.dex */
public final class dnqx extends dsqw<dnqx, dnqw> implements dssk {
    public static final dnqx e;
    private static volatile dssr<dnqx> f;
    public int a;
    public dnsc b;
    public dnrd c;
    public dnsf d;

    static {
        dnqx dnqxVar = new dnqx();
        e = dnqxVar;
        dsqw.cc(dnqx.class, dnqxVar);
    }

    private dnqx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0004ဉ\u0001", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dnqx();
            }
            if (i2 == 4) {
                return new dnqw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnqx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnqx.class) {
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
