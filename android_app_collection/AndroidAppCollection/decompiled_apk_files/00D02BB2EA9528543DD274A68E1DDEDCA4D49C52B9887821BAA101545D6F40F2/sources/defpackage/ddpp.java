package defpackage;
/* compiled from: PG */
/* renamed from: ddpp  reason: default package */
/* loaded from: classes6.dex */
public final class ddpp extends dsqw<ddpp, ddpo> implements dssk {
    public static final ddpp a;
    private static volatile dssr<ddpp> b;

    static {
        ddpp ddppVar = new ddpp();
        a = ddppVar;
        dsqw.cc(ddpp.class, ddppVar);
    }

    private ddpp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddpp();
            }
            if (i2 == 4) {
                return new ddpo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddpp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddpp.class) {
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
