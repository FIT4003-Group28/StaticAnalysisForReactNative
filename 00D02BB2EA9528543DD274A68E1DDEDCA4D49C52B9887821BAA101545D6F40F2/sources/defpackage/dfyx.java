package defpackage;
/* compiled from: PG */
/* renamed from: dfyx  reason: default package */
/* loaded from: classes6.dex */
public final class dfyx extends dsqw<dfyx, dfys> implements dssk {
    public static final dfyx e;
    private static volatile dssr<dfyx> g;
    public int a;
    public int b;
    public String c = "";
    public dsrj<dfyr> d = dssu.b;
    private int f;

    static {
        dfyx dfyxVar = new dfyx();
        e = dfyxVar;
        dsqw.cc(dfyx.class, dfyxVar);
    }

    private dfyx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"f", "a", dfyv.a, "b", dfyt.a, "c", "d", dfyr.class});
            }
            if (i2 == 3) {
                return new dfyx();
            }
            if (i2 == 4) {
                return new dfys();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfyx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfyx.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
