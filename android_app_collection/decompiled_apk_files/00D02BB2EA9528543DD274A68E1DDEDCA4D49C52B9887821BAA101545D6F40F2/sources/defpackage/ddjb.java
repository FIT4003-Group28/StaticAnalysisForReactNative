package defpackage;
/* compiled from: PG */
/* renamed from: ddjb  reason: default package */
/* loaded from: classes5.dex */
public final class ddjb extends dsqw<ddjb, ddja> implements dssk {
    private static volatile dssr<ddjb> A;
    public static final ddjb z;
    public int a;
    public boolean d;
    public boolean e;
    public ddjd g;
    public boolean h;
    public boolean j;
    public boolean k;
    public int n;
    public boolean o;
    public boolean p;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int x;
    public boolean y;
    public int b = 1;
    public String c = "mapsphotoupload/v2/";
    public int f = 250;
    public int i = 5;
    public int l = 5;
    public int m = 1000;
    public int q = 21600;
    public int r = cpnx.a;
    public boolean w = true;

    static {
        ddjb ddjbVar = new ddjb();
        z = ddjbVar;
        dsqw.cc(ddjb.class, ddjbVar);
    }

    private ddjb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(z, "\u0001\u0018\u0000\u0001\u0001\u001d\u0018\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဉ\u0005\bဇ\u0007\tင\b\fဇ\u000b\rဇ\f\u000eင\r\u000fင\u000e\u0010င\u000f\u0011ဇ\u0010\u0012ဇ\u0011\u0013င\u0012\u0014င\u0013\u0016ဇ\u0015\u0017ဇ\u0016\u0018ဇ\u0017\u0019င\u0018\u001aဇ\u0019\u001bင\u001a\u001dဇ\u001b", new Object[]{"a", "b", ddiy.a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"});
            }
            if (i2 == 3) {
                return new ddjb();
            }
            if (i2 == 4) {
                return new ddja();
            }
            if (i2 == 5) {
                return z;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddjb> dssrVar = A;
            if (dssrVar == null) {
                synchronized (ddjb.class) {
                    dssrVar = A;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(z);
                        A = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
