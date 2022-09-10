package defpackage;
/* compiled from: PG */
/* renamed from: dmtg  reason: default package */
/* loaded from: classes.dex */
public final class dmtg extends dsqw<dmtg, dmtf> implements dssk {
    public static final dmtg g;
    private static volatile dssr<dmtg> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        dmtg dmtgVar = new dmtg();
        g = dmtgVar;
        dsqw.cc(dmtg.class, dmtgVar);
    }

    private dmtg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဆ\u0000\u0002င\u0001\u0003ဆ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dmtg();
            }
            if (i2 == 4) {
                return new dmtf();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmtg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmtg.class) {
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
