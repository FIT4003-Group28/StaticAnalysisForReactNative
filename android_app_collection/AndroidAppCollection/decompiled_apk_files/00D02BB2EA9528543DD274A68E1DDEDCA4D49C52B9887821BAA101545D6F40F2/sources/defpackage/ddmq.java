package defpackage;
/* compiled from: PG */
/* renamed from: ddmq  reason: default package */
/* loaded from: classes.dex */
public final class ddmq extends dsqw<ddmq, ddmp> implements dssk {
    public static final ddmq d;
    private static volatile dssr<ddmq> e;
    public int a;
    public int b;
    public int c;

    static {
        ddmq ddmqVar = new ddmq();
        d = ddmqVar;
        dsqw.cc(ddmq.class, ddmqVar);
    }

    private ddmq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", ddmo.c(), "c", ddmo.c()});
            }
            if (i2 == 3) {
                return new ddmq();
            }
            if (i2 == 4) {
                return new ddmp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddmq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddmq.class) {
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
