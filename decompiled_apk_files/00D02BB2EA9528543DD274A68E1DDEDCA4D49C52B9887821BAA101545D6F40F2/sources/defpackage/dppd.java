package defpackage;
/* compiled from: PG */
/* renamed from: dppd  reason: default package */
/* loaded from: classes6.dex */
public final class dppd extends dsqw<dppd, dppc> implements dssk {
    public static final dppd d;
    private static volatile dssr<dppd> e;
    public int a;
    public dqjt b;
    public dqjt c;

    static {
        dppd dppdVar = new dppd();
        d = dppdVar;
        dsqw.cc(dppd.class, dppdVar);
    }

    private dppd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dppd();
            }
            if (i2 == 4) {
                return new dppc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dppd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dppd.class) {
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
