package defpackage;
/* compiled from: PG */
/* renamed from: dozz  reason: default package */
/* loaded from: classes6.dex */
public final class dozz extends dsqw<dozz, doyq> implements dssk {
    private static volatile dssr<dozz> A;
    public static final dozz y;
    public int a;
    public Object c;
    public int f;
    public dnpq j;
    public dgaw k;
    public dgaw l;
    public dnoh q;
    public dnoh r;
    public douj u;
    public douj v;
    public int w;
    public dpad x;
    public int b = 0;
    private byte z = 2;
    public String d = "";
    public int e = 2;
    public String g = "";
    public String h = "";
    public String i = "";
    public dsrj<dpce> m = dssu.b;
    public dsrj<dpce> n = dssu.b;
    public dsrj<dpce> o = dssu.b;
    public dsrj<dpce> p = dssu.b;
    public String s = "";
    public int t = 127;

    static {
        dozz dozzVar = new dozz();
        y = dozzVar;
        dsqw.cc(dozz.class, dozzVar);
    }

    private dozz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(y, "\u0001\u001d\u0001\u0001\u0001 \u001d\u0000\u0004\b\u0001ဌ\u0002\u0002ဈ\u0004\u0003ဈ\u0005\u0004ဈ\u0006\u0005ဉ\u0007\u0007ဉ\t\bဉ\n\tဌ\u0003\nဉ\u0013\u000bဉ\u0014\fဈ\u0015\rဌ\u0016\u000eᐉ\u0017\u000fᐉ\u0018\u0010ဌ\u0019\u0011ဉ\u001a\u0012ြ\u0000\u0014Л\u0015Л\u0016ြ\u0000\u0017ြ\u0000\u0018Л\u0019ᐼ\u0000\u001aЛ\u001bြ\u0000\u001cြ\u0000\u001dြ\u0000\u001eᐼ\u0000 ဈ\u0001", new Object[]{"c", "b", "a", "e", doza.c(), "g", "h", "i", "j", "k", "l", "f", dozy.c(), "q", "r", "s", "t", doyd.c(), "u", "v", "w", dozc.c(), "x", doze.class, "m", dpce.class, "o", dpce.class, dozs.class, dozg.class, "n", dpce.class, dozw.class, "p", dpce.class, doyu.class, dozu.class, doys.class, doyy.class, "d"});
            }
            if (i2 == 3) {
                return new dozz();
            }
            if (i2 == 4) {
                return new doyq();
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
            dssr<dozz> dssrVar = A;
            if (dssrVar == null) {
                synchronized (dozz.class) {
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
