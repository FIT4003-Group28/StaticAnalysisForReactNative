package defpackage;
/* compiled from: PG */
/* renamed from: dnrj  reason: default package */
/* loaded from: classes6.dex */
public final class dnrj extends dsqw<dnrj, dnri> implements dssk {
    public static final dnrj g;
    private static volatile dssr<dnrj> h;
    public int a;
    public dnsc b;
    public dnsc c;
    public dnrd d;
    public dnqm e;
    public dnsf f;

    static {
        dnrj dnrjVar = new dnrj();
        g = dnrjVar;
        dsqw.cc(dnrj.class, dnrjVar);
    }

    private dnrj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0006ဉ\u0002", new Object[]{"a", "b", "c", "e", "f", "d"});
            }
            if (i2 == 3) {
                return new dnrj();
            }
            if (i2 == 4) {
                return new dnri();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnrj.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
