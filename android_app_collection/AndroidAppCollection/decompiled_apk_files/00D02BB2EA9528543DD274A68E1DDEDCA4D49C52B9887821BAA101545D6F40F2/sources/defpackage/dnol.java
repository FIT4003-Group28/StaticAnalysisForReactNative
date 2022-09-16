package defpackage;
/* compiled from: PG */
/* renamed from: dnol  reason: default package */
/* loaded from: classes6.dex */
public final class dnol extends dsqw<dnol, dnok> implements dssk {
    public static final dnol g;
    private static volatile dssr<dnol> h;
    public int a;
    public dhjz b;
    public long c;
    public int d;
    public String e = "";
    public int f;

    static {
        dnol dnolVar = new dnol();
        g = dnolVar;
        dsqw.cc(dnol.class, dnolVar);
    }

    private dnol() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဂ\u0002\u0004င\u0003\u0005ဈ\u0004\bင\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dnol();
            }
            if (i2 == 4) {
                return new dnok();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnol> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnol.class) {
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
