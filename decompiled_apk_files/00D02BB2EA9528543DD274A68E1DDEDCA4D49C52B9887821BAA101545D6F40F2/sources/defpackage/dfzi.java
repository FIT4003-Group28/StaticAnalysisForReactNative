package defpackage;
/* compiled from: PG */
/* renamed from: dfzi  reason: default package */
/* loaded from: classes6.dex */
public final class dfzi extends dsqw<dfzi, dfzh> implements dssk {
    public static final dfzi f;
    private static volatile dssr<dfzi> g;
    public int a;
    public dgly b;
    public dgaq c;
    public dfzp d;
    public String e = "";

    static {
        dfzi dfziVar = new dfzi();
        f = dfziVar;
        dsqw.cc(dfzi.class, dfziVar);
    }

    private dfzi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfzi();
            }
            if (i2 == 4) {
                return new dfzh();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfzi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfzi.class) {
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
