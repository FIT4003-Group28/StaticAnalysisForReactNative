package defpackage;
/* compiled from: PG */
/* renamed from: dfve  reason: default package */
/* loaded from: classes6.dex */
public final class dfve extends dsqw<dfve, dfvd> implements dssk {
    public static final dfve g;
    private static volatile dssr<dfve> h;
    public int a;
    public boolean b;
    public double c;
    public double d;
    public double e;
    public long f;

    static {
        dfve dfveVar = new dfve();
        g = dfveVar;
        dsqw.cc(dfve.class, dfveVar);
    }

    private dfve() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005ဃ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dfve();
            }
            if (i2 == 4) {
                return new dfvd();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfve> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dfve.class) {
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
