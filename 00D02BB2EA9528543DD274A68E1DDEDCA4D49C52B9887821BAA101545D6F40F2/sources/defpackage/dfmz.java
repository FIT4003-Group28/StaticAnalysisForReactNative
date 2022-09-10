package defpackage;
/* compiled from: PG */
/* renamed from: dfmz  reason: default package */
/* loaded from: classes6.dex */
public final class dfmz extends dsqw<dfmz, dfmy> implements dssk {
    public static final dfmz d;
    private static volatile dssr<dfmz> f;
    public double a;
    public double b;
    public double c;
    private int e;

    static {
        dfmz dfmzVar = new dfmz();
        d = dfmzVar;
        dsqw.cc(dfmz.class, dfmzVar);
    }

    private dfmz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfmz();
            }
            if (i2 == 4) {
                return new dfmy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfmz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfmz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
