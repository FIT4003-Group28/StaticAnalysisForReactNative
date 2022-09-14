package defpackage;
/* compiled from: PG */
/* renamed from: dpov  reason: default package */
/* loaded from: classes6.dex */
public final class dpov extends dsqw<dpov, dpou> implements dssk {
    public static final dpov f;
    private static volatile dssr<dpov> g;
    public int a;
    public int c;
    public int e;
    public String b = "";
    public dsrj<dppz> d = dssu.b;

    static {
        dpov dpovVar = new dpov();
        f = dpovVar;
        dsqw.cc(dpov.class, dpovVar);
    }

    private dpov() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001b\u0004ဌ\u0002", new Object[]{"a", "b", "c", dprc.c(), "d", dppz.class, "e", dpqj.c()});
            }
            if (i2 == 3) {
                return new dpov();
            }
            if (i2 == 4) {
                return new dpou();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpov> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpov.class) {
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

    public final void b() {
        dsrj<dppz> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
