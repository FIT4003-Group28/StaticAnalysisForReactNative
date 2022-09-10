package defpackage;
/* compiled from: PG */
/* renamed from: dnpo  reason: default package */
/* loaded from: classes.dex */
public final class dnpo extends dsqw<dnpo, dnox> implements dssk {
    public static final dsrg<Integer, dnow> e = new dnos();
    public static final dsrg<Integer, dnph> g = new dnot();
    public static final dsrg<Integer, dnpj> m = new dnou();
    public static final dnpo t;
    private static volatile dssr<dnpo> u;
    public int a;
    public dndc c;
    public int i;
    public boolean j;
    public int k;
    public int n;
    public int p;
    public dpyc q;
    public int r;
    public String b = "";
    public dsrf d = dsqz.b;
    public dsrf f = dsqz.b;
    public int h = 1;
    public dsrf l = dsqz.b;
    public dsrj<dndz> o = dssu.b;
    public dsrj<dnpb> s = dssu.b;

    static {
        dnpo dnpoVar = new dnpo();
        t = dnpoVar;
        dsqw.cc(dnpo.class, dnpoVar);
    }

    private dnpo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(t, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0005\u0000\u0001ဈ\u0000\u0002\u001e\u0003\u001e\u0004ဉ\u0001\u0005ဌ\u0002\u0006ဌ\u0005\b\u001e\tဇ\u0004\u000bဌ\u0003\fင\u0007\r\u001b\u000eင\b\u000fဉ\t\u0010င\n\u0011\u001b", new Object[]{"a", "b", "d", dnow.c(), "f", dnph.c(), "c", "h", dnpk.a, "k", dnoz.c(), "l", dnpj.c(), "j", "i", dnpn.c(), "n", "o", dndz.class, "p", "q", "r", "s", dnpb.class});
            }
            if (i2 == 3) {
                return new dnpo();
            }
            if (i2 == 4) {
                return new dnox();
            }
            if (i2 == 5) {
                return t;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnpo> dssrVar = u;
            if (dssrVar == null) {
                synchronized (dnpo.class) {
                    dssrVar = u;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(t);
                        u = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dndz> dsrjVar = this.o;
        if (!dsrjVar.a()) {
            this.o = dsqw.cl(dsrjVar);
        }
    }
}
