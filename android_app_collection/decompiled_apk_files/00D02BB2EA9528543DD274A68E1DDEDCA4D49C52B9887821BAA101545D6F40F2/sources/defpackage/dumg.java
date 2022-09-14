package defpackage;
/* compiled from: PG */
/* renamed from: dumg  reason: default package */
/* loaded from: classes6.dex */
public final class dumg extends dsqw<dumg, dumf> implements dssk {
    private static volatile dssr<dumg> B;
    public static final dumg z;
    public int a;
    public long c;
    public dnqh e;
    public boolean h;
    public boolean i;
    public boolean j;
    public ddmk l;
    public dume m;
    public ddna p;
    public dvnq q;
    public dvkw r;
    public dwwv s;
    public dofv t;
    public dvfy u;
    public dnop w;
    public dvra x;
    public eacd y;
    private byte A = 2;
    public dsrj<dtaq> b = dssu.b;
    public String d = "";
    public dsrj<dwxd> f = dssu.b;
    public dsrj<ddhk> g = dssu.b;
    public dsrj<duss> k = dssu.b;
    public dsrj<duty> n = dssu.b;
    public dsrf o = dsqz.b;
    public dsrj<doem> v = dssu.b;

    static {
        dumg dumgVar = new dumg();
        z = dumgVar;
        dsqw.cc(dumg.class, dumgVar);
    }

    private dumg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(z, "\u0001\u0018\u0000\u0001\u0001f\u0018\u0000\u0007\b\u0001\u001b\u0002ဂ\u0000\u0003ᐉ\u0002\u0004ᐉ\b\u0005ဈ\u0001\u0006Л\u0011ဉ\t\u0013ဉ\n\u0014ᐉ\u000b\u0015ဉ\f\u0016ᐉ\r\u0017\u001b\u0018ဉ\u000f\u0019ᐉ\u0010\u001aဇ\u0003\u001bဉ\u000e\u001dЛ\u001eဇ\u0005\u001fဇ\u0004 Л!ဉ\u0006dဉ\u0007e\u001bf\u0016", new Object[]{"a", "b", dtaq.class, "c", "e", "p", "d", "g", ddhk.class, "q", "r", "s", "t", "u", "v", doem.class, "x", "y", "h", "w", "f", dwxd.class, "j", "i", "k", duss.class, "l", "m", "n", duty.class, "o"});
            }
            if (i2 == 3) {
                return new dumg();
            }
            if (i2 == 4) {
                return new dumf();
            }
            if (i2 == 5) {
                return z;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.A = b;
                return null;
            }
            dssr<dumg> dssrVar = B;
            if (dssrVar == null) {
                synchronized (dumg.class) {
                    dssrVar = B;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(z);
                        B = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.A);
    }

    public final void c() {
        dsrj<dtaq> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
