package defpackage;
/* compiled from: PG */
/* renamed from: dood  reason: default package */
/* loaded from: classes6.dex */
public final class dood extends dsqw<dood, dooc> implements dssk {
    public static final dood n;
    private static volatile dssr<dood> p;
    public int a;
    public Object c;
    public int d;
    public int j;
    public drhd k;
    public drhd l;
    public dpuc m;
    public int b = 0;
    private byte o = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public dsrj<dozz> h = dssu.b;
    public dsrj<dpce> i = dssu.b;

    static {
        dood doodVar = new dood();
        n = doodVar;
        dsqw.cc(dood.class, doodVar);
    }

    private dood() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0001\u0001\u0001\r\f\u0000\u0002\u0003\u0001ᐼ\u0000\u0002ြ\u0000\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006Л\u0007Л\tင\u0006\nဈ\u0005\u000bဉ\u0007\fဉ\b\rဉ\t", new Object[]{"c", "b", "a", dooa.class, doof.class, "d", dpkg.a, "e", "f", "h", dozz.class, "i", dpce.class, "j", "g", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new dood();
            }
            if (i2 == 4) {
                return new dooc();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            }
            dssr<dood> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dood.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.o);
    }
}
