package defpackage;
/* compiled from: PG */
/* renamed from: dhqw  reason: default package */
/* loaded from: classes6.dex */
public final class dhqw extends dsqw<dhqw, dhqv> implements dssk {
    public static final dhqw a;
    private static volatile dssr<dhqw> b;

    static {
        dhqw dhqwVar = new dhqw();
        a = dhqwVar;
        dsqw.cc(dhqw.class, dhqwVar);
    }

    private dhqw() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhqw();
            }
            if (i2 == 4) {
                return new dhqv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhqw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhqw.class) {
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
