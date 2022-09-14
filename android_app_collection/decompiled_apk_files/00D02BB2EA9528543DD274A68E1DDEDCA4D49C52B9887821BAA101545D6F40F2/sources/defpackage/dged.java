package defpackage;
/* compiled from: PG */
/* renamed from: dged  reason: default package */
/* loaded from: classes6.dex */
public final class dged extends dsqw<dged, dgdo> implements dssk {
    public static final dged d;
    private static volatile dssr<dged> f;
    public int a;
    public dgec b;
    public dgdn c;
    private int e;

    static {
        dged dgedVar = new dged();
        d = dgedVar;
        dsqw.cc(dged.class, dgedVar);
    }

    private dged() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", dgef.c(), "b", "c"});
            }
            if (i2 == 3) {
                return new dged();
            }
            if (i2 == 4) {
                return new dgdo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dged> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dged.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
