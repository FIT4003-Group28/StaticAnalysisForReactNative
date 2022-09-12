package defpackage;
/* compiled from: PG */
/* renamed from: dmeu  reason: default package */
/* loaded from: classes6.dex */
public final class dmeu extends dsqw<dmeu, dmet> implements dssk {
    public static final dmeu c;
    public static final dsqv<dmfu, dmeu> d;
    private static volatile dssr<dmeu> e;
    public int a;
    public int b;

    static {
        dmeu dmeuVar = new dmeu();
        c = dmeuVar;
        dsqw.cc(dmeu.class, dmeuVar);
        d = dsqw.newSingularGeneratedExtension(dmfu.e, dmeuVar, dmeuVar, null, 1005, dsur.MESSAGE, dmeu.class);
    }

    private dmeu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dowa.c()});
            }
            if (i2 == 3) {
                return new dmeu();
            }
            if (i2 == 4) {
                return new dmet();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmeu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmeu.class) {
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
