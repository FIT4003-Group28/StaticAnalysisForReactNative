package defpackage;
/* compiled from: PG */
/* renamed from: dfxi  reason: default package */
/* loaded from: classes6.dex */
public final class dfxi extends dsqw<dfxi, dfxg> implements dssk {
    public static final dfxi c;
    private static volatile dssr<dfxi> d;
    public int a;
    public int b;

    static {
        dfxi dfxiVar = new dfxi();
        c = dfxiVar;
        dsqw.cc(dfxi.class, dfxiVar);
    }

    private dfxi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dfxh.a});
            }
            if (i2 == 3) {
                return new dfxi();
            }
            if (i2 == 4) {
                return new dfxg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfxi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfxi.class) {
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
