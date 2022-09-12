package defpackage;
/* compiled from: PG */
/* renamed from: dpbh  reason: default package */
/* loaded from: classes.dex */
public final class dpbh extends dsqw<dpbh, dpbg> implements dssk {
    public static final dpbh d;
    private static volatile dssr<dpbh> e;
    public int a;
    public dspd b = dspd.b;
    public int c;

    static {
        dpbh dpbhVar = new dpbh();
        d = dpbhVar;
        dsqw.cc(dpbh.class, dpbhVar);
    }

    private dpbh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpbh();
            }
            if (i2 == 4) {
                return new dpbg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpbh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpbh.class) {
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
