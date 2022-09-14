package defpackage;
/* compiled from: PG */
/* renamed from: dmfw  reason: default package */
/* loaded from: classes6.dex */
public final class dmfw extends dsqw<dmfw, dmfv> implements dssk {
    public static final dmfw c;
    public static final dsqv<dmfs, dmfw> d;
    private static volatile dssr<dmfw> f;
    public dnwb a;
    public dnwb b;
    private int e;

    static {
        dmfw dmfwVar = new dmfw();
        c = dmfwVar;
        dsqw.cc(dmfw.class, dmfwVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dmfwVar, dmfwVar, null, 1006, dsur.MESSAGE, dmfw.class);
    }

    private dmfw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "a", "b"});
            }
            if (i2 == 3) {
                return new dmfw();
            }
            if (i2 == 4) {
                return new dmfv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmfw.class) {
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
