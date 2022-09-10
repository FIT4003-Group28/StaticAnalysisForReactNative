package defpackage;
/* compiled from: PG */
/* renamed from: chxl  reason: default package */
/* loaded from: classes4.dex */
public final class chxl extends dsqw<chxl, chvz> implements dssk {
    public static final chxl x;
    private static volatile dssr<chxl> z;
    public int a;
    public chxr b;
    public dwlh d;
    public dpot e;
    public boolean h;
    public chxp i;
    public int j;
    public int k;
    public boolean l;
    public boolean q;
    public dqwy s;
    public dqwy t;
    public boolean v;
    public boolean w;
    private byte y = 2;
    public String c = "";
    public String f = "";
    public dsrj<dosf> g = dssu.b;
    public String m = "";
    public String n = "";
    public dsrj<dwfl> o = dssu.b;
    public dsrj<dwmz> p = dssu.b;
    public dsrj<chwj> r = dssu.b;
    public dsrj<chxk> u = dssu.b;

    static {
        chxl chxlVar = new chxl();
        x = chxlVar;
        dsqw.cc(chxl.class, chxlVar);
    }

    private chxl() {
    }

    public static /* synthetic */ void d(chxl chxlVar) {
        chxlVar.a |= 4096;
        chxlVar.q = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(x, "\u0001\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0005\u0002\u0001ဉ\u0000\u0002င\b\u0004Л\u0005ဈ\u0001\u0007ဇ\t\bဈ\n\tᐉ\u0002\nဈ\u000b\u000b\u001b\fဈ\u0004\r\u001b\u000e\u001b\u000fဇ\u000f\u0010ဇ\u0010\u0011\u001b\u0013ဇ\f\u0014ဉ\u0006\u0015ဇ\u0005\u0016င\u0007\u0017ဉ\u0003\u0018ဉ\r\u0019ဉ\u000e", new Object[]{"a", "b", "k", "u", chxk.class, "c", "l", "m", "d", "n", "p", dwmz.class, "f", "g", dosf.class, "o", dwfl.class, "v", "w", "r", chwj.class, "q", "i", "h", "j", "e", "s", "t"});
            }
            if (i2 == 3) {
                return new chxl();
            }
            if (i2 == 4) {
                return new chvz();
            }
            if (i2 == 5) {
                return x;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            }
            dssr<chxl> dssrVar = z;
            if (dssrVar == null) {
                synchronized (chxl.class) {
                    dssrVar = z;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(x);
                        z = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.y);
    }

    public final void b() {
        dsrj<dosf> dsrjVar = this.g;
        if (!dsrjVar.a()) {
            this.g = dsqw.cl(dsrjVar);
        }
    }

    public final void c() {
        dsrj<chxk> dsrjVar = this.u;
        if (!dsrjVar.a()) {
            this.u = dsqw.cl(dsrjVar);
        }
    }
}
