package defpackage;
/* compiled from: PG */
/* renamed from: dphd  reason: default package */
/* loaded from: classes6.dex */
public final class dphd extends dsqw<dphd, dphc> implements dssk {
    public static final dphd f;
    private static volatile dssr<dphd> g;
    public int a;
    public int b;
    public dgas c;
    public int d;
    public dpuc e;

    static {
        dphd dphdVar = new dphd();
        f = dphdVar;
        dsqw.cc(dphd.class, dphdVar);
    }

    private dphd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", dpbw.c(), "c", "d", dpbt.a, "e"});
            }
            if (i2 == 3) {
                return new dphd();
            }
            if (i2 == 4) {
                return new dphc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dphd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dphd.class) {
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
