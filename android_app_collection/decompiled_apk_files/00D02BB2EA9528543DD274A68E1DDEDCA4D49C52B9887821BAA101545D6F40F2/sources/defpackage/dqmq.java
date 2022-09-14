package defpackage;
/* compiled from: PG */
/* renamed from: dqmq  reason: default package */
/* loaded from: classes6.dex */
public final class dqmq extends dsqw<dqmq, dqmp> implements dssk {
    public static final dqmq b;
    private static volatile dssr<dqmq> d;
    public String a = "";
    private int c;

    static {
        dqmq dqmqVar = new dqmq();
        b = dqmqVar;
        dsqw.cc(dqmq.class, dqmqVar);
    }

    private dqmq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqmq();
            }
            if (i2 == 4) {
                return new dqmp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqmq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqmq.class) {
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
