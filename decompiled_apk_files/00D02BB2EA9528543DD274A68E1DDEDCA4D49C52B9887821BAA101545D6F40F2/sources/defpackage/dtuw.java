package defpackage;
/* compiled from: PG */
/* renamed from: dtuw  reason: default package */
/* loaded from: classes6.dex */
public final class dtuw extends dsqw<dtuw, dtuv> implements dssk {
    public static final dtuw b;
    private static volatile dssr<dtuw> c;
    public dtsk a;

    static {
        dtuw dtuwVar = new dtuw();
        b = dtuwVar;
        dsqw.cc(dtuw.class, dtuwVar);
    }

    private dtuw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dtuw();
            }
            if (i2 == 4) {
                return new dtuv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtuw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtuw.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
