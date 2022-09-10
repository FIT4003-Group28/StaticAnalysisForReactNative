package defpackage;
/* compiled from: PG */
/* renamed from: dgpo  reason: default package */
/* loaded from: classes6.dex */
public final class dgpo extends dsqw<dgpo, dgpn> implements dssk {
    public static final dgpo e;
    private static volatile dssr<dgpo> f;
    public int a;
    public double b;
    public double c;
    public double d;

    static {
        dgpo dgpoVar = new dgpo();
        e = dgpoVar;
        dsqw.cc(dgpo.class, dgpoVar);
    }

    private dgpo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dgpo();
            }
            if (i2 == 4) {
                return new dgpn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgpo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgpo.class) {
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
