package defpackage;
/* compiled from: PG */
/* renamed from: dhwu  reason: default package */
/* loaded from: classes6.dex */
public final class dhwu extends dsqw<dhwu, dhwt> implements dssk {
    public static final dhwu b;
    private static volatile dssr<dhwu> d;
    public dgak a;
    private int c;

    static {
        dhwu dhwuVar = new dhwu();
        b = dhwuVar;
        dsqw.cc(dhwu.class, dhwuVar);
    }

    private dhwu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhwu();
            }
            if (i2 == 4) {
                return new dhwt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhwu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhwu.class) {
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
