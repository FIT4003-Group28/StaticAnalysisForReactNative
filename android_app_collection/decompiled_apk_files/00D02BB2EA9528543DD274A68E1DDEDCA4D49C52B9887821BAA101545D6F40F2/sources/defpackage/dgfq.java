package defpackage;
/* compiled from: PG */
/* renamed from: dgfq  reason: default package */
/* loaded from: classes6.dex */
public final class dgfq extends dsqw<dgfq, dgfn> implements dssk {
    public static final dgfq c;
    private static volatile dssr<dgfq> d;
    public int a;
    public dgfp b;

    static {
        dgfq dgfqVar = new dgfq();
        c = dgfqVar;
        dsqw.cc(dgfq.class, dgfqVar);
    }

    private dgfq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgfq();
            }
            if (i2 == 4) {
                return new dgfn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgfq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgfq.class) {
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
