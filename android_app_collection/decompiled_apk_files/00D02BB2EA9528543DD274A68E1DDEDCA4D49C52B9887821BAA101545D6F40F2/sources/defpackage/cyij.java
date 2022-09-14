package defpackage;
/* compiled from: PG */
/* renamed from: cyij  reason: default package */
/* loaded from: classes5.dex */
public final class cyij extends dsqw<cyij, cyii> implements dssk {
    public static final cyij f;
    private static volatile dssr<cyij> g;
    public boolean a;
    public boolean b;
    public boolean c;
    public double d;
    public double e;

    static {
        cyij cyijVar = new cyij();
        f = cyijVar;
        dsqw.cc(cyij.class, cyijVar);
    }

    private cyij() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0000\u0005\u0000", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new cyij();
            }
            if (i2 == 4) {
                return new cyii();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyij> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cyij.class) {
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
