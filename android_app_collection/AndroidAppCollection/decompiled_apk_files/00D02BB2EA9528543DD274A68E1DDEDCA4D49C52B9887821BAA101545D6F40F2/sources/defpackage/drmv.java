package defpackage;
/* compiled from: PG */
/* renamed from: drmv  reason: default package */
/* loaded from: classes6.dex */
public final class drmv extends dsqw<drmv, drms> implements dssk {
    public static final drmv f;
    private static volatile dssr<drmv> g;
    public int a;
    public drnn c;
    public int d;
    public String b = "";
    public String e = "";

    static {
        drmv drmvVar = new drmv();
        f = drmvVar;
        dsqw.cc(drmv.class, drmvVar);
    }

    private drmv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဌ\u0004\u0007ဈ\u0005\bဉ\u0003", new Object[]{"a", "b", "d", drmu.c(), "e", "c"});
            }
            if (i2 == 3) {
                return new drmv();
            }
            if (i2 == 4) {
                return new drms();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drmv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drmv.class) {
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
