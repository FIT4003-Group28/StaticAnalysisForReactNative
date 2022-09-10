package defpackage;
/* compiled from: PG */
/* renamed from: dfgo  reason: default package */
/* loaded from: classes6.dex */
public final class dfgo extends dsqw<dfgo, dfgn> implements dssk {
    public static final dfgo d;
    private static volatile dssr<dfgo> e;
    public int a;
    public double b;
    public double c;

    static {
        dfgo dfgoVar = new dfgo();
        d = dfgoVar;
        dsqw.cc(dfgo.class, dfgoVar);
    }

    private dfgo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfgo();
            }
            if (i2 == 4) {
                return new dfgn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfgo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfgo.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
