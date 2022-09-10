package defpackage;
/* compiled from: PG */
/* renamed from: dtwe  reason: default package */
/* loaded from: classes6.dex */
public final class dtwe extends dsqw<dtwe, dtwd> implements dssk {
    public static final dtwe a;
    private static volatile dssr<dtwe> b;

    static {
        dtwe dtweVar = new dtwe();
        a = dtweVar;
        dsqw.cc(dtwe.class, dtweVar);
    }

    private dtwe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dtwe();
            }
            if (i2 == 4) {
                return new dtwd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwe> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtwe.class) {
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
