package defpackage;
/* compiled from: PG */
/* renamed from: dgxq  reason: default package */
/* loaded from: classes6.dex */
public final class dgxq extends dsqw<dgxq, dgxp> implements dssk {
    public static final dgxq c;
    private static volatile dssr<dgxq> d;
    public int a;
    public dgxv b;

    static {
        dgxq dgxqVar = new dgxq();
        c = dgxqVar;
        dsqw.cc(dgxq.class, dgxqVar);
    }

    private dgxq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgxq();
            }
            if (i2 == 4) {
                return new dgxp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgxq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgxq.class) {
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
