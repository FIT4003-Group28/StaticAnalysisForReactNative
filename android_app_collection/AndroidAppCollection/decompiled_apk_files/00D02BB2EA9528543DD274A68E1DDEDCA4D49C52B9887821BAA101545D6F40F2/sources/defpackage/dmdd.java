package defpackage;
/* compiled from: PG */
/* renamed from: dmdd  reason: default package */
/* loaded from: classes6.dex */
public final class dmdd extends dsqw<dmdd, dmdc> implements dssk {
    public static final dmdd c;
    public static final dsqv<dmch, dmdd> d;
    private static volatile dssr<dmdd> e;
    public int a;
    public dqjj b;

    static {
        dmdd dmddVar = new dmdd();
        c = dmddVar;
        dsqw.cc(dmdd.class, dmddVar);
        d = dsqw.newSingularGeneratedExtension(dmch.d, dmddVar, dmddVar, null, 1014, dsur.MESSAGE, dmdd.class);
    }

    private dmdd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmdd();
            }
            if (i2 == 4) {
                return new dmdc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmdd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
