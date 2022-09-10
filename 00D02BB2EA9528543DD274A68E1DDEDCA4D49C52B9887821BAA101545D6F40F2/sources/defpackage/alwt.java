package defpackage;
/* compiled from: PG */
/* renamed from: alwt  reason: default package */
/* loaded from: classes.dex */
public final class alwt extends dsqw<alwt, alws> implements dssk {
    public static final alwt g;
    private static volatile dssr<alwt> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;

    static {
        alwt alwtVar = new alwt();
        g = alwtVar;
        dsqw.cc(alwt.class, alwtVar);
    }

    private alwt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new alwt();
            }
            if (i2 == 4) {
                return new alws();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<alwt> dssrVar = h;
            if (dssrVar == null) {
                synchronized (alwt.class) {
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
