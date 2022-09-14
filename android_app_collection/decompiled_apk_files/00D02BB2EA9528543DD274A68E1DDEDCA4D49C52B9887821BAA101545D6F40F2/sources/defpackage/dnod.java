package defpackage;
/* compiled from: PG */
/* renamed from: dnod  reason: default package */
/* loaded from: classes.dex */
public final class dnod extends dsqw<dnod, dnoc> implements dssk {
    public static final dnod e;
    private static volatile dssr<dnod> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        dnod dnodVar = new dnod();
        e = dnodVar;
        dsqw.cc(dnod.class, dnodVar);
    }

    private dnod() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0001", new Object[]{"f", "a", "c", "d", "b"});
            }
            if (i2 == 3) {
                return new dnod();
            }
            if (i2 == 4) {
                return new dnoc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnod> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnod.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
