package defpackage;
/* compiled from: PG */
/* renamed from: dgkq  reason: default package */
/* loaded from: classes6.dex */
public final class dgkq extends dsqw<dgkq, dgkp> implements dssk {
    public static final dgkq b;
    private static volatile dssr<dgkq> d;
    public dgks a;
    private int c;

    static {
        dgkq dgkqVar = new dgkq();
        b = dgkqVar;
        dsqw.cc(dgkq.class, dgkqVar);
    }

    private dgkq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dgkq();
            }
            if (i2 == 4) {
                return new dgkp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgkq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgkq.class) {
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
