package defpackage;
/* compiled from: PG */
/* renamed from: crwb  reason: default package */
/* loaded from: classes5.dex */
public final class crwb extends dsqw<crwb, crwa> implements dssk {
    public static final crwb y;
    private static volatile dssr<crwb> z;
    public int a;
    public boolean d;
    public boolean e;
    public crwd g;
    public boolean h;
    public boolean j;
    public boolean k;
    public int n;
    public boolean o;
    public boolean p;
    public boolean s;
    public int v;
    public crwf w;
    public boolean x;
    public int b = 1;
    public String c = "mapsphotoupload/v2/";
    public int f = 250;
    public int i = 5;
    public int l = 5;
    public int m = 1000;
    public int q = 21600;
    public int r = cpnx.a;
    public int t = 78643200;
    public boolean u = true;

    static {
        crwb crwbVar = new crwb();
        y = crwbVar;
        dsqw.cc(crwb.class, crwbVar);
    }

    private crwb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(y, "\u0001\u0017\u0000\u0001\u0001\u001e\u0017\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဉ\u0005\bဇ\u0006\tင\u0007\fဇ\b\rဇ\t\u000eင\n\u000fင\u000b\u0010င\f\u0011ဇ\r\u0012ဇ\u000e\u0013င\u000f\u0014င\u0010\u0016ဇ\u0011\u0019င\u0012\u001aဇ\u0013\u001bင\u0014\u001cဉ\u0015\u001eဇ\u0016", new Object[]{"a", "b", crvz.c(), "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x"});
            }
            if (i2 == 3) {
                return new crwb();
            }
            if (i2 == 4) {
                return new crwa();
            }
            if (i2 == 5) {
                return y;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<crwb> dssrVar = z;
            if (dssrVar == null) {
                synchronized (crwb.class) {
                    dssrVar = z;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(y);
                        z = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
