package defpackage;
/* compiled from: PG */
/* renamed from: dtik  reason: default package */
/* loaded from: classes6.dex */
public final class dtik extends dsqw<dtik, dtij> implements dssk {
    public static final dsrg<Integer, dtig> b = new dtih();
    public static final dsrg<Integer, dtle> d = new dtii();
    public static final dtik e;
    private static volatile dssr<dtik> f;
    public dsrf a = dsqz.b;
    public dsrf c = dsqz.b;

    static {
        dtik dtikVar = new dtik();
        e = dtikVar;
        dsqw.cc(dtik.class, dtikVar);
    }

    private dtik() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001e", new Object[]{"a", dtig.c(), "c", dtle.c()});
            }
            if (i2 == 3) {
                return new dtik();
            }
            if (i2 == 4) {
                return new dtij();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtik> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtik.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
