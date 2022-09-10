package defpackage;
/* compiled from: PG */
/* renamed from: daqi  reason: default package */
/* loaded from: classes.dex */
public final class daqi extends dsqw<daqi, daqh> implements dssk {
    public static final daqi b;
    private static volatile dssr<daqi> d;
    public boolean a;
    private int c;

    static {
        daqi daqiVar = new daqi();
        b = daqiVar;
        dsqw.cc(daqi.class, daqiVar);
    }

    private daqi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဇ\u0004", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new daqi();
            }
            if (i2 == 4) {
                return new daqh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daqi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (daqi.class) {
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
