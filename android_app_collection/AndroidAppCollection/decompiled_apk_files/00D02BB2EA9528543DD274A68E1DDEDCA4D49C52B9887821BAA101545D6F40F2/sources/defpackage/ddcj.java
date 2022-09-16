package defpackage;
/* compiled from: PG */
/* renamed from: ddcj  reason: default package */
/* loaded from: classes.dex */
public final class ddcj extends dsqw<ddcj, ddcg> implements dssk {
    public static final ddcj g;
    private static volatile dssr<ddcj> h;
    public int a;
    public int e;
    public String b = "";
    public String c = "";
    public String d = "";
    public dsrj<String> f = dssu.b;

    static {
        ddcj ddcjVar = new ddcj();
        g = ddcjVar;
        dsqw.cc(ddcj.class, ddcjVar);
    }

    private ddcj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005\u001a", new Object[]{"a", "b", "c", "d", "e", ddci.c(), "f"});
            }
            if (i2 == 3) {
                return new ddcj();
            }
            if (i2 == 4) {
                return new ddcg();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddcj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddcj.class) {
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
