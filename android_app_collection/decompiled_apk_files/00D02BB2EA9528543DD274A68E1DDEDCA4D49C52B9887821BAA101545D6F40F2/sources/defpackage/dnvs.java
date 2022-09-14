package defpackage;
/* compiled from: PG */
/* renamed from: dnvs  reason: default package */
/* loaded from: classes6.dex */
public final class dnvs extends dsqw<dnvs, dnvn> implements dssk {
    public static final dnvs d;
    private static volatile dssr<dnvs> f;
    public String a = "";
    public dsrj<dnvr> b = dssu.b;
    public dnvp c;
    private int e;

    static {
        dnvs dnvsVar = new dnvs();
        d = dnvsVar;
        dsqw.cc(dnvs.class, dnvsVar);
    }

    private dnvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0005ဉ\u0004", new Object[]{"e", "a", "b", dnvr.class, "c"});
            }
            if (i2 == 3) {
                return new dnvs();
            }
            if (i2 == 4) {
                return new dnvn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnvs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnvs.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dnvr> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
