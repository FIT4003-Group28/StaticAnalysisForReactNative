package defpackage;
/* compiled from: PG */
/* renamed from: dpbs  reason: default package */
/* loaded from: classes.dex */
public final class dpbs extends dsqw<dpbs, dpbq> implements dssk {
    public static final dpbs d;
    private static volatile dssr<dpbs> e;
    public int a;
    public int b;
    public boolean c;

    static {
        dpbs dpbsVar = new dpbs();
        d = dpbsVar;
        dsqw.cc(dpbs.class, dpbsVar);
    }

    private dpbs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", dpbr.a, "c"});
            }
            if (i2 == 3) {
                return new dpbs();
            }
            if (i2 == 4) {
                return new dpbq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpbs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpbs.class) {
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
