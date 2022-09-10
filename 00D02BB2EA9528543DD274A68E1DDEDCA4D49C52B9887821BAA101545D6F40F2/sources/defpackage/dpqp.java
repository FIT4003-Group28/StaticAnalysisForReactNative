package defpackage;
/* compiled from: PG */
/* renamed from: dpqp  reason: default package */
/* loaded from: classes6.dex */
public final class dpqp extends dsqw<dpqp, dpqo> implements dssk {
    public static final dpqp c;
    private static volatile dssr<dpqp> d;
    public int a;
    public boolean b;

    static {
        dpqp dpqpVar = new dpqp();
        c = dpqpVar;
        dsqw.cc(dpqp.class, dpqpVar);
    }

    private dpqp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpqp();
            }
            if (i2 == 4) {
                return new dpqo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpqp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpqp.class) {
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
