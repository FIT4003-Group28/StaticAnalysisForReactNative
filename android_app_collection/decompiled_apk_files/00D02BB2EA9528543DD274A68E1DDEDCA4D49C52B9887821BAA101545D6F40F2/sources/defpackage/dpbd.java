package defpackage;
/* compiled from: PG */
/* renamed from: dpbd  reason: default package */
/* loaded from: classes.dex */
public final class dpbd extends dsqw<dpbd, dpbc> implements dssk {
    public static final dpbd c;
    private static volatile dssr<dpbd> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dpbd dpbdVar = new dpbd();
        c = dpbdVar;
        dsqw.cc(dpbd.class, dpbdVar);
    }

    private dpbd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpbd();
            }
            if (i2 == 4) {
                return new dpbc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpbd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpbd.class) {
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
