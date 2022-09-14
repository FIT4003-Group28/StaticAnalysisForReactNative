package defpackage;
/* compiled from: PG */
/* renamed from: dkhv  reason: default package */
/* loaded from: classes6.dex */
public final class dkhv extends dsqw<dkhv, dkhu> implements dssk {
    public static final dkhv g;
    private static volatile dssr<dkhv> h;
    public int a;
    public boolean b;
    public boolean c;
    public dirl d;
    public dhlb e;
    public boolean f;

    static {
        dkhv dkhvVar = new dkhv();
        g = dkhvVar;
        dsqw.cc(dkhv.class, dkhvVar);
    }

    private dkhv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0007ဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dkhv();
            }
            if (i2 == 4) {
                return new dkhu();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkhv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkhv.class) {
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
