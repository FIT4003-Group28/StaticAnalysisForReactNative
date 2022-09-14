package defpackage;
/* compiled from: PG */
/* renamed from: dfqi  reason: default package */
/* loaded from: classes6.dex */
public final class dfqi extends dsqw<dfqi, dfqh> implements dssk {
    public static final dfqi e;
    private static volatile dssr<dfqi> f;
    public int a;
    public double b;
    public double c;
    public double d;

    static {
        dfqi dfqiVar = new dfqi();
        e = dfqiVar;
        dsqw.cc(dfqi.class, dfqiVar);
    }

    private dfqi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dfqi();
            }
            if (i2 == 4) {
                return new dfqh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfqi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfqi.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
