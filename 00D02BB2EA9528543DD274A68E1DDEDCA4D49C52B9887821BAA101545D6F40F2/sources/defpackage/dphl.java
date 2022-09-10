package defpackage;
/* compiled from: PG */
/* renamed from: dphl  reason: default package */
/* loaded from: classes6.dex */
public final class dphl extends dsqw<dphl, dphf> implements dssk {
    public static final dphl e;
    private static volatile dssr<dphl> f;
    public int a;
    public int b;
    public dphj c;
    public boolean d = true;

    static {
        dphl dphlVar = new dphl();
        e = dphlVar;
        dsqw.cc(dphl.class, dphlVar);
    }

    private dphl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", dphk.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dphl();
            }
            if (i2 == 4) {
                return new dphf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dphl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dphl.class) {
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
