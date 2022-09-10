package defpackage;
/* compiled from: PG */
/* renamed from: dutw  reason: default package */
/* loaded from: classes6.dex */
public final class dutw extends dsqw<dutw, dutv> implements dssk {
    public static final dutw a;
    private static volatile dssr<dutw> b;

    static {
        dutw dutwVar = new dutw();
        a = dutwVar;
        dsqw.cc(dutw.class, dutwVar);
    }

    private dutw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dutw();
            }
            if (i2 == 4) {
                return new dutv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dutw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dutw.class) {
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
