package defpackage;
/* compiled from: PG */
/* renamed from: dhqk  reason: default package */
/* loaded from: classes6.dex */
public final class dhqk extends dsqw<dhqk, dhqj> implements dssk {
    public static final dhqk c;
    private static volatile dssr<dhqk> e;
    public dsrj<dppl> a = dssu.b;
    public dpql b;
    private int d;

    static {
        dhqk dhqkVar = new dhqk();
        c = dhqkVar;
        dsqw.cc(dhqk.class, dhqkVar);
    }

    private dhqk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဉ\u0001", new Object[]{"d", "a", dppl.class, "b"});
            }
            if (i2 == 3) {
                return new dhqk();
            }
            if (i2 == 4) {
                return new dhqj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhqk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhqk.class) {
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
