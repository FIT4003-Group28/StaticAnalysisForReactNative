package defpackage;
/* compiled from: PG */
/* renamed from: dpmv  reason: default package */
/* loaded from: classes6.dex */
public final class dpmv extends dsqw<dpmv, dpmu> implements dssk {
    public static final dpmv c;
    private static volatile dssr<dpmv> e;
    public int a;
    public String b = "";
    private int d;

    static {
        dpmv dpmvVar = new dpmv();
        c = dpmvVar;
        dsqw.cc(dpmv.class, dpmvVar);
    }

    private dpmv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"d", "a", dfzy.c(), "b"});
            }
            if (i2 == 3) {
                return new dpmv();
            }
            if (i2 == 4) {
                return new dpmu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpmv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpmv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
