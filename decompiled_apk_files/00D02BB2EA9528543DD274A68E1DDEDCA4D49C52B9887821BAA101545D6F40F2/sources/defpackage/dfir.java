package defpackage;
/* compiled from: PG */
/* renamed from: dfir  reason: default package */
/* loaded from: classes6.dex */
public final class dfir extends dsqw<dfir, dfia> implements dssk {
    public static final dfir f;
    private static volatile dssr<dfir> g;
    public int a;
    public dfie b;
    public dfic c;
    public dfiq d;
    public dfii e;

    static {
        dfir dfirVar = new dfir();
        f = dfirVar;
        dsqw.cc(dfir.class, dfirVar);
    }

    private dfir() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\b\u0004\u0000\u0000\u0000\u0002ဉ\u0001\u0005ဉ\u0004\u0006ဉ\u0005\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfir();
            }
            if (i2 == 4) {
                return new dfia();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfir> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfir.class) {
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
