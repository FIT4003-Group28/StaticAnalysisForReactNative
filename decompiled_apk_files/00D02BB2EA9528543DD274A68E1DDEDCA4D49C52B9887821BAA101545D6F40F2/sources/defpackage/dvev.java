package defpackage;
/* compiled from: PG */
/* renamed from: dvev  reason: default package */
/* loaded from: classes.dex */
public final class dvev extends dsqw<dvev, dves> implements dssk {
    public static final dvev B;
    private static volatile dssr<dvev> C;
    public boolean A;
    public int a;
    public boolean e;
    public boolean f;
    public boolean h;
    public int j;
    public int m;
    public int q;
    public int r;
    public int s;
    public int t;
    public int w;
    public int x;
    public String b = "";
    public String c = "";
    public String d = "";
    public int g = 3;
    public String i = "";
    public String k = "";
    public String l = "";
    public String n = "";
    public String o = "";
    public dsrf p = dsqz.b;
    public String u = "";
    public String v = "";
    public int y = 1;
    public String z = "";

    static {
        dvev dvevVar = new dvev();
        B = dvevVar;
        dsqw.cc(dvev.class, dvevVar);
    }

    private dvev() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(B, "\u0001\u001a\u0000\u0001\u0001!\u001a\u0000\u0001\u0000\u0001ဈ\u0001\u0002ဈ\u0003\u0003ဈ\u0005\u0005ဇ\u0007\u0006င\b\u0007ဇ\t\bဈ\f\tဈ\u000f\nဈ\u0010\u000b\u0016\fဈ\n\rဈ\r\u000eဋ\u0011\u000fဋ\u0012\u0010ဋ\u0013\u0013င\u0014\u0014ဈ\u0015\u0015ဌ\u001b\u0017ဈ\u001c\u0019ဈ\u0017\u001aဋ\u0019\u001bဋ\u001a\u001cဋ\u000b\u001dဋ\u000e ဇ\u0006!ဇ\u001e", new Object[]{"a", "b", "c", "d", "f", "g", "h", "k", "n", "o", "p", "i", "l", "q", "r", "s", "t", "u", "y", dvet.a, "z", "v", "w", "x", "j", "m", "e", "A"});
            }
            if (i2 == 3) {
                return new dvev();
            }
            if (i2 == 4) {
                return new dves();
            }
            if (i2 == 5) {
                return B;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvev> dssrVar = C;
            if (dssrVar == null) {
                synchronized (dvev.class) {
                    dssrVar = C;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(B);
                        C = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
