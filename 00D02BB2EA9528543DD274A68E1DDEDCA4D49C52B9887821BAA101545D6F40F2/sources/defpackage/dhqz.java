package defpackage;
/* compiled from: PG */
/* renamed from: dhqz  reason: default package */
/* loaded from: classes6.dex */
public final class dhqz extends dsqw<dhqz, dhqy> implements dssk {
    public static final dhqz c;
    private static volatile dssr<dhqz> d;
    public int a;
    public drad b;

    static {
        dhqz dhqzVar = new dhqz();
        c = dhqzVar;
        dsqw.cc(dhqz.class, dhqzVar);
    }

    private dhqz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhqz();
            }
            if (i2 == 4) {
                return new dhqy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhqz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhqz.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
