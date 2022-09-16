package defpackage;
/* compiled from: PG */
/* renamed from: djys  reason: default package */
/* loaded from: classes6.dex */
public final class djys extends dsqw<djys, djyr> implements dssk {
    public static final djys g;
    private static volatile dssr<djys> h;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public dhkd e;
    public int f;

    static {
        djys djysVar = new djys();
        g = djysVar;
        dsqw.cc(djys.class, djysVar);
    }

    private djys() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003ဉ\u0003\u0004ဋ\u0004\u0005ဈ\u0001", new Object[]{"a", "b", "d", doos.c(), "e", "f", "c"});
            }
            if (i2 == 3) {
                return new djys();
            }
            if (i2 == 4) {
                return new djyr();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djys> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djys.class) {
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
