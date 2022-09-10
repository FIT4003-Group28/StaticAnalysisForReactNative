package defpackage;
/* compiled from: PG */
/* renamed from: dwao  reason: default package */
/* loaded from: classes.dex */
public final class dwao extends dsqw<dwao, dwal> implements dssk {
    public static final dwao R;
    private static volatile dssr<dwao> U;
    public boolean A;
    public dosz B;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public dqnz K;
    public dqtv L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    private boolean S;
    private boolean T;
    public int a;
    public int b;
    public Object d;
    public dphq e;
    public dwbk f;
    public dowr g;
    public dpiv h;
    public dpjf i;
    public dotp j;
    public dpeg k;
    public int m;
    public boolean o;
    public boolean p;
    public dpbs q;
    public boolean s;
    public dquf t;
    public boolean u;
    public boolean v;
    public dpbh w;
    public boolean x;
    public dpbd y;
    public boolean z;
    public int c = 0;
    public int l = 3;
    public int n = 1;
    public dsrf r = dsqz.b;
    public boolean C = true;

    static {
        dwao dwaoVar = new dwao();
        R = dwaoVar;
        dsqw.cc(dwao.class, dwaoVar);
    }

    private dwao() {
    }

    public static /* synthetic */ void c(dwao dwaoVar) {
        dwaoVar.a |= 32768;
        dwaoVar.S = true;
    }

    public static /* synthetic */ void e(dwao dwaoVar) {
        dwaoVar.b |= 8192;
        dwaoVar.T = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(R, "\u0001+\u0001\u0002\u0001F+\u0000\u0001\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0004ဇ\u0015\u0006ဉ\u0016\u0007ဇ\n\bဇ\u0017\tဉ\u0018\nဇ\r\u000bဉ\u000e\u000f\u0016\u0010ဇ\u0012\u0011ဉ\u0000\u0015ဇ\u0014\u0016ဇ\u001d\u0017ဉ\u001e\u0018ဉ\u0013\u0019ဇ\u001f\u001aဇ \u001bဇ\"\u001eဇ% ဇ'&ဇ*'င\u0007*ဇ\u000f,ဉ\u0003-ဉ\u0005.ဇ+/ဇ\u00190ြ\u00002ဇ-6ဌ\t7ဉ\u00068ဉ.9ဉ/:ဇ!<င\b=ဇ0@ြ\u0000Bဇ3Cဇ4Dဉ\u0004Eဇ5Fဇ6", new Object[]{"d", "c", "a", "b", "f", "g", "v", "w", "o", "x", "y", "p", "q", "r", "s", "e", "u", "A", "B", "t", "C", "D", "F", "G", "H", "I", "l", "S", "h", "j", "J", "z", dpbf.class, "T", "n", dwam.a, "k", "K", "L", "E", "m", "M", dpbb.class, "N", "O", "i", "P", "Q"});
            }
            if (i2 == 3) {
                return new dwao();
            }
            if (i2 == 4) {
                return new dwal();
            }
            if (i2 == 5) {
                return R;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwao> dssrVar = U;
            if (dssrVar == null) {
                synchronized (dwao.class) {
                    dssrVar = U;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(R);
                        U = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
