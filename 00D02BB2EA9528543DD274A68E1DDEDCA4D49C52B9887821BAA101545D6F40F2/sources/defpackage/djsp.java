package defpackage;
/* compiled from: PG */
/* renamed from: djsp  reason: default package */
/* loaded from: classes6.dex */
public final class djsp extends dsqw<djsp, djsm> implements dssk {
    public static final djsp g;
    private static volatile dssr<djsp> h;
    public int a;
    public djso b;
    public djso c;
    public String d = "";
    public String e = "";
    public dnpq f;

    static {
        djsp djspVar = new djsp();
        g = djspVar;
        dsqw.cc(djsp.class, djspVar);
    }

    private djsp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0005ဉ\u0004\u0007ဈ\u0003", new Object[]{"a", "b", "c", "d", "f", "e"});
            }
            if (i2 == 3) {
                return new djsp();
            }
            if (i2 == 4) {
                return new djsm();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djsp> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djsp.class) {
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
