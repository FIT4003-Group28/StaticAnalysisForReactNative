package defpackage;
/* compiled from: PG */
/* renamed from: doxy  reason: default package */
/* loaded from: classes6.dex */
public final class doxy extends dsqw<doxy, doxx> implements dssk {
    public static final doxy g;
    private static volatile dssr<doxy> h;
    public int a;
    public int b;
    public int c;
    public doxw d;
    public boolean e;
    public boolean f;

    static {
        doxy doxyVar = new doxy();
        g = doxyVar;
        dsqw.cc(doxy.class, doxyVar);
    }

    private doxy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0001\u0002ဉ\u0002\u0003ဇ\u0003\u0004င\u0000\u0005ဇ\u0004", new Object[]{"a", "c", "d", "e", "b", "f"});
            }
            if (i2 == 3) {
                return new doxy();
            }
            if (i2 == 4) {
                return new doxx();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doxy> dssrVar = h;
            if (dssrVar == null) {
                synchronized (doxy.class) {
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
