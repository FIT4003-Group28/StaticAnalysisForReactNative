package defpackage;
/* compiled from: PG */
/* renamed from: dqnr  reason: default package */
/* loaded from: classes6.dex */
public final class dqnr extends dsqw<dqnr, dqnq> implements dssk {
    public static final dqnr d;
    private static volatile dssr<dqnr> e;
    public int a;
    public dqnx b;
    public dqnn c;

    static {
        dqnr dqnrVar = new dqnr();
        d = dqnrVar;
        dsqw.cc(dqnr.class, dqnrVar);
    }

    private dqnr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqnr();
            }
            if (i2 == 4) {
                return new dqnq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqnr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqnr.class) {
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
