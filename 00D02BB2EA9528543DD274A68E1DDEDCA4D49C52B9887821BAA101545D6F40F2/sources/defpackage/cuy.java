package defpackage;
/* compiled from: PG */
/* renamed from: cuy  reason: default package */
/* loaded from: classes5.dex */
public final class cuy extends dsqw<cuy, cux> implements dssk {
    public static final cuy f;
    private static volatile dssr<cuy> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        cuy cuyVar = new cuy();
        f = cuyVar;
        dsqw.cc(cuy.class, cuyVar);
    }

    private cuy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0007\u0004\u0000\u0000\u0000\u0002င\u0001\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new cuy();
            }
            if (i2 == 4) {
                return new cux();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cuy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cuy.class) {
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
