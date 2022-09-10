package defpackage;
/* compiled from: PG */
/* renamed from: dhqs  reason: default package */
/* loaded from: classes6.dex */
public final class dhqs extends dsqw<dhqs, dhqr> implements dssk {
    public static final dhqs b;
    private static volatile dssr<dhqs> d;
    public String a = "";
    private int c;

    static {
        dhqs dhqsVar = new dhqs();
        b = dhqsVar;
        dsqw.cc(dhqs.class, dhqsVar);
    }

    private dhqs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhqs();
            }
            if (i2 == 4) {
                return new dhqr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhqs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhqs.class) {
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
