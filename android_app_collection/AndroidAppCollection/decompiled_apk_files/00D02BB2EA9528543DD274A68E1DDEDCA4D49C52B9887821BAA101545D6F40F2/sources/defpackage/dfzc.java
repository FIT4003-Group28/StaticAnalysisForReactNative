package defpackage;
/* compiled from: PG */
/* renamed from: dfzc  reason: default package */
/* loaded from: classes6.dex */
public final class dfzc extends dsqw<dfzc, dfzb> implements dssk {
    public static final dfzc b;
    private static volatile dssr<dfzc> d;
    public dgbo a;
    private int c;

    static {
        dfzc dfzcVar = new dfzc();
        b = dfzcVar;
        dsqw.cc(dfzc.class, dfzcVar);
    }

    private dfzc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dfzc();
            }
            if (i2 == 4) {
                return new dfzb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfzc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfzc.class) {
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
