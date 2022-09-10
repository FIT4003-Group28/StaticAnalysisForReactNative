package defpackage;
/* compiled from: PG */
/* renamed from: dnzt  reason: default package */
/* loaded from: classes.dex */
public final class dnzt extends dsqw<dnzt, dnzs> implements dssk {
    public static final dnzt e;
    private static volatile dssr<dnzt> f;
    public int a;
    public dnpq b;
    public String c = "";
    public String d = "";

    static {
        dnzt dnztVar = new dnzt();
        e = dnztVar;
        dsqw.cc(dnzt.class, dnztVar);
    }

    private dnzt() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnzt();
            }
            if (i2 == 4) {
                return new dnzs();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnzt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnzt.class) {
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
