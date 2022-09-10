package defpackage;
/* compiled from: PG */
/* renamed from: dfeb  reason: default package */
/* loaded from: classes6.dex */
public final class dfeb extends dsqw<dfeb, dfea> implements dssk {
    public static final dfeb c;
    private static volatile dssr<dfeb> d;
    public int a = 0;
    public Object b;

    static {
        dfeb dfebVar = new dfeb();
        c = dfebVar;
        dsqw.cc(dfeb.class, dfebVar);
    }

    private dfeb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002့\u0000\u0003်\u0000", new Object[]{"b", "a"});
            }
            if (i2 == 3) {
                return new dfeb();
            }
            if (i2 == 4) {
                return new dfea();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfeb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfeb.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
