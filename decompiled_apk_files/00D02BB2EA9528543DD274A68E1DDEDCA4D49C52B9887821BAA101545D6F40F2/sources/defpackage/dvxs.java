package defpackage;
/* compiled from: PG */
/* renamed from: dvxs  reason: default package */
/* loaded from: classes6.dex */
public final class dvxs extends dsqw<dvxs, dvxr> implements dssk {
    public static final dvxs f;
    private static volatile dssr<dvxs> g;
    public int a;
    public int b;
    public int c;
    public int d = 2;
    public int e = 2;

    static {
        dvxs dvxsVar = new dvxs();
        f = dvxsVar;
        dsqw.cc(dvxs.class, dvxsVar);
    }

    private dvxs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dvxs();
            }
            if (i2 == 4) {
                return new dvxr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvxs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvxs.class) {
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
