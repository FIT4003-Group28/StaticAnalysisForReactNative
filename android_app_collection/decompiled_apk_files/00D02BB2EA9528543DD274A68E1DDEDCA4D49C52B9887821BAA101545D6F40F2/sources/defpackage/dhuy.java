package defpackage;
/* compiled from: PG */
/* renamed from: dhuy  reason: default package */
/* loaded from: classes6.dex */
public final class dhuy extends dsqw<dhuy, dhux> implements dssk {
    public static final dhuy a;
    private static volatile dssr<dhuy> b;

    static {
        dhuy dhuyVar = new dhuy();
        a = dhuyVar;
        dsqw.cc(dhuy.class, dhuyVar);
    }

    private dhuy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhuy();
            }
            if (i2 == 4) {
                return new dhux();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhuy> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhuy.class) {
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
