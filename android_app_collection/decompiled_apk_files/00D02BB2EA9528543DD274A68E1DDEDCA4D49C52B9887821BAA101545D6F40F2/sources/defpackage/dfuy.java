package defpackage;
/* compiled from: PG */
/* renamed from: dfuy  reason: default package */
/* loaded from: classes6.dex */
public final class dfuy extends dsqw<dfuy, dfux> implements dssk {
    public static final dfuy b;
    private static volatile dssr<dfuy> d;
    public String a = "";
    private int c;

    static {
        dfuy dfuyVar = new dfuy();
        b = dfuyVar;
        dsqw.cc(dfuy.class, dfuyVar);
    }

    private dfuy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dfuy();
            }
            if (i2 == 4) {
                return new dfux();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfuy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfuy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
