package defpackage;
/* compiled from: PG */
/* renamed from: ccme  reason: default package */
/* loaded from: classes4.dex */
public final class ccme extends dsqw<ccme, ccmb> implements dssk {
    public static final ccme f;
    private static volatile dssr<ccme> g;
    public int a;
    public int b;
    public String c = "";
    public int d;
    public boolean e;

    static {
        ccme ccmeVar = new ccme();
        f = ccmeVar;
        dsqw.cc(ccme.class, ccmeVar);
    }

    private ccme() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဌ\u0000\u0003ဇ\u0003\u0004ဌ\u0002", new Object[]{"a", "c", "b", ccmc.a, "e", "d", dgfd.a});
            }
            if (i2 == 3) {
                return new ccme();
            }
            if (i2 == 4) {
                return new ccmb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccme> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ccme.class) {
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
