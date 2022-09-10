package defpackage;
/* compiled from: PG */
/* renamed from: dtyt  reason: default package */
/* loaded from: classes6.dex */
public final class dtyt extends dsqw<dtyt, dtys> implements dssk {
    public static final dtyt a;
    private static volatile dssr<dtyt> b;

    static {
        dtyt dtytVar = new dtyt();
        a = dtytVar;
        dsqw.cc(dtyt.class, dtytVar);
    }

    private dtyt() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dtyt();
            }
            if (i2 == 4) {
                return new dtys();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtyt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtyt.class) {
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
