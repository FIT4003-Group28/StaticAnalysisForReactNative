package defpackage;
/* compiled from: PG */
/* renamed from: dlqq  reason: default package */
/* loaded from: classes6.dex */
public final class dlqq extends dsqw<dlqq, dlqn> implements dssk {
    public static final dlqq c;
    private static volatile dssr<dlqq> e;
    public int a;
    public ddpg b;
    private int d;

    static {
        dlqq dlqqVar = new dlqq();
        c = dlqqVar;
        dsqw.cc(dlqq.class, dlqqVar);
    }

    private dlqq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"d", "a", dlqo.a, "b"});
            }
            if (i2 == 3) {
                return new dlqq();
            }
            if (i2 == 4) {
                return new dlqn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlqq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlqq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
