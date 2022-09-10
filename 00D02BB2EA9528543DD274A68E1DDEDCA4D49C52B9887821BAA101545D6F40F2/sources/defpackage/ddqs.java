package defpackage;
/* compiled from: PG */
/* renamed from: ddqs  reason: default package */
/* loaded from: classes.dex */
public final class ddqs extends dsqw<ddqs, ddqr> implements dssk {
    public static final ddqs d;
    private static volatile dssr<ddqs> e;
    public int a;
    public boolean b;
    public ddmm c;

    static {
        ddqs ddqsVar = new ddqs();
        d = ddqsVar;
        dsqw.cc(ddqs.class, ddqsVar);
    }

    private ddqs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဉ\u0003", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddqs();
            }
            if (i2 == 4) {
                return new ddqr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddqs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddqs.class) {
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
