package defpackage;
/* compiled from: PG */
/* renamed from: dfku  reason: default package */
/* loaded from: classes6.dex */
public final class dfku extends dsqw<dfku, dfkt> implements dssk {
    public static final dfku f;
    private static volatile dssr<dfku> g;
    public int a;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;

    static {
        dfku dfkuVar = new dfku();
        f = dfkuVar;
        dsqw.cc(dfku.class, dfkuVar);
    }

    private dfku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfku();
            }
            if (i2 == 4) {
                return new dfkt();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfku> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfku.class) {
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
