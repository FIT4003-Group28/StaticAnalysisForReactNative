package defpackage;
/* compiled from: PG */
/* renamed from: duov  reason: default package */
/* loaded from: classes.dex */
public final class duov extends dsqw<duov, duog> implements dssk {
    public static final duov K;
    private static volatile dssr<duov> O;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    private int L;
    private int M;
    private int N;
    public int a = 60;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public dsrj<duom> n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public duoq s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        duov duovVar = new duov();
        K = duovVar;
        dsqw.cc(duov.class, duovVar);
    }

    private duov() {
        dssu<Object> dssuVar = dssu.b;
        this.d = 1;
        this.j = cpnx.a;
        this.n = dssu.b;
        this.u = true;
        this.v = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(K, "\u0001$\u0000\u0003\fc$\u0000\u0001\u0000\fင\u0004\u0010ဌ\t\u001bဇ\u000e\u001cဌ\u000f!ဇ\u0015%ဇ\u0018&ဇ\u0019'ဇ\u001a(ဇ\u001b*င\u001d+ဇ\u001e,ဇ\u001f-ဇ .\u001b0ဇ#1ဇ$6ဌ'9ဇ(:ဉ*;ဇ+?ဇ1Aဇ2Bဇ3Cဇ5Lဇ6Nဇ9Pဇ;Sဇ@TဇAWဇC[ဇE\\ဇF]ဇG`ဇIbဇKcဇL", new Object[]{"L", "M", "N", "a", "b", duoh.a, "c", "d", duor.a, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", duom.class, "o", "p", "q", duot.a, "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"});
            }
            if (i2 == 3) {
                return new duov();
            }
            if (i2 == 4) {
                return new duog();
            }
            if (i2 == 5) {
                return K;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duov> dssrVar = O;
            if (dssrVar == null) {
                synchronized (duov.class) {
                    dssrVar = O;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(K);
                        O = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
