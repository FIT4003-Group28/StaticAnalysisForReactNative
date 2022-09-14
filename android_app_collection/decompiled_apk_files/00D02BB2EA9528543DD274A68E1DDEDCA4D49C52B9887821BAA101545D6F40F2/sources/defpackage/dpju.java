package defpackage;
/* compiled from: PG */
/* renamed from: dpju  reason: default package */
/* loaded from: classes6.dex */
public final class dpju extends dsqw<dpju, dpjt> implements dssk {
    public static final dpju a;
    private static volatile dssr<dpju> b;

    static {
        dpju dpjuVar = new dpju();
        a = dpjuVar;
        dsqw.cc(dpju.class, dpjuVar);
    }

    private dpju() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dpju();
            }
            if (i2 == 4) {
                return new dpjt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpju> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dpju.class) {
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
