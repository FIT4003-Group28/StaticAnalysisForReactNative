package defpackage;
/* compiled from: PG */
/* renamed from: dqpq  reason: default package */
/* loaded from: classes6.dex */
public final class dqpq extends dsqw<dqpq, dqpp> implements dssk {
    public static final dqpq d;
    private static volatile dssr<dqpq> f;
    public String a = "";
    public dsrj<dqpw> b = dssu.b;
    public String c = "";
    private int e;

    static {
        dqpq dqpqVar = new dqpq();
        d = dqpqVar;
        dsqw.cc(dqpq.class, dqpqVar);
    }

    private dqpq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"e", "a", "b", dqpw.class, "c"});
            }
            if (i2 == 3) {
                return new dqpq();
            }
            if (i2 == 4) {
                return new dqpp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqpq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqpq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
