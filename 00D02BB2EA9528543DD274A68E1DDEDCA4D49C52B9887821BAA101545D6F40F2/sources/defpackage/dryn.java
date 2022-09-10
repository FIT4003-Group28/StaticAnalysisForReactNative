package defpackage;
/* compiled from: PG */
/* renamed from: dryn  reason: default package */
/* loaded from: classes6.dex */
public final class dryn extends dsqw<dryn, drym> implements dssk {
    public static final dryn e;
    private static volatile dssr<dryn> f;
    public int a;
    public String b = "";
    public dsrj<String> c = dssu.b;
    public dsrj<drxq> d = dssu.b;

    static {
        dryn drynVar = new dryn();
        e = drynVar;
        dsqw.cc(dryn.class, drynVar);
    }

    private dryn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0004\u001b", new Object[]{"a", "b", "c", "d", drxq.class});
            }
            if (i2 == 3) {
                return new dryn();
            }
            if (i2 == 4) {
                return new drym();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dryn.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<drxq> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
