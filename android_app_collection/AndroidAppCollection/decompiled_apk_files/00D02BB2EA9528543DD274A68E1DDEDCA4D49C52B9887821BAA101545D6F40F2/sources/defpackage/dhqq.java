package defpackage;
/* compiled from: PG */
/* renamed from: dhqq  reason: default package */
/* loaded from: classes6.dex */
public final class dhqq extends dsqw<dhqq, dhqp> implements dssk {
    public static final dhqq c;
    private static volatile dssr<dhqq> e;
    public int a;
    public dnqh b;
    private byte d = 2;

    static {
        dhqq dhqqVar = new dhqq();
        c = dhqqVar;
        dsqw.cc(dhqq.class, dhqqVar);
    }

    private dhqq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhqq();
            }
            if (i2 == 4) {
                return new dhqp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dhqq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhqq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
