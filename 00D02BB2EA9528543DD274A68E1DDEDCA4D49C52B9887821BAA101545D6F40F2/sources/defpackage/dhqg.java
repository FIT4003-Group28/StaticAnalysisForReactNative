package defpackage;
/* compiled from: PG */
/* renamed from: dhqg  reason: default package */
/* loaded from: classes6.dex */
public final class dhqg extends dsqw<dhqg, dhqf> implements dssk {
    public static final dhqg a;
    private static volatile dssr<dhqg> b;

    static {
        dhqg dhqgVar = new dhqg();
        a = dhqgVar;
        dsqw.cc(dhqg.class, dhqgVar);
    }

    private dhqg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhqg();
            }
            if (i2 == 4) {
                return new dhqf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhqg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhqg.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
