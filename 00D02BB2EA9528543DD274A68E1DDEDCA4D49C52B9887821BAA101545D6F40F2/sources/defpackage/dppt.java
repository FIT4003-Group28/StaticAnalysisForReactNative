package defpackage;
/* compiled from: PG */
/* renamed from: dppt  reason: default package */
/* loaded from: classes6.dex */
public final class dppt extends dsqw<dppt, dppq> implements dssk {
    public static final dppt e;
    private static volatile dssr<dppt> f;
    public int a;
    public int b = 0;
    public Object c;
    public dppz d;

    static {
        dppt dpptVar = new dppt();
        e = dpptVar;
        dsqw.cc(dppt.class, dpptVar);
    }

    private dppt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ျ\u0000\u0005ြ\u0000\u0006ျ\u0000", new Object[]{"c", "b", "a", "d", dpsn.class, dpum.class, dpps.class});
            }
            if (i2 == 3) {
                return new dppt();
            }
            if (i2 == 4) {
                return new dppq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dppt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dppt.class) {
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
