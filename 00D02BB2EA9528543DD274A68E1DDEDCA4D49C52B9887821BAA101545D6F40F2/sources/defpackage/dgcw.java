package defpackage;
/* compiled from: PG */
/* renamed from: dgcw  reason: default package */
/* loaded from: classes6.dex */
public final class dgcw extends dsqw<dgcw, dgcv> implements dssk {
    public static final dgcw c;
    private static volatile dssr<dgcw> d;
    public int a;
    public dgac b;

    static {
        dgcw dgcwVar = new dgcw();
        c = dgcwVar;
        dsqw.cc(dgcw.class, dgcwVar);
    }

    private dgcw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgcw();
            }
            if (i2 == 4) {
                return new dgcv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgcw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgcw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
