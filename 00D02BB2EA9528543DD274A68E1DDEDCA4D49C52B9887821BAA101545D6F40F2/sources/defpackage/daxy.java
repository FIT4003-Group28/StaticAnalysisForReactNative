package defpackage;
/* compiled from: PG */
/* renamed from: daxy  reason: default package */
/* loaded from: classes5.dex */
public final class daxy extends dsqw<daxy, daxx> implements dssk {
    public static final daxy b;
    private static volatile dssr<daxy> d;
    public int a = 1;
    private int c;

    static {
        daxy daxyVar = new daxy();
        b = daxyVar;
        dsqw.cc(daxy.class, daxyVar);
    }

    private daxy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"c", "a", daxv.a});
            }
            if (i2 == 3) {
                return new daxy();
            }
            if (i2 == 4) {
                return new daxx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daxy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (daxy.class) {
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
