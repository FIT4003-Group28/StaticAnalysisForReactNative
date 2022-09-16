package defpackage;
/* compiled from: PG */
/* renamed from: dutc  reason: default package */
/* loaded from: classes6.dex */
public final class dutc extends dsqw<dutc, dutb> implements dssk {
    public static final dutc a;
    private static volatile dssr<dutc> b;

    static {
        dutc dutcVar = new dutc();
        a = dutcVar;
        dsqw.cc(dutc.class, dutcVar);
    }

    private dutc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dutc();
            }
            if (i2 == 4) {
                return new dutb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dutc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dutc.class) {
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
