package defpackage;
/* compiled from: PG */
/* renamed from: dfyr  reason: default package */
/* loaded from: classes6.dex */
public final class dfyr extends dsqw<dfyr, dfyq> implements dssk {
    public static final dfyr b;
    private static volatile dssr<dfyr> d;
    public String a = "";
    private int c;

    static {
        dfyr dfyrVar = new dfyr();
        b = dfyrVar;
        dsqw.cc(dfyr.class, dfyrVar);
    }

    private dfyr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dfyr();
            }
            if (i2 == 4) {
                return new dfyq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfyr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfyr.class) {
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
