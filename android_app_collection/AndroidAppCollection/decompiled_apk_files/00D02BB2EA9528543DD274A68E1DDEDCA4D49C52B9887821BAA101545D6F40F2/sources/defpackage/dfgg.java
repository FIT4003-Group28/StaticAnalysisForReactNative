package defpackage;
/* compiled from: PG */
/* renamed from: dfgg  reason: default package */
/* loaded from: classes6.dex */
public final class dfgg extends dsqw<dfgg, dfgf> implements dssk {
    public static final dfgg c;
    private static volatile dssr<dfgg> d;
    public int a;
    public dfgo b;

    static {
        dfgg dfggVar = new dfgg();
        c = dfggVar;
        dsqw.cc(dfgg.class, dfggVar);
    }

    private dfgg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dfgg();
            }
            if (i2 == 4) {
                return new dfgf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfgg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfgg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
