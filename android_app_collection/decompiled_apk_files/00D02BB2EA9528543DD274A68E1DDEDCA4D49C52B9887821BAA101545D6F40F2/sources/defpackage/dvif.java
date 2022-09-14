package defpackage;
/* compiled from: PG */
/* renamed from: dvif  reason: default package */
/* loaded from: classes.dex */
public final class dvif extends dsqw<dvif, dvic> implements dssk {
    public static final dvif f;
    private static volatile dssr<dvif> g;
    public int a;
    public dvie b;
    public int c;
    public int d;
    public int e;

    static {
        dvif dvifVar = new dvif();
        f = dvifVar;
        dsqw.cc(dvif.class, dvifVar);
    }

    private dvif() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dvif();
            }
            if (i2 == 4) {
                return new dvic();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvif> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvif.class) {
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
