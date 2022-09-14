package defpackage;
/* compiled from: PG */
/* renamed from: dfow  reason: default package */
/* loaded from: classes6.dex */
public final class dfow extends dsqw<dfow, dfov> implements dssk {
    public static final dfow c;
    private static volatile dssr<dfow> d;
    public int a;
    public String b = "";

    static {
        dfow dfowVar = new dfow();
        c = dfowVar;
        dsqw.cc(dfow.class, dfowVar);
    }

    private dfow() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dfow();
            }
            if (i2 == 4) {
                return new dfov();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfow> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfow.class) {
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
