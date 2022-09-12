package defpackage;
/* compiled from: PG */
/* renamed from: dfwt  reason: default package */
/* loaded from: classes6.dex */
public final class dfwt extends dsqw<dfwt, dfws> implements dssk {
    public static final dfwt b;
    private static volatile dssr<dfwt> d;
    public dfwp a;
    private int c;

    static {
        dfwt dfwtVar = new dfwt();
        b = dfwtVar;
        dsqw.cc(dfwt.class, dfwtVar);
    }

    private dfwt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dfwt();
            }
            if (i2 == 4) {
                return new dfws();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfwt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfwt.class) {
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
