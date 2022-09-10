package defpackage;
/* compiled from: PG */
/* renamed from: dseh  reason: default package */
/* loaded from: classes6.dex */
public final class dseh extends dsqw<dseh, dseg> implements dssk {
    public static final dseh a;
    private static volatile dssr<dseh> b;

    static {
        dseh dsehVar = new dseh();
        a = dsehVar;
        dsqw.cc(dseh.class, dsehVar);
    }

    private dseh() {
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
                return new dseh();
            }
            if (i2 == 4) {
                return new dseg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dseh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dseh.class) {
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
