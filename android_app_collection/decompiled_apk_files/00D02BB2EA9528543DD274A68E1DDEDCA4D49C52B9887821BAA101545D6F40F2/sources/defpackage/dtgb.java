package defpackage;
/* compiled from: PG */
/* renamed from: dtgb  reason: default package */
/* loaded from: classes.dex */
public final class dtgb extends dsqw<dtgb, dtga> implements dssk {
    public static final dtgb g;
    private static volatile dssr<dtgb> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";

    static {
        dtgb dtgbVar = new dtgb();
        g = dtgbVar;
        dsqw.cc(dtgb.class, dtgbVar);
    }

    private dtgb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဌ\u0003\u0006ဌ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", dtgj.a, "c", dtgh.c(), "d", dtgi.a, "e", dtge.a, "f"});
            }
            if (i2 == 3) {
                return new dtgb();
            }
            if (i2 == 4) {
                return new dtga();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtgb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtgb.class) {
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
