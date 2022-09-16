package defpackage;
/* compiled from: PG */
/* renamed from: dduu  reason: default package */
/* loaded from: classes6.dex */
public final class dduu extends dsqw<dduu, ddut> implements dssk {
    public static final dduu a;
    private static volatile dssr<dduu> b;

    static {
        dduu dduuVar = new dduu();
        a = dduuVar;
        dsqw.cc(dduu.class, dduuVar);
    }

    private dduu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dduu();
            }
            if (i2 == 4) {
                return new ddut();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dduu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dduu.class) {
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
