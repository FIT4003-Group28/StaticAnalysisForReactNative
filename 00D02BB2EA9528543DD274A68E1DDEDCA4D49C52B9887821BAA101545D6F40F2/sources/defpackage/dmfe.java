package defpackage;
/* compiled from: PG */
/* renamed from: dmfe  reason: default package */
/* loaded from: classes6.dex */
public final class dmfe extends dsqw<dmfe, dmfd> implements dssk {
    public static final dmfe e;
    public static final dsqv<dmfu, dmfe> f;
    private static volatile dssr<dmfe> g;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        dmfe dmfeVar = new dmfe();
        e = dmfeVar;
        dsqw.cc(dmfe.class, dmfeVar);
        f = dsqw.newSingularGeneratedExtension(dmfu.e, dmfeVar, dmfeVar, null, 1006, dsur.MESSAGE, dmfe.class);
    }

    private dmfe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmfe();
            }
            if (i2 == 4) {
                return new dmfd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfe> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmfe.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
