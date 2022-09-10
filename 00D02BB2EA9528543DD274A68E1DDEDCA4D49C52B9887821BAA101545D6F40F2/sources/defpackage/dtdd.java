package defpackage;
/* compiled from: PG */
/* renamed from: dtdd  reason: default package */
/* loaded from: classes6.dex */
public final class dtdd extends dsqw<dtdd, dtdc> implements dssk {
    public static final dtdd a;
    private static volatile dssr<dtdd> b;

    static {
        dtdd dtddVar = new dtdd();
        a = dtddVar;
        dsqw.cc(dtdd.class, dtddVar);
    }

    private dtdd() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtdd();
            }
            if (i2 == 4) {
                return new dtdc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtdd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtdd.class) {
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
