package defpackage;
/* compiled from: PG */
/* renamed from: ddpi  reason: default package */
/* loaded from: classes6.dex */
public final class ddpi extends dsqw<ddpi, ddph> implements dssk {
    public static final ddpi d;
    private static volatile dssr<ddpi> e;
    public int a;
    public ddpk b;
    public ddpm c;

    static {
        ddpi ddpiVar = new ddpi();
        d = ddpiVar;
        dsqw.cc(ddpi.class, ddpiVar);
    }

    private ddpi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0006ဉ\u0005", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddpi();
            }
            if (i2 == 4) {
                return new ddph();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddpi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddpi.class) {
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
