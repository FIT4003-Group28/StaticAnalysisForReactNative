package defpackage;
/* compiled from: PG */
/* renamed from: ddwf  reason: default package */
/* loaded from: classes6.dex */
public final class ddwf extends dsqw<ddwf, ddwe> implements dssk {
    public static final ddwf a;
    private static volatile dssr<ddwf> b;

    static {
        ddwf ddwfVar = new ddwf();
        a = ddwfVar;
        dsqw.cc(ddwf.class, ddwfVar);
    }

    private ddwf() {
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
                return new ddwf();
            }
            if (i2 == 4) {
                return new ddwe();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddwf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddwf.class) {
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
