package defpackage;
/* compiled from: PG */
/* renamed from: dtnn  reason: default package */
/* loaded from: classes6.dex */
public final class dtnn extends dsqw<dtnn, dtnm> implements dssk {
    public static final dtnn a;
    private static volatile dssr<dtnn> b;

    static {
        dtnn dtnnVar = new dtnn();
        a = dtnnVar;
        dsqw.cc(dtnn.class, dtnnVar);
    }

    private dtnn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtnn();
            }
            if (i2 == 4) {
                return new dtnm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtnn> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtnn.class) {
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
