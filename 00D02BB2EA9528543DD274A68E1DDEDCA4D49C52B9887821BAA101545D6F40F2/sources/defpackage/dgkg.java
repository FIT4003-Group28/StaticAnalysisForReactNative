package defpackage;
/* compiled from: PG */
/* renamed from: dgkg  reason: default package */
/* loaded from: classes6.dex */
public final class dgkg extends dsqw<dgkg, dgjx> implements dssk {
    public static final dgkg o;
    private static volatile dssr<dgkg> p;
    public int a;
    public Object c;
    public int i;
    public dgju j;
    public dgkf k;
    public dgkb l;
    public dgci n;
    public int b = 0;
    public String d = "";
    public dspd e = dspd.b;
    public String f = "";
    public String g = "";
    public dspd h = dspd.b;
    public String m = "";

    static {
        dgkg dgkgVar = new dgkg();
        o = dgkgVar;
        dsqw.cc(dgkg.class, dgkgVar);
    }

    private dgkg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(o, "\u0001\u000f\u0001\u0001\u0001\u0016\u000f\u0000\u0000\u0000\u0001ည\u0001\u0002ဈ\u0000\u0003ြ\u0000\u0006ည\u0004\u0007ဌ\u0005\nဉ\f\u000bဉ\r\rြ\u0000\u000eြ\u0000\u0010ဈ\u000f\u0012ဈ\u0002\u0013ဉ\u0006\u0014ဈ\u0003\u0015ဉ\u0010\u0016ြ\u0000", new Object[]{"c", "b", "a", "e", "d", dgjq.class, "h", "i", dgjw.c(), "k", "l", dgkq.class, dgko.class, "m", "f", "j", "g", "n", dgjs.class});
            }
            if (i2 == 3) {
                return new dgkg();
            }
            if (i2 == 4) {
                return new dgjx();
            }
            if (i2 == 5) {
                return o;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgkg> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dgkg.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(o);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
