package defpackage;
/* compiled from: PG */
/* renamed from: dpop  reason: default package */
/* loaded from: classes.dex */
public final class dpop extends dsqw<dpop, dpoo> implements dssk {
    public static final dpop d;
    private static volatile dssr<dpop> e;
    public int a;
    public long b;
    public long c;

    static {
        dpop dpopVar = new dpop();
        d = dpopVar;
        dsqw.cc(dpop.class, dpopVar);
    }

    private dpop() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဂ\u0000\u0006ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpop();
            }
            if (i2 == 4) {
                return new dpoo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpop> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpop.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
