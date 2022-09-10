package defpackage;
/* compiled from: PG */
/* renamed from: dnls  reason: default package */
/* loaded from: classes6.dex */
public final class dnls extends dsqw<dnls, dnln> implements dssk {
    public static final dnls g;
    private static volatile dssr<dnls> h;
    public int a;
    public dnlr b;
    public dnkt d;
    public String c = "";
    public dsrj<dnkn> e = dssu.b;
    public dsrj<dnlm> f = dssu.b;

    static {
        dnls dnlsVar = new dnls();
        g = dnlsVar;
        dsqw.cc(dnls.class, dnlsVar);
    }

    private dnls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0001\u0002ဉ\u0002\u0003\u001b\u0004\u001b\u0005ဉ\u0000", new Object[]{"a", "c", "d", "e", dnkn.class, "f", dnlm.class, "b"});
            }
            if (i2 == 3) {
                return new dnls();
            }
            if (i2 == 4) {
                return new dnln();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnls> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnls.class) {
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
        dsrj<dnkn> dsrjVar = this.e;
        if (!dsrjVar.a()) {
            this.e = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<dnlm> dsrjVar = this.f;
        if (!dsrjVar.a()) {
            this.f = dsqw.cl(dsrjVar);
        }
    }
}
