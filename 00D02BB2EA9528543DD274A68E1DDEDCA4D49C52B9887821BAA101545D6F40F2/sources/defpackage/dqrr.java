package defpackage;
/* compiled from: PG */
/* renamed from: dqrr  reason: default package */
/* loaded from: classes6.dex */
public final class dqrr extends dsqw<dqrr, dqrq> implements dssk {
    public static final dqrr d;
    private static volatile dssr<dqrr> e;
    public int a;
    public dqwa b;
    public dqam c;

    static {
        dqrr dqrrVar = new dqrr();
        d = dqrrVar;
        dsqw.cc(dqrr.class, dqrrVar);
    }

    private dqrr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqrr();
            }
            if (i2 == 4) {
                return new dqrq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqrr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqrr.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
