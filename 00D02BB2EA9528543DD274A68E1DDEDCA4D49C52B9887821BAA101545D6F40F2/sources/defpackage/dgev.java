package defpackage;
/* compiled from: PG */
/* renamed from: dgev  reason: default package */
/* loaded from: classes6.dex */
public final class dgev extends dsqw<dgev, dges> implements dssk {
    public static final dgev g;
    private static volatile dssr<dgev> h;
    public int a;
    public dgeu d;
    public dger e;
    public String b = "";
    public String c = "";
    public String f = "";

    static {
        dgev dgevVar = new dgev();
        g = dgevVar;
        dsqw.cc(dgev.class, dgevVar);
    }

    private dgev() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0002\u000b\u0005\u0000\u0000\u0000\u0002ဈ\u0002\u0003ဉ\u0005\u0007ဈ\u000b\nဈ\u0000\u000bဉ\u0004", new Object[]{"a", "c", "e", "f", "b", "d"});
            }
            if (i2 == 3) {
                return new dgev();
            }
            if (i2 == 4) {
                return new dges();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgev> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dgev.class) {
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
