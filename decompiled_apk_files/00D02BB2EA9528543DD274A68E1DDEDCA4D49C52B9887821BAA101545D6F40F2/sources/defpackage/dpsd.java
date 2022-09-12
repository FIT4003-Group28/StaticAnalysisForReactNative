package defpackage;
/* compiled from: PG */
/* renamed from: dpsd  reason: default package */
/* loaded from: classes6.dex */
public final class dpsd extends dsqw<dpsd, dpsc> implements dssk {
    public static final dpsd f;
    private static volatile dssr<dpsd> g;
    public int a;
    public dpoh b;
    public dsrj<dqmn> c = dssu.b;
    public dsrj<dpyf> d = dssu.b;
    public dsrj<dqhp> e = dssu.b;

    static {
        dpsd dpsdVar = new dpsd();
        f = dpsdVar;
        dsqw.cc(dpsd.class, dpsdVar);
    }

    private dpsd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0005\u001b", new Object[]{"a", "b", "c", dqmn.class, "d", dpyf.class, "e", dqhp.class});
            }
            if (i2 == 3) {
                return new dpsd();
            }
            if (i2 == 4) {
                return new dpsc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpsd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpsd.class) {
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
        dsrj<dqmn> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<dpyf> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }

    public final void d() {
        dsrj<dqhp> dsrjVar = this.e;
        if (!dsrjVar.a()) {
            this.e = dsqw.cl(dsrjVar);
        }
    }
}
