package defpackage;
/* compiled from: PG */
/* renamed from: dnbl  reason: default package */
/* loaded from: classes.dex */
public final class dnbl extends dsqw<dnbl, dnbj> implements dssk {
    public static final dnbl c;
    private static volatile dssr<dnbl> d;
    public int a;
    public int b = 1;

    static {
        dnbl dnblVar = new dnbl();
        c = dnblVar;
        dsqw.cc(dnbl.class, dnblVar);
    }

    private dnbl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dnbk.a});
            }
            if (i2 == 3) {
                return new dnbl();
            }
            if (i2 == 4) {
                return new dnbj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnbl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnbl.class) {
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
