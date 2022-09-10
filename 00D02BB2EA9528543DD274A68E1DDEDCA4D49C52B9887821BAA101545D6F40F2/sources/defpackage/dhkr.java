package defpackage;
/* compiled from: PG */
/* renamed from: dhkr  reason: default package */
/* loaded from: classes6.dex */
public final class dhkr extends dsqw<dhkr, dhkq> implements dssk {
    public static final dhkr b;
    private static volatile dssr<dhkr> d;
    public boolean a;
    private int c;

    static {
        dhkr dhkrVar = new dhkr();
        b = dhkrVar;
        dsqw.cc(dhkr.class, dhkrVar);
    }

    private dhkr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhkr();
            }
            if (i2 == 4) {
                return new dhkq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhkr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhkr.class) {
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
