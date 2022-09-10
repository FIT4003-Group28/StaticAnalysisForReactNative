package defpackage;
/* compiled from: PG */
/* renamed from: dfla  reason: default package */
/* loaded from: classes6.dex */
public final class dfla extends dsqw<dfla, dfkx> implements dssk {
    public static final dfla e;
    private static volatile dssr<dfla> f;
    public int a;
    public int b;
    public double c;
    public double d;

    static {
        dfla dflaVar = new dfla();
        e = dflaVar;
        dsqw.cc(dfla.class, dflaVar);
    }

    private dfla() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"a", "b", dfky.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dfla();
            }
            if (i2 == 4) {
                return new dfkx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfla> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfla.class) {
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
