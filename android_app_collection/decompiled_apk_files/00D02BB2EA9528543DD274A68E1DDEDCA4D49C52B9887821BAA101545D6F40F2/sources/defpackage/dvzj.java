package defpackage;
/* compiled from: PG */
/* renamed from: dvzj  reason: default package */
/* loaded from: classes.dex */
public final class dvzj extends dsqs<dvzj, dvzi> implements dsqt {
    private static volatile dssr<dvzj> A;
    public static final dvzj y;
    public int a;
    public dhjz d;
    public dhjx e;
    public dvzd g;
    public boolean i;
    public dwfv j;
    public dvxt k;
    public dnqh l;
    public dnzj m;
    public dqht n;
    public dvxv o;
    public boolean p;
    public dobd q;
    public boolean r;
    public dnwb s;
    public djpw t;
    public boolean u;
    public dqvq v;
    public dgba w;
    private byte z = 2;
    public String b = "";
    public String c = "";
    public dsrf f = dsqz.b;
    public boolean h = true;
    public String x = "";

    static {
        dvzj dvzjVar = new dvzj();
        y = dvzjVar;
        dsqw.cc(dvzj.class, dvzjVar);
    }

    private dvzj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(y, "\u0001\u0017\u0000\u0001\u0001!\u0017\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004\u001e\u0005ဉ\u0004\u0007ဉ\t\tᐉ\f\nဉ\u0002\fᐉ\u000e\u000eဇ\u0005\u0010ဉ\u0010\u0011ဇ\u0006\u0012ဉ\u0011\u0015ဉ\u0007\u0016ဇ\u0013\u0017ဉ\u0014\u0018ဇ\u0015\u001aဉ\u0016\u001bဉ\u0017\u001dဇ\u0019\u001fဉ\u001b ဉ\u001c!ဈ\u001d", new Object[]{"a", "b", "c", "e", "f", dvxj.c(), "g", "k", "l", "d", "m", "h", "n", "i", "o", "j", "p", "q", "r", "s", "t", "u", "v", "w", "x"});
            }
            if (i2 == 3) {
                return new dvzj();
            }
            if (i2 == 4) {
                return new dvzi();
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
            dssr<dvzj> dssrVar = A;
            if (dssrVar == null) {
                synchronized (dvzj.class) {
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
