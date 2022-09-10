package defpackage;
/* compiled from: PG */
/* renamed from: dplx  reason: default package */
/* loaded from: classes.dex */
public final class dplx extends dsqw<dplx, dplu> implements dssk {
    public static final dplx g;
    private static volatile dssr<dplx> h;
    public int a;
    public int e;
    public String b = "";
    public String c = "";
    public String d = "";
    public dsrj<dplw> f = dssu.b;

    static {
        dplx dplxVar = new dplx();
        g = dplxVar;
        dsqw.cc(dplx.class, dplxVar);
    }

    private dplx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", dplw.class});
            }
            if (i2 == 3) {
                return new dplx();
            }
            if (i2 == 4) {
                return new dplu();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dplx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dplx.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dplw> dsrjVar = this.f;
        if (!dsrjVar.a()) {
            this.f = dsqw.cl(dsrjVar);
        }
    }
}
