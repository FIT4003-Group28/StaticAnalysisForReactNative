package defpackage;
/* compiled from: PG */
/* renamed from: dgyv  reason: default package */
/* loaded from: classes6.dex */
public final class dgyv extends dsqw<dgyv, dgyu> implements dssk {
    public static final dgyv f;
    private static volatile dssr<dgyv> g;
    public int a;
    public dgzd b;
    public dgzd c;
    public dgzf d;
    public dgzp e;

    static {
        dgyv dgyvVar = new dgyv();
        f = dgyvVar;
        dsqw.cc(dgyv.class, dgyvVar);
    }

    private dgyv() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "d", "e", "b", "c"});
            }
            if (i2 == 3) {
                return new dgyv();
            }
            if (i2 == 4) {
                return new dgyu();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgyv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgyv.class) {
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
