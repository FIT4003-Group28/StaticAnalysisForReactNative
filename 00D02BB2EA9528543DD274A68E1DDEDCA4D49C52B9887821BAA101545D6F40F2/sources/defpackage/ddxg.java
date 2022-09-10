package defpackage;
/* compiled from: PG */
/* renamed from: ddxg  reason: default package */
/* loaded from: classes6.dex */
public final class ddxg extends dsqw<ddxg, ddxf> implements dssk {
    public static final ddxg f;
    private static volatile dssr<ddxg> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ddxg ddxgVar = new ddxg();
        f = ddxgVar;
        dsqw.cc(ddxg.class, ddxgVar);
    }

    private ddxg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddxg();
            }
            if (i2 == 4) {
                return new ddxf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddxg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddxg.class) {
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
