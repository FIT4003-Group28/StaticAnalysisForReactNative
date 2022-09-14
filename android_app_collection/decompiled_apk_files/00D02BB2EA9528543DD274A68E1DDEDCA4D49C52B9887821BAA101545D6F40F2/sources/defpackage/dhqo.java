package defpackage;
/* compiled from: PG */
/* renamed from: dhqo  reason: default package */
/* loaded from: classes6.dex */
public final class dhqo extends dsqw<dhqo, dhqn> implements dssk {
    public static final dhqo c;
    private static volatile dssr<dhqo> e;
    public dpot a;
    public dpql b;
    private int d;

    static {
        dhqo dhqoVar = new dhqo();
        c = dhqoVar;
        dsqw.cc(dhqo.class, dhqoVar);
    }

    private dhqo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dhqo();
            }
            if (i2 == 4) {
                return new dhqn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhqo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhqo.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
