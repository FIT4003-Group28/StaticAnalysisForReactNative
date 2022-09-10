package defpackage;
/* compiled from: PG */
/* renamed from: dfso  reason: default package */
/* loaded from: classes6.dex */
public final class dfso extends dsqw<dfso, dfsn> implements dssk {
    public static final dfso f;
    private static volatile dssr<dfso> g;
    public int a;
    public double b;
    public double c;
    public double d = 1.0d;
    public double e = 1.0d;

    static {
        dfso dfsoVar = new dfso();
        f = dfsoVar;
        dsqw.cc(dfso.class, dfsoVar);
    }

    private dfso() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfso();
            }
            if (i2 == 4) {
                return new dfsn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfso> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfso.class) {
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
