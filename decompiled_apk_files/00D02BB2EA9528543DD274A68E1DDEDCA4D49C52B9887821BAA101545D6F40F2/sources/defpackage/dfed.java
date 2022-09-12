package defpackage;
/* compiled from: PG */
/* renamed from: dfed  reason: default package */
/* loaded from: classes6.dex */
public final class dfed extends dsqw<dfed, dfec> implements dssk {
    public static final dfed c;
    private static volatile dssr<dfed> d;
    public int a = 0;
    public Object b;

    static {
        dfed dfedVar = new dfed();
        c = dfedVar;
        dsqw.cc(dfed.class, dfedVar);
    }

    private dfed() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဳ\u0000\u0003ြ\u0000", new Object[]{"b", "a", dfdx.class});
            }
            if (i2 == 3) {
                return new dfed();
            }
            if (i2 == 4) {
                return new dfec();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfed> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfed.class) {
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
