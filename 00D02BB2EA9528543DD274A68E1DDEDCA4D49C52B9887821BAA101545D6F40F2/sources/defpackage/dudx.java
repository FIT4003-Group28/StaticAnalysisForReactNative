package defpackage;
/* compiled from: PG */
/* renamed from: dudx  reason: default package */
/* loaded from: classes6.dex */
public final class dudx extends dsqw<dudx, dudw> implements dssk {
    public static final dudx d;
    private static volatile dssr<dudx> f;
    public int a;
    public double b;
    public double c = 1.0d;
    private int e;

    static {
        dudx dudxVar = new dudx();
        d = dudxVar;
        dsqw.cc(dudx.class, dudxVar);
    }

    private dudx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"e", "a", dudu.a, "b", "c"});
            }
            if (i2 == 3) {
                return new dudx();
            }
            if (i2 == 4) {
                return new dudw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dudx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dudx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
