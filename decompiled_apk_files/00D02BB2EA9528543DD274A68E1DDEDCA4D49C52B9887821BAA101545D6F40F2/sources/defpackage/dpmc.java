package defpackage;
/* compiled from: PG */
/* renamed from: dpmc  reason: default package */
/* loaded from: classes6.dex */
public final class dpmc extends dsqw<dpmc, dpmb> implements dssk {
    public static final dpmc c;
    private static volatile dssr<dpmc> d;
    public int a = 0;
    public Object b;

    static {
        dpmc dpmcVar = new dpmc();
        c = dpmcVar;
        dsqw.cc(dpmc.class, dpmcVar);
    }

    private dpmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dqdq.class, dqdo.class});
            }
            if (i2 == 3) {
                return new dpmc();
            }
            if (i2 == 4) {
                return new dpmb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpmc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpmc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
