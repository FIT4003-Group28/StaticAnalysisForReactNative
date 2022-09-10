package defpackage;
/* compiled from: PG */
/* renamed from: djvs  reason: default package */
/* loaded from: classes6.dex */
public final class djvs extends dsqw<djvs, djvp> implements dssk {
    public static final djvs g;
    private static volatile dssr<djvs> h;
    public int a;
    public dspd b = dspd.b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        djvs djvsVar = new djvs();
        g = djvsVar;
        dsqw.cc(djvs.class, djvsVar);
    }

    private djvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0006င\u0005", new Object[]{"a", "b", "c", djvr.c(), "d", "e", "f"});
            }
            if (i2 == 3) {
                return new djvs();
            }
            if (i2 == 4) {
                return new djvp();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djvs> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djvs.class) {
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
