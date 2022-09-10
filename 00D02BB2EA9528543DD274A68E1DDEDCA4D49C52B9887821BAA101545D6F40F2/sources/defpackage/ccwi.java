package defpackage;
/* compiled from: PG */
/* renamed from: ccwi  reason: default package */
/* loaded from: classes4.dex */
public final class ccwi extends dsqw<ccwi, ccwh> implements dssk {
    public static final dsrg<Integer, ccvz> e = new ccwg();
    public static final ccwi g;
    private static volatile dssr<ccwi> h;
    public int a;
    public int b;
    public ccxa c;
    public dsrf d = dsqz.b;
    public String f = "";

    static {
        ccwi ccwiVar = new ccwi();
        g = ccwiVar;
        dsqw.cc(ccwi.class, ccwiVar);
    }

    private ccwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003\u001e\u0004ဈ\u0002", new Object[]{"a", "b", dgfb.c(), "c", "d", ccvz.c(), "f"});
            }
            if (i2 == 3) {
                return new ccwi();
            }
            if (i2 == 4) {
                return new ccwh();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccwi> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ccwi.class) {
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
