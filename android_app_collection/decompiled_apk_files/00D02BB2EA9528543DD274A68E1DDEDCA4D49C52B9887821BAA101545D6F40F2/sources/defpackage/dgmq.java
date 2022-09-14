package defpackage;
/* compiled from: PG */
/* renamed from: dgmq  reason: default package */
/* loaded from: classes.dex */
public final class dgmq extends dsqw<dgmq, dgmp> implements dssk {
    public static final dgmq b;
    private static volatile dssr<dgmq> c;
    public dsrj<dgmo> a = dssu.b;

    static {
        dgmq dgmqVar = new dgmq();
        b = dgmqVar;
        dsqw.cc(dgmq.class, dgmqVar);
    }

    private dgmq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dgmo.class});
            }
            if (i2 == 3) {
                return new dgmq();
            }
            if (i2 == 4) {
                return new dgmp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgmq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dgmq.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
