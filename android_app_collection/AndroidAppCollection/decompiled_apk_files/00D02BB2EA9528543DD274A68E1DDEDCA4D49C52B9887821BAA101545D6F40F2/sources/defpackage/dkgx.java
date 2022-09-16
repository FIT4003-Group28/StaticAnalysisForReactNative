package defpackage;
/* compiled from: PG */
/* renamed from: dkgx  reason: default package */
/* loaded from: classes.dex */
public final class dkgx extends dsqw<dkgx, dkgw> implements dssk {
    public static final dkgx d;
    private static volatile dssr<dkgx> f;
    public dknv a;
    public dkhv b;
    public dkgz c;
    private int e;

    static {
        dkgx dkgxVar = new dkgx();
        d = dkgxVar;
        dsqw.cc(dkgx.class, dkgxVar);
    }

    private dkgx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkgx();
            }
            if (i2 == 4) {
                return new dkgw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkgx.class) {
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
