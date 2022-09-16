package defpackage;
/* compiled from: PG */
/* renamed from: dpev  reason: default package */
/* loaded from: classes.dex */
public final class dpev extends dsqw<dpev, dper> implements dssk {
    public static final dpev g;
    private static volatile dssr<dpev> h;
    public int a;
    public dspd b = dspd.b;
    public boolean c;
    public int d;
    public int e;
    public int f;

    static {
        dpev dpevVar = new dpev();
        g = dpevVar;
        dsqw.cc(dpev.class, dpevVar);
    }

    private dpev() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001ည\u0000\u0005ဇ\u0004\u0006ဌ\u0006\u0007ဌ\u0007\nဌ\b", new Object[]{"a", "b", "c", "d", dpet.a, "e", dpeu.a, "f", dpes.a});
            }
            if (i2 == 3) {
                return new dpev();
            }
            if (i2 == 4) {
                return new dper();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpev> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dpev.class) {
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
