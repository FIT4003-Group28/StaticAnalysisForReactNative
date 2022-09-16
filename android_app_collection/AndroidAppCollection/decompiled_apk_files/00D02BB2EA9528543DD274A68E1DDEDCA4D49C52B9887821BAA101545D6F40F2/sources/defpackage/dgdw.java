package defpackage;
/* compiled from: PG */
/* renamed from: dgdw  reason: default package */
/* loaded from: classes6.dex */
public final class dgdw extends dsqw<dgdw, dgdp> implements dssk {
    public static final dgdw g;
    private static volatile dssr<dgdw> h;
    public int a;
    public String b = "";
    public int c;
    public dgbo d;
    public int e;
    public int f;

    static {
        dgdw dgdwVar = new dgdw();
        g = dgdwVar;
        dsqw.cc(dgdw.class, dgdwVar);
    }

    private dgdw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003ဉ\u0003\u0004ဌ\u0004\u0005ဌ\u0005", new Object[]{"a", "b", "c", dgdu.a, "d", "e", dgdr.c(), "f", dgds.a});
            }
            if (i2 == 3) {
                return new dgdw();
            }
            if (i2 == 4) {
                return new dgdp();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgdw> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dgdw.class) {
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
