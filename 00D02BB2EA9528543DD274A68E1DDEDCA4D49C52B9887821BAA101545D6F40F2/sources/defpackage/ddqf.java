package defpackage;
/* compiled from: PG */
/* renamed from: ddqf  reason: default package */
/* loaded from: classes6.dex */
public final class ddqf extends dsqw<ddqf, ddqe> implements dssk {
    public static final ddqf c;
    private static volatile dssr<ddqf> d;
    public int a;
    public int b;

    static {
        ddqf ddqfVar = new ddqf();
        c = ddqfVar;
        dsqw.cc(ddqf.class, ddqfVar);
    }

    private ddqf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqvj.d()});
            }
            if (i2 == 3) {
                return new ddqf();
            }
            if (i2 == 4) {
                return new ddqe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddqf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddqf.class) {
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
