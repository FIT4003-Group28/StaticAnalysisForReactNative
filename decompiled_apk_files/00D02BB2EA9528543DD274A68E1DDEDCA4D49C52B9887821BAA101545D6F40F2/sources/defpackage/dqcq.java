package defpackage;
/* compiled from: PG */
/* renamed from: dqcq  reason: default package */
/* loaded from: classes6.dex */
public final class dqcq extends dsqw<dqcq, dqcp> implements dssk {
    public static final dqcq c;
    private static volatile dssr<dqcq> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dqcq dqcqVar = new dqcq();
        c = dqcqVar;
        dsqw.cc(dqcq.class, dqcqVar);
    }

    private dqcq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqcq();
            }
            if (i2 == 4) {
                return new dqcp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqcq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqcq.class) {
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
