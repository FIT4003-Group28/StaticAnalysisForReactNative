package defpackage;
/* compiled from: PG */
/* renamed from: dqsq  reason: default package */
/* loaded from: classes6.dex */
public final class dqsq extends dsqw<dqsq, dqsp> implements dssk {
    public static final dqsq c;
    private static volatile dssr<dqsq> e;
    public String a = "";
    public dsrj<dqso> b = dssu.b;
    private int d;

    static {
        dqsq dqsqVar = new dqsq();
        c = dqsqVar;
        dsqw.cc(dqsq.class, dqsqVar);
    }

    private dqsq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dqso.class});
            }
            if (i2 == 3) {
                return new dqsq();
            }
            if (i2 == 4) {
                return new dqsp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqsq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqsq.class) {
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
