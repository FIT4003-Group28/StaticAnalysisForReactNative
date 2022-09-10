package defpackage;
/* compiled from: PG */
/* renamed from: douz  reason: default package */
/* loaded from: classes6.dex */
public final class douz extends dsqw<douz, dous> implements dssk {
    public static final douz g;
    private static volatile dssr<douz> h;
    public int a;
    public boolean c;
    public boolean e;
    public dsrj<douy> b = dssu.b;
    public dsrj<douu> d = dssu.b;
    public dsrj<douw> f = dssu.b;

    static {
        douz douzVar = new douz();
        g = douzVar;
        dsqw.cc(douz.class, douzVar);
    }

    private douz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001\u001b\u0002ဇ\u0000\u0003\u001b\u0004ဇ\u0001\u0006\u001b", new Object[]{"a", "b", douy.class, "c", "d", douu.class, "e", "f", douw.class});
            }
            if (i2 == 3) {
                return new douz();
            }
            if (i2 == 4) {
                return new dous();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<douz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (douz.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
