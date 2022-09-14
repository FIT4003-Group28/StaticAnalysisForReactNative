package defpackage;
/* compiled from: PG */
/* renamed from: deap  reason: default package */
/* loaded from: classes.dex */
public final class deap extends dsqw<deap, deao> implements dssk {
    public static final deap d;
    private static volatile dssr<deap> e;
    public int a;
    public dsrf b = dsqz.b;
    public int c;

    static {
        deap deapVar = new deap();
        d = deapVar;
        dsqw.cc(deap.class, deapVar);
    }

    private deap() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002င\u0000", new Object[]{"a", "b", dpkj.c(), "c"});
            }
            if (i2 == 3) {
                return new deap();
            }
            if (i2 == 4) {
                return new deao();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<deap> dssrVar = e;
            if (dssrVar == null) {
                synchronized (deap.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
