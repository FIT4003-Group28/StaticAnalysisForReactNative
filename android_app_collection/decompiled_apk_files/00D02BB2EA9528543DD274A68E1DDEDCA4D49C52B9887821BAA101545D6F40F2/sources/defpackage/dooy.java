package defpackage;
/* compiled from: PG */
/* renamed from: dooy  reason: default package */
/* loaded from: classes6.dex */
public final class dooy extends dsqw<dooy, doox> implements dssk {
    public static final dooy g;
    private static volatile dssr<dooy> h;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public dhkd e;
    public int f;

    static {
        dooy dooyVar = new dooy();
        g = dooyVar;
        dsqw.cc(dooy.class, dooyVar);
    }

    private dooy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003ဉ\u0003\u0004ဋ\u0004\u0005ဈ\u0001", new Object[]{"a", "b", "d", doos.c(), "e", "f", "c"});
            }
            if (i2 == 3) {
                return new dooy();
            }
            if (i2 == 4) {
                return new doox();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dooy> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dooy.class) {
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
