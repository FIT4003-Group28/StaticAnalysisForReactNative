package defpackage;
/* compiled from: PG */
/* renamed from: eaba  reason: default package */
/* loaded from: classes.dex */
public final class eaba extends dsqw<eaba, eaay> implements dssk {
    public static final eaba g;
    private static volatile dssr<eaba> h;
    public int a;
    public int d;
    public long e;
    public String b = "";
    public String c = "";
    public String f = "";

    static {
        eaba eabaVar = new eaba();
        g = eabaVar;
        dsqw.cc(eaba.class, eabaVar);
    }

    private eaba() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", eaaz.a, "e", "f"});
            }
            if (i2 == 3) {
                return new eaba();
            }
            if (i2 == 4) {
                return new eaay();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaba> dssrVar = h;
            if (dssrVar == null) {
                synchronized (eaba.class) {
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
