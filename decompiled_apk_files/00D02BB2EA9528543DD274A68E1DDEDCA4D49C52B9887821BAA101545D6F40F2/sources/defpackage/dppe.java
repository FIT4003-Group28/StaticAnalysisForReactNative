package defpackage;
/* compiled from: PG */
/* renamed from: dppe  reason: default package */
/* loaded from: classes6.dex */
public final class dppe extends dsqw<dppe, dppb> implements dssk {
    public static final dppe g;
    private static volatile dssr<dppe> h;
    public int a;
    public dppv b;
    public String c = "";
    public String d = "";
    public String e = "";
    public dppd f;

    static {
        dppe dppeVar = new dppe();
        g = dppeVar;
        dsqw.cc(dppe.class, dppeVar);
    }

    private dppe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dppe();
            }
            if (i2 == 4) {
                return new dppb();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dppe> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dppe.class) {
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
