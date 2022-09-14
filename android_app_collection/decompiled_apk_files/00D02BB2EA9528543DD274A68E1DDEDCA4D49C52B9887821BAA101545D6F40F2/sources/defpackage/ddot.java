package defpackage;
/* compiled from: PG */
/* renamed from: ddot  reason: default package */
/* loaded from: classes.dex */
public final class ddot extends dsqw<ddot, ddoq> implements dssk {
    public static final ddot d;
    private static volatile dssr<ddot> e;
    public int a;
    public int b;
    public boolean c;

    static {
        ddot ddotVar = new ddot();
        d = ddotVar;
        dsqw.cc(ddot.class, ddotVar);
    }

    private ddot() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", ddos.c(), "c"});
            }
            if (i2 == 3) {
                return new ddot();
            }
            if (i2 == 4) {
                return new ddoq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddot> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddot.class) {
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
