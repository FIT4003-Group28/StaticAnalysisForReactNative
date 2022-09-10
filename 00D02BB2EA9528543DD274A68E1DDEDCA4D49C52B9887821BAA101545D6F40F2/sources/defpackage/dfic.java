package defpackage;
/* compiled from: PG */
/* renamed from: dfic  reason: default package */
/* loaded from: classes6.dex */
public final class dfic extends dsqw<dfic, dfib> implements dssk {
    public static final dfic c;
    private static volatile dssr<dfic> d;
    public int a;
    public boolean b;

    static {
        dfic dficVar = new dfic();
        c = dficVar;
        dsqw.cc(dfic.class, dficVar);
    }

    private dfic() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dfic();
            }
            if (i2 == 4) {
                return new dfib();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfic> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfic.class) {
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
