package defpackage;
/* compiled from: PG */
/* renamed from: dkfr  reason: default package */
/* loaded from: classes6.dex */
public final class dkfr extends dsqw<dkfr, dkfq> implements dssk {
    public static final dkfr d;
    private static volatile dssr<dkfr> f;
    public dspd a = dspd.b;
    public long b;
    public dkgn c;
    private int e;

    static {
        dkfr dkfrVar = new dkfr();
        d = dkfrVar;
        dsqw.cc(dkfr.class, dkfrVar);
    }

    private dkfr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkfr();
            }
            if (i2 == 4) {
                return new dkfq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkfr.class) {
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
