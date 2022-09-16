package defpackage;
/* compiled from: PG */
/* renamed from: dqxq  reason: default package */
/* loaded from: classes.dex */
public final class dqxq extends dsqw<dqxq, dqxp> implements dssk {
    public static final dqxq b;
    private static volatile dssr<dqxq> c;
    public dsrj<dqxs> a = dssu.b;

    static {
        dqxq dqxqVar = new dqxq();
        b = dqxqVar;
        dsqw.cc(dqxq.class, dqxqVar);
    }

    private dqxq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqxs.class});
            }
            if (i2 == 3) {
                return new dqxq();
            }
            if (i2 == 4) {
                return new dqxp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqxq.class) {
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
