package defpackage;
/* compiled from: PG */
/* renamed from: dnkn  reason: default package */
/* loaded from: classes6.dex */
public final class dnkn extends dsqw<dnkn, dnkj> implements dssk {
    public static final dnkn g;
    private static volatile dssr<dnkn> h;
    public int a;
    public Object c;
    public dnli e;
    public dnli f;
    public int b = 0;
    public String d = "";

    static {
        dnkn dnknVar = new dnkn();
        g = dnknVar;
        dsqw.cc(dnkn.class, dnknVar);
    }

    private dnkn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ဉ\u0003\u0004ဉ\u0004\u0005ြ\u0000", new Object[]{"c", "b", "a", "d", dnki.class, "e", "f", dnkl.class});
            }
            if (i2 == 3) {
                return new dnkn();
            }
            if (i2 == 4) {
                return new dnkj();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnkn> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnkn.class) {
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
