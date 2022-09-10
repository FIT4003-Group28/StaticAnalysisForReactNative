package defpackage;
/* compiled from: PG */
/* renamed from: douu  reason: default package */
/* loaded from: classes6.dex */
public final class douu extends dsqw<douu, dout> implements dssk {
    public static final douu b;
    private static volatile dssr<douu> d;
    public int a;
    private int c;

    static {
        douu douuVar = new douu();
        b = douuVar;
        dsqw.cc(douu.class, douuVar);
    }

    private douu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dqtz.c()});
            }
            if (i2 == 3) {
                return new douu();
            }
            if (i2 == 4) {
                return new dout();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<douu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (douu.class) {
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
