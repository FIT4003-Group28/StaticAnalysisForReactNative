package defpackage;
/* compiled from: PG */
/* renamed from: dvrv  reason: default package */
/* loaded from: classes6.dex */
public final class dvrv extends dsqw<dvrv, dvrt> implements dssk {
    public static final dvrv f;
    private static volatile dssr<dvrv> g;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public dvqt e;

    static {
        dvrv dvrvVar = new dvrv();
        f = dvrvVar;
        dsqw.cc(dvrv.class, dvrvVar);
    }

    private dvrv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဌ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d", dvru.a, "e"});
            }
            if (i2 == 3) {
                return new dvrv();
            }
            if (i2 == 4) {
                return new dvrt();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvrv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvrv.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}