package defpackage;
/* compiled from: PG */
/* renamed from: dpmr  reason: default package */
/* loaded from: classes6.dex */
public final class dpmr extends dsqw<dpmr, dpmq> implements dssk {
    public static final dpmr f;
    private static volatile dssr<dpmr> g;
    public int a;
    public dspd b = dspd.b;
    public int c;
    public long d;
    public int e;

    static {
        dpmr dpmrVar = new dpmr();
        f = dpmrVar;
        dsqw.cc(dpmr.class, dpmrVar);
    }

    private dpmr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dpmr();
            }
            if (i2 == 4) {
                return new dpmq();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpmr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpmr.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
