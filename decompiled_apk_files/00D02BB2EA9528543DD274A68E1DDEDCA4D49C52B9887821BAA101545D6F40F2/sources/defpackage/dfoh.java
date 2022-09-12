package defpackage;
/* compiled from: PG */
/* renamed from: dfoh  reason: default package */
/* loaded from: classes6.dex */
public final class dfoh extends dsqw<dfoh, dfog> implements dssk {
    public static final dfoh f;
    private static volatile dssr<dfoh> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        dfoh dfohVar = new dfoh();
        f = dfohVar;
        dsqw.cc(dfoh.class, dfohVar);
    }

    private dfoh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003င\u0000\u0004င\u0001\u0005င\u0002\u0006င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfoh();
            }
            if (i2 == 4) {
                return new dfog();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfoh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfoh.class) {
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
