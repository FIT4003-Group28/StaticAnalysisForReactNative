package defpackage;
/* compiled from: PG */
/* renamed from: dpvi  reason: default package */
/* loaded from: classes6.dex */
public final class dpvi extends dsqw<dpvi, dpvh> implements dssk {
    public static final dpvi g;
    private static volatile dssr<dpvi> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        dpvi dpviVar = new dpvi();
        g = dpviVar;
        dsqw.cc(dpvi.class, dpviVar);
    }

    private dpvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dpvi();
            }
            if (i2 == 4) {
                return new dpvh();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpvi> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dpvi.class) {
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