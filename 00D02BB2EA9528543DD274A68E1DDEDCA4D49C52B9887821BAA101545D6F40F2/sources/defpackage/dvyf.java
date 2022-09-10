package defpackage;
/* compiled from: PG */
/* renamed from: dvyf  reason: default package */
/* loaded from: classes.dex */
public final class dvyf extends dsqw<dvyf, dvyc> implements dssk {
    public static final dsrg<Integer, dvye> b = new dvyb();
    public static final dvyf c;
    private static volatile dssr<dvyf> d;
    public dsrf a = dsqz.b;

    static {
        dvyf dvyfVar = new dvyf();
        c = dvyfVar;
        dsqw.cc(dvyf.class, dvyfVar);
    }

    private dvyf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", dvye.c()});
            }
            if (i2 == 3) {
                return new dvyf();
            }
            if (i2 == 4) {
                return new dvyc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvyf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvyf.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
