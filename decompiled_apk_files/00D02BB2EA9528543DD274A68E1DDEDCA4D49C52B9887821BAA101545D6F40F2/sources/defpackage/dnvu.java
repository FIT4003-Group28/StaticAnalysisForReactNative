package defpackage;
/* compiled from: PG */
/* renamed from: dnvu  reason: default package */
/* loaded from: classes6.dex */
public final class dnvu extends dsqw<dnvu, dnvt> implements dssk {
    public static final dnvu f;
    private static volatile dssr<dnvu> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dnvu dnvuVar = new dnvu();
        f = dnvuVar;
        dsqw.cc(dnvu.class, dnvuVar);
    }

    private dnvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dnvu();
            }
            if (i2 == 4) {
                return new dnvt();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnvu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnvu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
