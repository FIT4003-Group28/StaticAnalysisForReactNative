package defpackage;
/* compiled from: PG */
/* renamed from: dpbf  reason: default package */
/* loaded from: classes.dex */
public final class dpbf extends dsqw<dpbf, dpbe> implements dssk {
    public static final dpbf c;
    private static volatile dssr<dpbf> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dpbf dpbfVar = new dpbf();
        c = dpbfVar;
        dsqw.cc(dpbf.class, dpbfVar);
    }

    private dpbf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpbf();
            }
            if (i2 == 4) {
                return new dpbe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpbf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpbf.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
