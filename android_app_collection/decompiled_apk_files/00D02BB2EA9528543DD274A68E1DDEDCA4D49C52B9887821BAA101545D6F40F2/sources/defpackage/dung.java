package defpackage;
/* compiled from: PG */
/* renamed from: dung */
/* loaded from: classes.dex */
public final class dung extends dsqw<dung, dune> implements dssk {
    public static final dung R;
    private static volatile dssr<dung> S;
    public long A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public dumo F;
    public boolean G;
    public int H;
    public long I;
    public long J;
    public long K;
    public String L;
    public int M;
    public int N;
    public dumr O;
    public dsrj<String> P;
    public dhmr Q;
    public int a;
    public int b;
    public dkgr g;
    public boolean h;
    public boolean j;
    public boolean l;
    public boolean n;
    public dumv p;
    public dsrf q;
    public String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String i = "";
    public String k = "";
    public String m = "";
    public int o = 1;

    static {
        dung dungVar = new dung();
        R = dungVar;
        dsqw.cc(dung.class, dungVar);
    }

    private dung() {
        dsqz dsqzVar = dsqz.b;
        dssu<Object> dssuVar = dssu.b;
        this.q = dsqz.b;
        this.r = "";
        this.t = true;
        this.u = true;
        this.v = "";
        this.w = "";
        this.x = "";
        this.y = "";
        this.z = "";
        this.L = "";
        this.P = dssu.b;
    }

    public static /* synthetic */ void c(dung dungVar) {
        dungVar.a |= 2048;
        dungVar.j = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(R, "\u0001)\u0000\u0002\u0001G)\u0000\u0002\u0000\u0001ဈ\u0000\u0004ဇ\b\u0005ဈ\n\u0006ဈ\u0002\u0007ဇ\u000b\bဈ\f\tဈ\u0004\nဇ\r\fဈ\u0001\u0012ဈ\u000f\u0016ဌ\u0014\u001bဈ\u0018\u001dဇ\u001a ဇ\u001d!ဇ\u001e%ဈ\"&ဈ#'ဈ$(ဈ%*ဇ,-ဇ0/င)0င*3ဉ\u00154င15ဂ27ဂ39ဂ4:ဈ5;'<ဇ\u0012=ဌ6>ဌ7?ဉ8@\u001aBဈ&Cဂ'Dဌ(Eဉ\u0007Fဉ:Gဉ.", new Object[]{"a", "b", "c", "h", "i", "e", "j", "k", "f", "l", "d", "m", "o", dunf.a, "r", "s", "t", "u", "v", "w", "x", "y", "E", "G", "C", "D", "p", "H", "I", "J", "K", "L", "q", "n", "M", dumt.c(), "N", dumk.a, "O", "P", "z", "A", "B", dvoz.c(), "g", "Q", "F"});
            }
            if (i2 == 3) {
                return new dung();
            }
            if (i2 == 4) {
                return new dune();
            }
            if (i2 == 5) {
                return R;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dung> dssrVar = S;
            if (dssrVar == null) {
                synchronized (dung.class) {
                    dssrVar = S;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(R);
                        S = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
