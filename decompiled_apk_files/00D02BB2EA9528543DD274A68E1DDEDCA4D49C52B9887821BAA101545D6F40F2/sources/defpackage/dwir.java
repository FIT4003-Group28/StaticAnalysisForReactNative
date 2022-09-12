package defpackage;
/* compiled from: PG */
/* renamed from: dwir  reason: default package */
/* loaded from: classes.dex */
public final class dwir extends dsqw<dwir, dwim> implements dssk {
    public static final dwir R;
    private static volatile dssr<dwir> U;
    public boolean A;
    public dwhv B;
    public boolean C;
    public dwio D;
    public dwaw E;
    public boolean F;
    public dnwb G;
    public boolean H;
    public int I;
    public dsrj<dwil> J;
    public djmy K;
    public diyl L;
    public dqgy M;
    public int N;
    public dqep O;
    public dspd P;
    public boolean Q;
    private boolean S;
    public int a;
    public int b;
    public dhjx d;
    public dhkd e;
    public int f;
    public boolean h;
    public int i;
    public dtaq j;
    public dvzd l;
    public dgba m;
    public dwfv n;
    public dhkd o;
    public dvxt p;
    public dhkd q;
    public dvxv r;
    public dnqh s;
    public dnzj t;
    public dwiq u;
    public dnfo v;
    public dwix w;
    public doed x;
    public dodt y;
    public boolean z;
    private byte T = 2;
    public String c = "";
    public int g = 10;
    public dspd k = dspd.b;

    static {
        dwir dwirVar = new dwir();
        R = dwirVar;
        dsqw.cc(dwir.class, dwirVar);
    }

    private dwir() {
        dsqz dsqzVar = dsqz.b;
        this.J = dssu.b;
        this.P = dspd.b;
    }

    public static /* synthetic */ void e(dwir dwirVar) {
        dwirVar.b |= 16;
        dwirVar.S = true;
    }

    public static /* synthetic */ void f(dwir dwirVar) {
        dwirVar.b |= 16384;
        dwirVar.H = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(R, "\u0001*\u0000\u0002\u0001>*\u0000\u0001\u0004\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0003\u0004င\u0004\u0007ဇ\u0007\bဌ\b\u000bဉ\f\fည\r\rဉ\u000e\u000eဉ\u0013\u000fဉ\u0014\u0010ဉ\u0016\u0013ᐉ\u0019\u0014ᐉ\u001a\u0015ဉ\u001b\u0016ဉ\u001c\u0018ဇ \u0019ဉ\u001d\u001eဉ\u001e\u001fဇ\" ဉ#\"ဇ%$ဉ\u0018%ဉ(&ᐉ)'ဉ\u0002+ဇ,,ᐉ\u001f.ဉ\u0012/ဉ-0ဇ.1ဌ/2\u001b3ဉ05ဉ28ဉ59ဌ6:ဉ\u000f;ည8<ဉ7=ဇ$>ဇ9", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", dvwd.a, "j", "k", "l", "o", "p", "q", "s", "t", "u", "v", "z", "w", "x", "A", "B", "C", "r", "D", "E", "e", "F", "y", "n", "G", "H", "I", dwit.a, "J", dwil.class, "K", "L", "M", "N", dpvf.c(), "m", "P", "O", "S", "Q"});
            }
            if (i2 == 3) {
                return new dwir();
            }
            if (i2 == 4) {
                return new dwim();
            }
            if (i2 == 5) {
                return R;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.T = b;
                return null;
            }
            dssr<dwir> dssrVar = U;
            if (dssrVar == null) {
                synchronized (dwir.class) {
                    dssrVar = U;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(R);
                        U = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.T);
    }

    public final void c() {
        dsrj<dwil> dsrjVar = this.J;
        if (!dsrjVar.a()) {
            this.J = dsqw.cl(dsrjVar);
        }
    }
}
