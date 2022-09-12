package defpackage;
/* compiled from: PG */
/* renamed from: dnpq  reason: default package */
/* loaded from: classes.dex */
public final class dnpq extends dsqw<dnpq, dnpp> implements dssk {
    public static final dnpq g;
    private static volatile dssr<dnpq> h;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dnpq dnpqVar = new dnpq();
        g = dnpqVar;
        dsqw.cc(dnpq.class, dnpqVar);
    }

    private dnpq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဈ\u0000\u0006ဈ\u0005", new Object[]{"a", "c", "d", "e", "b", "f"});
            }
            if (i2 == 3) {
                return new dnpq();
            }
            if (i2 == 4) {
                return new dnpp();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnpq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnpq.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
