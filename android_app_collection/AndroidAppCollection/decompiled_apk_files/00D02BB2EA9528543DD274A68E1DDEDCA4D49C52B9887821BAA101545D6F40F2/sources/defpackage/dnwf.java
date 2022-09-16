package defpackage;
/* compiled from: PG */
/* renamed from: dnwf  reason: default package */
/* loaded from: classes.dex */
public final class dnwf extends dsqw<dnwf, dnwe> implements dssk {
    public static final dnwf r;
    private static volatile dssr<dnwf> t;
    public int a;
    public boolean b;
    public donq o;
    public dnem p;
    public dqbe q;
    private byte s = 2;
    public dsrj<dodg> c = dssu.b;
    public dsrj<dnzn> d = dssu.b;
    public dsrj<dnnz> e = dssu.b;
    public dsrj<dobz> f = dssu.b;
    public dsrj<dnjj> g = dssu.b;
    public dsrj<dnjy> h = dssu.b;
    public dsrj<dnfu> i = dssu.b;
    public dsrj<doqp> j = dssu.b;
    public dsrj<dnfm> k = dssu.b;
    public dsrj<dngy> l = dssu.b;
    public dsrj<dofj> m = dssu.b;
    public dsrj<dosf> n = dssu.b;

    static {
        dnwf dnwfVar = new dnwf();
        r = dnwfVar;
        dsqw.cc(dnwf.class, dnwfVar);
    }

    private dnwf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(r, "\u0001\u0010\u0000\u0001\u0001\u0015\u0010\u0000\f\u0002\u0001ဇ\u0002\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0007\u001b\b\u001b\n\u001b\u000b\u001b\f\u001b\u000f\u001b\u0010Л\u0012ဉ\u0004\u0013Л\u0014ဉ\u0006\u0015ဉ\b", new Object[]{"a", "b", "e", dnnz.class, "f", dobz.class, "g", dnjj.class, "h", dnjy.class, "l", dngy.class, "m", dofj.class, "n", dosf.class, "i", dnfu.class, "j", doqp.class, "k", dnfm.class, "c", dodg.class, "o", "d", dnzn.class, "p", "q"});
            }
            if (i2 == 3) {
                return new dnwf();
            }
            if (i2 == 4) {
                return new dnwe();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            }
            dssr<dnwf> dssrVar = t;
            if (dssrVar == null) {
                synchronized (dnwf.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.s);
    }

    public final void b() {
        dsrj<dosf> dsrjVar = this.n;
        if (!dsrjVar.a()) {
            this.n = dsqw.cl(dsrjVar);
        }
    }
}
