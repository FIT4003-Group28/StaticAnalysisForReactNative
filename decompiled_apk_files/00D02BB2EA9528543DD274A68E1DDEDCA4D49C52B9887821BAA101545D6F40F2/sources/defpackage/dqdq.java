package defpackage;
/* compiled from: PG */
/* renamed from: dqdq  reason: default package */
/* loaded from: classes6.dex */
public final class dqdq extends dsqw<dqdq, dqdp> implements dssk {
    public static final dqdq b;
    private static volatile dssr<dqdq> d;
    public dqdo a;
    private int c;

    static {
        dqdq dqdqVar = new dqdq();
        b = dqdqVar;
        dsqw.cc(dqdq.class, dqdqVar);
    }

    private dqdq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqdq();
            }
            if (i2 == 4) {
                return new dqdp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqdq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqdq.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
