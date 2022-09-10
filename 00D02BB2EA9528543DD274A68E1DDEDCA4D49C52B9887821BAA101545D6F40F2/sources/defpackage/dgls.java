package defpackage;
/* compiled from: PG */
/* renamed from: dgls  reason: default package */
/* loaded from: classes6.dex */
public final class dgls extends dsqw<dgls, dglr> implements dssk {
    public static final dgls e;
    private static volatile dssr<dgls> f;
    public int a;
    public String b = "";
    public String c = "";
    public dsrj<dglo> d = dssu.b;

    static {
        dgls dglsVar = new dgls();
        e = dglsVar;
        dsqw.cc(dgls.class, dglsVar);
    }

    private dgls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", dglo.class});
            }
            if (i2 == 3) {
                return new dgls();
            }
            if (i2 == 4) {
                return new dglr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgls> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgls.class) {
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
        dsrj<dglo> dsrjVar = this.d;
        if (!dsrjVar.a()) {
            this.d = dsqw.cl(dsrjVar);
        }
    }
}
