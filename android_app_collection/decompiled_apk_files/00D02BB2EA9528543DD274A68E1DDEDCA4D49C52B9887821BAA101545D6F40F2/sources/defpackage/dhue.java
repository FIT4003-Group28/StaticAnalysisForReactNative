package defpackage;
/* compiled from: PG */
/* renamed from: dhue  reason: default package */
/* loaded from: classes6.dex */
public final class dhue extends dsqw<dhue, dhud> implements dssk {
    public static final dhue a;
    private static volatile dssr<dhue> b;

    static {
        dhue dhueVar = new dhue();
        a = dhueVar;
        dsqw.cc(dhue.class, dhueVar);
    }

    private dhue() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhue();
            }
            if (i2 == 4) {
                return new dhud();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhue> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhue.class) {
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
