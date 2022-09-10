package defpackage;
/* compiled from: PG */
/* renamed from: djlu  reason: default package */
/* loaded from: classes6.dex */
public final class djlu extends dsqw<djlu, djlq> implements dssk {
    public static final djlu e;
    private static volatile dssr<djlu> f;
    public int a;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        djlu djluVar = new djlu();
        e = djluVar;
        dsqw.cc(djlu.class, djluVar);
    }

    private djlu() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ှ\u0000\u0003ဈ\u0003\u0004ဿ\u0000", new Object[]{"c", "b", "a", djls.class, "d", djlt.a});
            }
            if (i2 == 3) {
                return new djlu();
            }
            if (i2 == 4) {
                return new djlq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djlu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djlu.class) {
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
