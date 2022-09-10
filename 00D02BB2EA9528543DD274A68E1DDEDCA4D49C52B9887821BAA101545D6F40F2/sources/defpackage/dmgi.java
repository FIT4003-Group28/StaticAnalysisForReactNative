package defpackage;
/* compiled from: PG */
/* renamed from: dmgi  reason: default package */
/* loaded from: classes6.dex */
public final class dmgi extends dsqw<dmgi, dmgh> implements dssk {
    public static final dmgi c;
    public static final dsqv<dmfs, dmgi> d;
    private static volatile dssr<dmgi> f;
    public drdg a;
    public boolean b;
    private int e;

    static {
        dmgi dmgiVar = new dmgi();
        c = dmgiVar;
        dsqw.cc(dmgi.class, dmgiVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dmgiVar, dmgiVar, null, 1009, dsur.MESSAGE, dmgi.class);
    }

    private dmgi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"e", "a", "b"});
            }
            if (i2 == 3) {
                return new dmgi();
            }
            if (i2 == 4) {
                return new dmgh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmgi.class) {
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
