package defpackage;
/* compiled from: PG */
/* renamed from: dutg  reason: default package */
/* loaded from: classes6.dex */
public final class dutg extends dsqw<dutg, dutf> implements dssk {
    public static final dutg a;
    private static volatile dssr<dutg> b;

    static {
        dutg dutgVar = new dutg();
        a = dutgVar;
        dsqw.cc(dutg.class, dutgVar);
    }

    private dutg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dutg();
            }
            if (i2 == 4) {
                return new dutf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dutg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dutg.class) {
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
