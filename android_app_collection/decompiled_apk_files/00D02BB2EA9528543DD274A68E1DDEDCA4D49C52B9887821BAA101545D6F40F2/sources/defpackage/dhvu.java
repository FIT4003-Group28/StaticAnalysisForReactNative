package defpackage;
/* compiled from: PG */
/* renamed from: dhvu  reason: default package */
/* loaded from: classes6.dex */
public final class dhvu extends dsqw<dhvu, dhvt> implements dssk {
    public static final dhvu a;
    private static volatile dssr<dhvu> b;

    static {
        dhvu dhvuVar = new dhvu();
        a = dhvuVar;
        dsqw.cc(dhvu.class, dhvuVar);
    }

    private dhvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhvu();
            }
            if (i2 == 4) {
                return new dhvt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhvu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhvu.class) {
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
