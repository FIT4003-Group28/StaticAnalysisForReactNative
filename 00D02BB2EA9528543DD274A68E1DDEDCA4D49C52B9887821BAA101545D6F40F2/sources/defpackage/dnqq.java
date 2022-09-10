package defpackage;
/* compiled from: PG */
/* renamed from: dnqq  reason: default package */
/* loaded from: classes6.dex */
public final class dnqq extends dsqw<dnqq, dnqp> implements dssk {
    public static final dnqq f;
    private static volatile dssr<dnqq> g;
    public int a;
    public dnrv b;
    public dnrv c;
    public dnrv d;
    public dnrv e;

    static {
        dnqq dnqqVar = new dnqq();
        f = dnqqVar;
        dsqw.cc(dnqq.class, dnqqVar);
    }

    private dnqq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0006\n\u0004\u0000\u0000\u0000\u0006ဉ\u0000\bဉ\u0002\tဉ\u0003\nဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dnqq();
            }
            if (i2 == 4) {
                return new dnqp();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnqq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnqq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
