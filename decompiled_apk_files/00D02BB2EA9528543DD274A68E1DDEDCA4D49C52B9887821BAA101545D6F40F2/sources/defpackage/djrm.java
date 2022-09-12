package defpackage;
/* compiled from: PG */
/* renamed from: djrm  reason: default package */
/* loaded from: classes.dex */
public final class djrm extends dsqw<djrm, djrl> implements dssk {
    public static final djrm v;
    private static volatile dssr<djrm> x;
    public int a;
    public dghq d;
    public int f;
    public int g;
    public dprg h;
    public int i;
    public djro j;
    public drco m;
    public dprx o;
    public dpvg p;
    public int r;
    public boolean t;
    private byte w = 2;
    public String b = "";
    public String c = "";
    public dsrj<dvyw> e = dssu.b;
    public String k = "";
    public String l = "";
    public String n = "";
    public String q = "";
    public dspd s = dspd.b;
    public dsrj<djrk> u = dssu.b;

    static {
        djrm djrmVar = new djrm();
        v = djrmVar;
        dsqw.cc(djrm.class, djrmVar);
    }

    private djrm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(v, "\u0001\u0014\u0000\u0001\u0001\u0019\u0014\u0000\u0002\u0002\u0001ဈ\u0000\u0002Л\u0003င\u0003\u0004င\u0004\u0005ဉ\u0007\u0006ဈ\b\u0007ဉ\u000b\bဈ\f\nဈ\u0001\u000bဈ\t\fဉ\r\rင\u0010\u000eည\u0011\u0010ဌ\u0006\u0011ဈ\u000f\u0012ဉ\u000e\u0015\u001b\u0016ဉ\u0005\u0017ဇ\u0012\u0019ᐉ\u0002", new Object[]{"a", "b", "e", dvyw.class, "f", "g", "j", "k", "m", "n", "c", "l", "o", "r", "s", "i", dgij.a, "q", "p", "u", djrk.class, "h", "t", "d"});
            }
            if (i2 == 3) {
                return new djrm();
            }
            if (i2 == 4) {
                return new djrl();
            }
            if (i2 == 5) {
                return v;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.w = b;
                return null;
            }
            dssr<djrm> dssrVar = x;
            if (dssrVar == null) {
                synchronized (djrm.class) {
                    dssrVar = x;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(v);
                        x = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.w);
    }

    public final void b() {
        dsrj<dvyw> dsrjVar = this.e;
        if (!dsrjVar.a()) {
            this.e = dsqw.cl(dsrjVar);
        }
    }
}
