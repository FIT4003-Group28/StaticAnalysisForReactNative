package defpackage;
/* compiled from: PG */
/* renamed from: ddxv  reason: default package */
/* loaded from: classes.dex */
public final class ddxv extends dsqw<ddxv, ddxt> implements dssk {
    public static final ddxv g;
    private static volatile dssr<ddxv> h;
    public int a;
    public long b;
    public float c;
    public int d;
    public int e;
    public int f;

    static {
        ddxv ddxvVar = new ddxv();
        g = ddxvVar;
        dsqw.cc(ddxv.class, ddxvVar);
    }

    private ddxv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001\u0003င\u0002\u0004င\u0003\bဌ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", ddxu.a});
            }
            if (i2 == 3) {
                return new ddxv();
            }
            if (i2 == 4) {
                return new ddxt();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddxv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddxv.class) {
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
