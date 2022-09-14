package defpackage;
/* compiled from: PG */
/* renamed from: ddet  reason: default package */
/* loaded from: classes.dex */
public final class ddet extends dsqw<ddet, ddes> implements dssk {
    public static final ddet D;
    public static final dsqv<ddhk, ddet> E;
    private static volatile dssr<ddet> H;
    public ddmc A;
    public ddlu B;
    public ddir C;
    private ddex F;
    private byte G = 2;
    public int a;
    public int b;
    public ddep c;
    public dean d;
    public ddfo e;
    public ddfk f;
    public ddcq g;
    public ddzp h;
    public ddcs i;
    public ddgo j;
    public ddcy k;
    public ddhr l;
    public ddij m;
    public dden n;
    public long o;
    public ddcf p;
    public ddfd q;
    public ddhc r;
    public ddde s;
    public ddel t;
    public ddfq u;
    public ddfb v;
    public ddgr w;
    public ddhw x;
    public ddgw y;
    public ddgt z;

    static {
        ddet ddetVar = new ddet();
        D = ddetVar;
        dsqw.cc(ddet.class, ddetVar);
        E = dsqw.newSingularGeneratedExtension(ddhk.k, ddetVar, ddetVar, null, 363, dsur.MESSAGE, ddet.class);
    }

    private ddet() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(D, "\u0001\u001c\u0000\u0002\u0001'\u001c\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bᐉ\n\fဉ\u000b\u000eဂ\r\u000fဉ\u000e\u0010ဉ\u000f\u0012ᐉ\u0011\u0015ဉ\u0014\u0016ဉ\u0015\u0017ဉ\u0016\u0018ဉ\u0017\u001aဉ\u0019\u001eဉ\u001d\u001fဉ\u001e!ဉ \"ဉ!#ဉ\"$ဉ#'ဉ&", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "F", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C"});
            }
            if (i2 == 3) {
                return new ddet();
            }
            if (i2 == 4) {
                return new ddes();
            }
            if (i2 == 5) {
                return D;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.G = b;
                return null;
            }
            dssr<ddet> dssrVar = H;
            if (dssrVar == null) {
                synchronized (ddet.class) {
                    dssrVar = H;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(D);
                        H = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.G);
    }
}
