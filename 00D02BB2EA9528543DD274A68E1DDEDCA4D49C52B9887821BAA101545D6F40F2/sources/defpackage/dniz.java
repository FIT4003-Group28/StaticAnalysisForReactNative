package defpackage;
/* compiled from: PG */
/* renamed from: dniz  reason: default package */
/* loaded from: classes6.dex */
public final class dniz extends dsqw<dniz, dniw> implements dssk {
    public static final dniz f;
    private static volatile dssr<dniz> g;
    public int a;
    public dniu b;
    public dsrj<dniu> c = dssu.b;
    public dsrj<dnet> d = dssu.b;
    public dsrj<dniy> e = dssu.b;

    static {
        dniz dnizVar = new dniz();
        f = dnizVar;
        dsqw.cc(dniz.class, dnizVar);
    }

    private dniz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "d", dnet.class, "c", dniu.class, "e", dniy.class});
            }
            if (i2 == 3) {
                return new dniz();
            }
            if (i2 == 4) {
                return new dniw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dniz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dniz.class) {
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
        dsrj<dniu> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<dnet> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
