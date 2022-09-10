package defpackage;
/* compiled from: PG */
/* renamed from: dvmw  reason: default package */
/* loaded from: classes6.dex */
public final class dvmw extends dsqw<dvmw, dvmv> implements dssk {
    public static final dvmw e;
    private static volatile dssr<dvmw> g;
    public boolean a;
    public int b = cpnx.a;
    public int c = 30;
    public boolean d;
    private int f;

    static {
        dvmw dvmwVar = new dvmw();
        e = dvmwVar;
        dsqw.cc(dvmw.class, dvmwVar);
    }

    private dvmw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvmw();
            }
            if (i2 == 4) {
                return new dvmv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvmw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvmw.class) {
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
