package defpackage;
/* compiled from: PG */
/* renamed from: dpnn  reason: default package */
/* loaded from: classes6.dex */
public final class dpnn extends dsqw<dpnn, dpni> implements dssk {
    public static final dpnn e;
    private static volatile dssr<dpnn> g;
    public Object b;
    private int f;
    public int a = 0;
    public String c = "";
    public String d = "";

    static {
        dpnn dpnnVar = new dpnn();
        e = dpnnVar;
        dsqw.cc(dpnn.class, dpnnVar);
    }

    private dpnn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", "f", "c", "d", dpnk.class, dpnm.class});
            }
            if (i2 == 3) {
                return new dpnn();
            }
            if (i2 == 4) {
                return new dpni();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpnn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpnn.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
