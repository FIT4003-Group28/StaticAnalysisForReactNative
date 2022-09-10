package defpackage;
/* compiled from: PG */
/* renamed from: dlgx  reason: default package */
/* loaded from: classes6.dex */
public final class dlgx extends dsqw<dlgx, dlgw> implements dssk {
    public static final dlgx f;
    private static volatile dssr<dlgx> h;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    private int g;

    static {
        dlgx dlgxVar = new dlgx();
        f = dlgxVar;
        dsqw.cc(dlgx.class, dlgxVar);
    }

    private dlgx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\bဈ\u0002\tဈ\u0003", new Object[]{"g", "a", "b", "e", "c", "d"});
            }
            if (i2 == 3) {
                return new dlgx();
            }
            if (i2 == 4) {
                return new dlgw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlgx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlgx.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
