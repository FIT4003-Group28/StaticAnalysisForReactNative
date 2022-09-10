package defpackage;
/* compiled from: PG */
/* renamed from: dhzq  reason: default package */
/* loaded from: classes6.dex */
public final class dhzq extends dsqw<dhzq, dhzp> implements dssk {
    public static final dhzq b;
    private static volatile dssr<dhzq> d;
    public dgak a;
    private int c;

    static {
        dhzq dhzqVar = new dhzq();
        b = dhzqVar;
        dsqw.cc(dhzq.class, dhzqVar);
    }

    private dhzq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhzq();
            }
            if (i2 == 4) {
                return new dhzp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhzq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhzq.class) {
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
