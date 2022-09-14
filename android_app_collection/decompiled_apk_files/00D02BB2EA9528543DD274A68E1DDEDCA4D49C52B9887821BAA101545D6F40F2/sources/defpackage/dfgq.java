package defpackage;
/* compiled from: PG */
/* renamed from: dfgq  reason: default package */
/* loaded from: classes6.dex */
public final class dfgq extends dsqw<dfgq, dfgp> implements dssk {
    public static final dfgq d;
    private static volatile dssr<dfgq> f;
    public double a;
    public double b;
    public double c;
    private int e;

    static {
        dfgq dfgqVar = new dfgq();
        d = dfgqVar;
        dsqw.cc(dfgq.class, dfgqVar);
    }

    private dfgq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfgq();
            }
            if (i2 == 4) {
                return new dfgp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfgq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfgq.class) {
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
