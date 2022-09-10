package defpackage;
/* compiled from: PG */
/* renamed from: dfhz  reason: default package */
/* loaded from: classes6.dex */
public final class dfhz extends dsqw<dfhz, dfhy> implements dssk {
    public static final dfhz b;
    private static volatile dssr<dfhz> d;
    public double a;
    private int c;

    static {
        dfhz dfhzVar = new dfhz();
        b = dfhzVar;
        dsqw.cc(dfhz.class, dfhzVar);
    }

    private dfhz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dfhz();
            }
            if (i2 == 4) {
                return new dfhy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfhz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfhz.class) {
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
