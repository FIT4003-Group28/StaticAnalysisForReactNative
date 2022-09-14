package defpackage;
/* compiled from: PG */
/* renamed from: dhqc  reason: default package */
/* loaded from: classes6.dex */
public final class dhqc extends dsqw<dhqc, dhqb> implements dssk {
    public static final dhqc a;
    private static volatile dssr<dhqc> b;

    static {
        dhqc dhqcVar = new dhqc();
        a = dhqcVar;
        dsqw.cc(dhqc.class, dhqcVar);
    }

    private dhqc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhqc();
            }
            if (i2 == 4) {
                return new dhqb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhqc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhqc.class) {
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
