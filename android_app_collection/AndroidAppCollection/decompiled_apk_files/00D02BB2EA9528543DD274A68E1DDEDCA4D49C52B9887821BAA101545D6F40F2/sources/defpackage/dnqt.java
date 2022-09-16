package defpackage;
/* compiled from: PG */
/* renamed from: dnqt  reason: default package */
/* loaded from: classes6.dex */
public final class dnqt extends dsqw<dnqt, dnqs> implements dssk {
    public static final dnqt g;
    private static volatile dssr<dnqt> h;
    public int a;
    public dnhz b;
    public dnhz c;
    public dniu d;
    public dniu e;
    public String f = "";

    static {
        dnqt dnqtVar = new dnqt();
        g = dnqtVar;
        dsqw.cc(dnqt.class, dnqtVar);
    }

    private dnqt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dnqt();
            }
            if (i2 == 4) {
                return new dnqs();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnqt> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnqt.class) {
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
