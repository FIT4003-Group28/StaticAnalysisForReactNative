package defpackage;
/* compiled from: PG */
/* renamed from: dwnv  reason: default package */
/* loaded from: classes.dex */
public final class dwnv extends dsqw<dwnv, dwns> implements dssk {
    public static final dwnv P;
    private static volatile dssr<dwnv> T;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    private int Q;
    private int R;
    private int S;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean y;
    public boolean z;
    public int a = 60;
    public int b = 15;
    public int m = 60000;
    public int n = 15000;
    public int o = 2000;
    public int p = 6;
    public int q = 2;
    public int r = 6;
    public int s = 15000;
    public int t = 3000;
    public int x = -300;

    static {
        dwnv dwnvVar = new dwnv();
        P = dwnvVar;
        dsqw.cc(dwnv.class, dwnvVar);
    }

    private dwnv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(P, "\u0001)\u0000\u0003\u0003F)\u0000\u0000\u0000\u0003င\u0002\u0005ဇ\u0005\bဇ\f\tဇ\r\u000bဇ\u000f\fင\u0014\rင\u0015\u000eင\u001b\u000fဇ\u0012\u0010ဇ\u001c\u0013င\u001a\u0016င\u0016\u0017င\u0017\u0018င\u0018\u0019င\u0019\u001bဇ\u001f\u001cဇ\u0010\u001dဇ \u001eင!\u001fဇ\" ဇ#!ဇ$\"ဇ&#ဇ'&ဇ)(ဇ%)ဇ\n*င\u00032ဇ*4ဇ+5ဌ5:ဇ9<ဇ,=ဇ\b>ဇ=@ဇ:Aဇ?Bဇ\u0006Cဇ;Dဇ\u0007FဇA", new Object[]{"Q", "R", "S", "a", "c", "h", "i", "j", "m", "n", "t", "l", "u", "s", "o", "p", "q", "r", "v", "k", "w", "x", "y", "z", "A", "C", "D", "E", "B", "g", "b", "F", "G", "I", dwnt.a, "J", "H", "f", "M", "K", "N", "d", "L", "e", "O"});
            }
            if (i2 == 3) {
                return new dwnv();
            }
            if (i2 == 4) {
                return new dwns();
            }
            if (i2 == 5) {
                return P;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwnv> dssrVar = T;
            if (dssrVar == null) {
                synchronized (dwnv.class) {
                    dssrVar = T;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(P);
                        T = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
