package defpackage;
/* compiled from: PG */
/* renamed from: ccwq  reason: default package */
/* loaded from: classes4.dex */
public final class ccwq extends dsqw<ccwq, ccwp> implements dssk {
    public static final ccwq e;
    private static volatile dssr<ccwq> f;
    public int a;
    public ccln b;
    public ccxa c;
    public ccma d;

    static {
        ccwq ccwqVar = new ccwq();
        e = ccwqVar;
        dsqw.cc(ccwq.class, ccwqVar);
    }

    private ccwq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ccwq();
            }
            if (i2 == 4) {
                return new ccwp();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccwq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ccwq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
