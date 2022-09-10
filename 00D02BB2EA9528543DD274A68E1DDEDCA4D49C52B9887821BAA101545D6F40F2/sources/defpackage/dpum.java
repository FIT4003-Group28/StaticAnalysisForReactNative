package defpackage;
/* compiled from: PG */
/* renamed from: dpum  reason: default package */
/* loaded from: classes.dex */
public final class dpum extends dsqw<dpum, dpul> implements dssk {
    public static final dpum d;
    private static volatile dssr<dpum> e;
    public int a;
    public double b;
    public double c;

    static {
        dpum dpumVar = new dpum();
        d = dpumVar;
        dsqw.cc(dpum.class, dpumVar);
    }

    private dpum() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003က\u0000\u0004က\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpum();
            }
            if (i2 == 4) {
                return new dpul();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpum> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpum.class) {
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
