package defpackage;
/* compiled from: PG */
/* renamed from: aviv  reason: default package */
/* loaded from: classes3.dex */
public final class aviv extends dsqw<aviv, avis> implements dssk {
    public static final aviv c;
    public static final dsqv<dtro, aviv> d;
    private static volatile dssr<aviv> e;
    public int a;
    public int b;

    static {
        aviv avivVar = new aviv();
        c = avivVar;
        dsqw.cc(aviv.class, avivVar);
        d = dsqw.newSingularGeneratedExtension(dtro.a, avivVar, avivVar, null, 265798317, dsur.MESSAGE, aviv.class);
    }

    private aviv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", avit.a});
            }
            if (i2 == 3) {
                return new aviv();
            }
            if (i2 == 4) {
                return new avis();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aviv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (aviv.class) {
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
