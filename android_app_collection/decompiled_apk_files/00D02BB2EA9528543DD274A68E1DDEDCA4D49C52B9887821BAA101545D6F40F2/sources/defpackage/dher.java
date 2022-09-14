package defpackage;
/* compiled from: PG */
/* renamed from: dher  reason: default package */
/* loaded from: classes6.dex */
public final class dher extends dsqw<dher, dheq> implements dssk {
    public static final dher g;
    private static volatile dssr<dher> h;
    public dhft a;
    public dhfb b;
    public dhfp c;
    public dhfg d;
    public dhdg e;
    public dhex f;

    static {
        dher dherVar = new dher();
        g = dherVar;
        dsqw.cc(dher.class, dherVar);
    }

    private dher() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0004\t\u0005\t\u0007\t\b\t", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dher();
            }
            if (i2 == 4) {
                return new dheq();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dher> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dher.class) {
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
