package defpackage;
/* compiled from: PG */
/* renamed from: ddus  reason: default package */
/* loaded from: classes6.dex */
public final class ddus extends dsqw<ddus, ddur> implements dssk {
    public static final ddus a;
    private static volatile dssr<ddus> b;

    static {
        ddus ddusVar = new ddus();
        a = ddusVar;
        dsqw.cc(ddus.class, ddusVar);
    }

    private ddus() {
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
                return new ddus();
            }
            if (i2 == 4) {
                return new ddur();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddus> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddus.class) {
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
