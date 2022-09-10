package defpackage;
/* compiled from: PG */
/* renamed from: dmfm  reason: default package */
/* loaded from: classes6.dex */
public final class dmfm extends dsqw<dmfm, dmfl> implements dssk {
    public static final dmfm f;
    public static final dsqv<dmfu, dmfm> g;
    private static volatile dssr<dmfm> h;
    public int a;
    public double b;
    public double c;
    public double d;
    public double e;

    static {
        dmfm dmfmVar = new dmfm();
        f = dmfmVar;
        dsqw.cc(dmfm.class, dmfmVar);
        g = dsqw.newSingularGeneratedExtension(dmfu.e, dmfmVar, dmfmVar, null, 1001, dsur.MESSAGE, dmfm.class);
    }

    private dmfm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dmfm();
            }
            if (i2 == 4) {
                return new dmfl();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfm> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmfm.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
