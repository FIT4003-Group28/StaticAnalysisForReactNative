package defpackage;
/* compiled from: PG */
/* renamed from: dmin  reason: default package */
/* loaded from: classes6.dex */
public final class dmin extends dsqw<dmin, dmhz> implements dssk {
    public static final dmin c;
    public static final dsqv<dmfs, dmin> d;
    private static volatile dssr<dmin> f;
    public dmhy a;
    public dmim b;
    private int e;

    static {
        dmin dminVar = new dmin();
        c = dminVar;
        dsqw.cc(dmin.class, dminVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dminVar, dminVar, null, 1000, dsur.MESSAGE, dmin.class);
    }

    private dmin() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\t\f\u0002\u0000\u0000\u0000\tဉ\b\fဉ\u000b", new Object[]{"e", "a", "b"});
            }
            if (i2 == 3) {
                return new dmin();
            }
            if (i2 == 4) {
                return new dmhz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmin> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmin.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
