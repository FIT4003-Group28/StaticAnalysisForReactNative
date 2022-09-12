package defpackage;
/* compiled from: PG */
/* renamed from: dmaw  reason: default package */
/* loaded from: classes6.dex */
public final class dmaw extends dsqw<dmaw, dmav> implements dssk {
    public static final dmaw n;
    private static volatile dssr<dmaw> o;
    public int a;
    public Object c;
    public Object e;
    public Object g;
    public dmcc h;
    public long i;
    public long j;
    public dnpq l;
    public int b = 0;
    public int d = 0;
    public int f = 0;
    public String k = "";
    public String m = "";

    static {
        dmaw dmawVar = new dmaw();
        n = dmawVar;
        dsqw.cc(dmaw.class, dmawVar);
    }

    private dmaw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0003\u0001\u0001\r\f\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဈ\u0004\u0005ဉ\u0005\u0006ျ\u0001\u0007ြ\u0001\bျ\u0002\tြ\u0002\u000bျ\u0000\fြ\u0000\rဈ\f", new Object[]{"c", "b", "e", "d", "g", "f", "a", "h", "i", "j", "k", "l", dczv.class, dczv.class, dczv.class, "m"});
            }
            if (i2 == 3) {
                return new dmaw();
            }
            if (i2 == 4) {
                return new dmav();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmaw> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dmaw.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
