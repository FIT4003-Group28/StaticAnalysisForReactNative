package defpackage;
/* compiled from: PG */
/* renamed from: dfyp  reason: default package */
/* loaded from: classes6.dex */
public final class dfyp extends dsqw<dfyp, dfyo> implements dssk {
    public static final dfyp d;
    private static volatile dssr<dfyp> e;
    public int a;
    public dgly b;
    public dgly c;

    static {
        dfyp dfypVar = new dfyp();
        d = dfypVar;
        dsqw.cc(dfyp.class, dfypVar);
    }

    private dfyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfyp();
            }
            if (i2 == 4) {
                return new dfyo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfyp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfyp.class) {
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
