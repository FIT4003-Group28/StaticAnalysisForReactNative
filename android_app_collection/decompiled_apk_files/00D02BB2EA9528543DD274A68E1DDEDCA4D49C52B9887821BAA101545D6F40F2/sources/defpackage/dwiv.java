package defpackage;
/* compiled from: PG */
/* renamed from: dwiv  reason: default package */
/* loaded from: classes6.dex */
public final class dwiv extends dsqs<dwiv, dwis> implements dsqt {
    public static final dwiv M;
    private static volatile dssr<dwiv> O;
    public dwhp A;
    public boolean D;
    public boolean E;
    public dhyf F;
    public dqgj G;
    public dpnq H;
    public dpns I;
    public dmni J;
    public dqim K;
    public dfzq L;
    public int a;
    public int b;
    public int e;
    public dhjx f;
    public dhjx g;
    public dvus h;
    public dwib i;
    public dwid j;
    public dwbc k;
    public dwif l;
    public dqdk m;
    public doed n;
    public dqbx o;
    public boolean p;
    public int r;
    public dwij s;
    public dndp t;
    public boolean u;
    public djnc v;
    public djrs w;
    public djrs x;
    public djrs y;
    public djqm z;
    private byte N = 2;
    public dsrj<dvyw> c = dssu.b;
    public boolean d = true;
    public String q = "";
    public dsrj<dqfh> B = dssu.b;
    public dspd C = dspd.b;

    static {
        dwiv dwivVar = new dwiv();
        M = dwivVar;
        dsqw.cc(dwiv.class, dwivVar);
    }

    private dwiv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(M, "\u0001$\u0000\u0002\u0001.$\u0000\u0002\b\u0001Л\u0002ဇ\u0000\u0003ဉ\u0003\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\t\nᐉ\u0005\fဈ\u0011\rဉ\u000b\u000fဌ\u0012\u0011ᐉ\b\u0012ဉ\u0004\u0013ဉ\u0013\u0014ဉ\u0014\u0016ဇ\u0015\u0017ဉ\u0016\u0019ᐉ\u0018\u001aဉ\u001b\u001bဇ\u0010\u001dဉ\u001d\u001e\u001b\u001fᐉ\u0019 ည\u001e!ဉ!\"ဉ\"#င\u0001$ဇ\u001f%ဉ#&ဉ$(ᐉ%)ဇ *ဉ\n+ဉ&,ဉ'-ᐉ\u001a.ᐉ\f", new Object[]{"a", "b", "c", dvyw.class, "d", "f", "i", "j", "l", "h", "q", "n", "r", dwit.a, "k", "g", "s", "t", "u", "v", "w", "z", "p", "A", "B", dqfh.class, "x", "C", "F", "G", "e", "D", "H", "I", "J", "E", "m", "K", "L", "y", "o"});
            }
            if (i2 == 3) {
                return new dwiv();
            }
            if (i2 == 4) {
                return new dwis();
            }
            if (i2 == 5) {
                return M;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.N = b;
                return null;
            }
            dssr<dwiv> dssrVar = O;
            if (dssrVar == null) {
                synchronized (dwiv.class) {
                    dssrVar = O;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(M);
                        O = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.N);
    }
}
