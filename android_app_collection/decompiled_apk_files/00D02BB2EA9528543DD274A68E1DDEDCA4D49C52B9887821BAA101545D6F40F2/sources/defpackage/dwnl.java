package defpackage;
/* compiled from: PG */
/* renamed from: dwnl  reason: default package */
/* loaded from: classes.dex */
public final class dwnl extends dsqw<dwnl, dwni> implements dssk {
    private static volatile dssr<dwnl> A;
    public static final dwnl y;
    public int a;
    public long b;
    public dwzq d;
    public dwzq e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public dpad o;
    public dgbo p;
    public String q;
    public String r;
    public float s;
    public dgas t;
    public dgas u;
    public dgas v;
    public long w;
    public long x;
    private byte z = 2;
    public int c = 127;

    static {
        dwnl dwnlVar = new dwnl();
        y = dwnlVar;
        dsqw.cc(dwnl.class, dwnlVar);
    }

    private dwnl() {
        dssu<Object> dssuVar = dssu.b;
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.q = "";
        this.r = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(y, "\u0001\u0017\u0000\u0001\u0001\u0018\u0017\u0000\u0000\u0002\u0001စ\u0000\u0002ဌ\u0001\u0004ᐉ\u0002\u0005ဈ\u0006\u0006ဈ\t\u0007ဈ\n\bဈ\u000b\tᐉ\u0003\nဉ\r\u000bင\u0004\fင\u0005\rဈ\u0007\u000eဈ\u000f\u000fဈ\u0010\u0010ခ\u0011\u0011ဉ\u0012\u0012ဉ\u0013\u0013ဈ\f\u0014ဂ\u0015\u0015ဂ\u0016\u0016ဈ\b\u0017ဉ\u0014\u0018ဉ\u000e", new Object[]{"a", "b", "c", dwnk.c(), "d", "h", "k", "l", "m", "e", "o", "f", "g", "i", "q", "r", "s", "t", "u", "n", "w", "x", "j", "v", "p"});
            }
            if (i2 == 3) {
                return new dwnl();
            }
            if (i2 == 4) {
                return new dwni();
            }
            if (i2 == 5) {
                return y;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.z = b;
                return null;
            }
            dssr<dwnl> dssrVar = A;
            if (dssrVar == null) {
                synchronized (dwnl.class) {
                    dssrVar = A;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(y);
                        A = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.z);
    }
}
