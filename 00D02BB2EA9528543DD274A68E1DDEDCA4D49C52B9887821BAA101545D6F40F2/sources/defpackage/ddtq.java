package defpackage;
/* compiled from: PG */
/* renamed from: ddtq  reason: default package */
/* loaded from: classes6.dex */
public final class ddtq extends dsqw<ddtq, ddtp> implements dssk {
    public static final ddtq d;
    private static volatile dssr<ddtq> e;
    public int a;
    public int b;
    public int c = 1;

    static {
        ddtq ddtqVar = new ddtq();
        d = ddtqVar;
        dsqw.cc(ddtq.class, ddtqVar);
    }

    private ddtq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", ddto.a, "c", dqum.c()});
            }
            if (i2 == 3) {
                return new ddtq();
            }
            if (i2 == 4) {
                return new ddtp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddtq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddtq.class) {
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
