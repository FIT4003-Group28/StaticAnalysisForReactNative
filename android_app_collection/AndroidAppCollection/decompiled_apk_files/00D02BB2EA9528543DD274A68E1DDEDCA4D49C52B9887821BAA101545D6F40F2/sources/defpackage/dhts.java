package defpackage;
/* compiled from: PG */
/* renamed from: dhts  reason: default package */
/* loaded from: classes6.dex */
public final class dhts extends dsqw<dhts, dhtr> implements dssk {
    public static final dhts a;
    private static volatile dssr<dhts> b;

    static {
        dhts dhtsVar = new dhts();
        a = dhtsVar;
        dsqw.cc(dhts.class, dhtsVar);
    }

    private dhts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhts();
            }
            if (i2 == 4) {
                return new dhtr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhts> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhts.class) {
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
