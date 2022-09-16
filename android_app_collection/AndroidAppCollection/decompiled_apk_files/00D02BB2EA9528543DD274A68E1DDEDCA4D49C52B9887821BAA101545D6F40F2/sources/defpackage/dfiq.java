package defpackage;
/* compiled from: PG */
/* renamed from: dfiq  reason: default package */
/* loaded from: classes6.dex */
public final class dfiq extends dsqw<dfiq, dfij> implements dssk {
    public static final dfiq f;
    private static volatile dssr<dfiq> g;
    public int a;
    public boolean b;
    public dfin c;
    public dfip d;
    public dfil e;

    static {
        dfiq dfiqVar = new dfiq();
        f = dfiqVar;
        dsqw.cc(dfiq.class, dfiqVar);
    }

    private dfiq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfiq();
            }
            if (i2 == 4) {
                return new dfij();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfiq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfiq.class) {
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
