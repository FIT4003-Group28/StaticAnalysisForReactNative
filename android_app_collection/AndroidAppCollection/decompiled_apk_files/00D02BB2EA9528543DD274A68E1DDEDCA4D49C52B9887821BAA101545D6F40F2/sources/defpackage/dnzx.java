package defpackage;
/* compiled from: PG */
/* renamed from: dnzx  reason: default package */
/* loaded from: classes6.dex */
public final class dnzx extends dsqw<dnzx, dnzw> implements dssk {
    public static final dnzx e;
    private static volatile dssr<dnzx> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        dnzx dnzxVar = new dnzx();
        e = dnzxVar;
        dsqw.cc(dnzx.class, dnzxVar);
    }

    private dnzx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0005ဈ\u0004", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnzx();
            }
            if (i2 == 4) {
                return new dnzw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnzx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnzx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
