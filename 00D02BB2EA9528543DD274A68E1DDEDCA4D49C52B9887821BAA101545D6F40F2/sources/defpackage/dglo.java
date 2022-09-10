package defpackage;
/* compiled from: PG */
/* renamed from: dglo  reason: default package */
/* loaded from: classes6.dex */
public final class dglo extends dsqw<dglo, dgln> implements dssk {
    public static final dglo g;
    private static volatile dssr<dglo> h;
    public int a;
    public String b = "";
    public String c = "";
    public dglu d;
    public int e;
    public dglg f;

    static {
        dglo dgloVar = new dglo();
        g = dgloVar;
        dsqw.cc(dglo.class, dgloVar);
    }

    private dglo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", dgkx.a, "f"});
            }
            if (i2 == 3) {
                return new dglo();
            }
            if (i2 == 4) {
                return new dgln();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dglo> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dglo.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
