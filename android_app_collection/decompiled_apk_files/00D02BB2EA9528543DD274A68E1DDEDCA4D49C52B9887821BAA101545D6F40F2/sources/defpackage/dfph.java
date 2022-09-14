package defpackage;
/* compiled from: PG */
/* renamed from: dfph  reason: default package */
/* loaded from: classes6.dex */
public final class dfph extends dsqw<dfph, dfpg> implements dssk {
    public static final dfph f;
    private static volatile dssr<dfph> g;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        dfph dfphVar = new dfph();
        f = dfphVar;
        dsqw.cc(dfph.class, dfphVar);
    }

    private dfph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfph();
            }
            if (i2 == 4) {
                return new dfpg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfph> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfph.class) {
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
