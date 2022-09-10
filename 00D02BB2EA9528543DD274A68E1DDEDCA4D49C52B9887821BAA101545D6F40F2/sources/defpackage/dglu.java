package defpackage;
/* compiled from: PG */
/* renamed from: dglu  reason: default package */
/* loaded from: classes6.dex */
public final class dglu extends dsqw<dglu, dglt> implements dssk {
    public static final dglu e;
    private static volatile dssr<dglu> f;
    public int a;
    public int b = 0;
    public Object c;
    public int d;

    static {
        dglu dgluVar = new dglu();
        e = dgluVar;
        dsqw.cc(dglu.class, dgluVar);
    }

    private dglu() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"c", "b", "a", "d", dglv.a, dgkw.class, dgla.class, dglm.class});
            }
            if (i2 == 3) {
                return new dglu();
            }
            if (i2 == 4) {
                return new dglt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dglu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dglu.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
