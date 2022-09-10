package defpackage;
/* compiled from: PG */
/* renamed from: dpcx  reason: default package */
/* loaded from: classes6.dex */
public final class dpcx extends dsqw<dpcx, dpcs> implements dssk {
    public static final dpcx g;
    private static volatile dssr<dpcx> h;
    public int a;
    public String b = "";
    public dpcu c;
    public dpcw d;
    public int e;
    public int f;

    static {
        dpcx dpcxVar = new dpcx();
        g = dpcxVar;
        dsqw.cc(dpcx.class, dpcxVar);
    }

    private dpcx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dpcx();
            }
            if (i2 == 4) {
                return new dpcs();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpcx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dpcx.class) {
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
