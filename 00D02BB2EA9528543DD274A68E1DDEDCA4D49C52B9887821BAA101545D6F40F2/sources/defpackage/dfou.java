package defpackage;
/* compiled from: PG */
/* renamed from: dfou  reason: default package */
/* loaded from: classes6.dex */
public final class dfou extends dsqw<dfou, dfot> implements dssk {
    public static final dfou c;
    private static volatile dssr<dfou> d;
    public int a;
    public int b;

    static {
        dfou dfouVar = new dfou();
        c = dfouVar;
        dsqw.cc(dfou.class, dfouVar);
    }

    private dfou() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dugu.c()});
            }
            if (i2 == 3) {
                return new dfou();
            }
            if (i2 == 4) {
                return new dfot();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfou> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfou.class) {
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
