package defpackage;
/* compiled from: PG */
/* renamed from: dnrr  reason: default package */
/* loaded from: classes6.dex */
public final class dnrr extends dsqw<dnrr, dnrq> implements dssk {
    public static final dnrr d;
    private static volatile dssr<dnrr> e;
    public int a;
    public dnhz b;
    public dpwp c;

    static {
        dnrr dnrrVar = new dnrr();
        d = dnrrVar;
        dsqw.cc(dnrr.class, dnrrVar);
    }

    private dnrr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnrr();
            }
            if (i2 == 4) {
                return new dnrq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnrr.class) {
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
