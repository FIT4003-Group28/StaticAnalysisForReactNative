package defpackage;
/* compiled from: PG */
/* renamed from: dvra  reason: default package */
/* loaded from: classes6.dex */
public final class dvra extends dsqw<dvra, dvqz> implements dssk {
    public static final dvra f;
    private static volatile dssr<dvra> g;
    public int a;
    public Object c;
    public dgci d;
    public int b = 0;
    public String e = "";

    static {
        dvra dvraVar = new dvra();
        f = dvraVar;
        dsqw.cc(dvra.class, dvraVar);
    }

    private dvra() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဉ\u0005\u0007ဈ\u0006", new Object[]{"c", "b", "a", dvqy.class, dvrx.class, dvrv.class, dvro.class, dvri.class, "d", "e"});
            }
            if (i2 == 3) {
                return new dvra();
            }
            if (i2 == 4) {
                return new dvqz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvra> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvra.class) {
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
