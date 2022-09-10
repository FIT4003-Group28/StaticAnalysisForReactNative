package defpackage;
/* compiled from: PG */
/* renamed from: dhwg  reason: default package */
/* loaded from: classes6.dex */
public final class dhwg extends dsqw<dhwg, dhwd> implements dssk {
    public static final dhwg g;
    private static volatile dssr<dhwg> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public dhwf e;
    public boolean f;

    static {
        dhwg dhwgVar = new dhwg();
        g = dhwgVar;
        dsqw.cc(dhwg.class, dhwgVar);
    }

    private dhwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004င\u0003\u0005ဉ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dhwg();
            }
            if (i2 == 4) {
                return new dhwd();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhwg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dhwg.class) {
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
