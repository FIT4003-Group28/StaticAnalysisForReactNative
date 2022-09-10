package defpackage;
/* compiled from: PG */
/* renamed from: dfgx  reason: default package */
/* loaded from: classes6.dex */
public final class dfgx extends dsqw<dfgx, dfgw> implements dssk {
    public static final dfgx g;
    private static volatile dssr<dfgx> h;
    public int a;
    public dfgo b;
    public int c;
    public float d;
    public int e;
    public int f = -1;

    static {
        dfgx dfgxVar = new dfgx();
        g = dfgxVar;
        dsqw.cc(dfgx.class, dfgxVar);
    }

    private dfgx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ခ\u0002\u0004ဌ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", dgau.c(), "d", "e", dfgy.a, "f"});
            }
            if (i2 == 3) {
                return new dfgx();
            }
            if (i2 == 4) {
                return new dfgw();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfgx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dfgx.class) {
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
