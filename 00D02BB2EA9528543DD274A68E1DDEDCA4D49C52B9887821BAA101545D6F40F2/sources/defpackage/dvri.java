package defpackage;
/* compiled from: PG */
/* renamed from: dvri  reason: default package */
/* loaded from: classes6.dex */
public final class dvri extends dsqw<dvri, dvrf> implements dssk {
    public static final dvri f;
    private static volatile dssr<dvri> g;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;

    static {
        dvri dvriVar = new dvri();
        f = dvriVar;
        dsqw.cc(dvri.class, dvriVar);
    }

    private dvri() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", dusg.a, "e", dvrh.c()});
            }
            if (i2 == 3) {
                return new dvri();
            }
            if (i2 == 4) {
                return new dvrf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvri> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvri.class) {
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
