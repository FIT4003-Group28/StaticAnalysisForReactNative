package defpackage;
/* compiled from: PG */
/* renamed from: dffo  reason: default package */
/* loaded from: classes6.dex */
public final class dffo extends dsqw<dffo, dffl> implements dssk {
    public static final dffo g;
    private static volatile dssr<dffo> i;
    public dfgq a;
    public dfhz b;
    public double c;
    public int d;
    public double e;
    public double f;
    private int h;

    static {
        dffo dffoVar = new dffo();
        g = dffoVar;
        dsqw.cc(dffo.class, dffoVar);
    }

    private dffo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003က\u0002\u0004ဌ\u0003\u0005က\u0004\u0006က\u0005", new Object[]{"h", "a", "b", "c", "d", dffm.a, "e", "f"});
            }
            if (i3 == 3) {
                return new dffo();
            }
            if (i3 == 4) {
                return new dffl();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dffo> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dffo.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
