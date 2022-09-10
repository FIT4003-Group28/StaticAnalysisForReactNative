package defpackage;
/* compiled from: PG */
/* renamed from: dvro  reason: default package */
/* loaded from: classes6.dex */
public final class dvro extends dsqw<dvro, dvrj> implements dssk {
    public static final dvro f;
    private static volatile dssr<dvro> g;
    public int a;
    public int c;
    public int d;
    public String b = "";
    public dsrj<dvrn> e = dssu.b;

    static {
        dvro dvroVar = new dvro();
        f = dvroVar;
        dsqw.cc(dvro.class, dvroVar);
    }

    private dvro() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", dusg.a, "e", dvrn.class});
            }
            if (i2 == 3) {
                return new dvro();
            }
            if (i2 == 4) {
                return new dvrj();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvro> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvro.class) {
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
