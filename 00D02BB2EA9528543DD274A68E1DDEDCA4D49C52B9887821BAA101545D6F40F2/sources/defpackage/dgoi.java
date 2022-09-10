package defpackage;
/* compiled from: PG */
/* renamed from: dgoi  reason: default package */
/* loaded from: classes6.dex */
public final class dgoi extends dsqw<dgoi, dgoh> implements dssk {
    public static final dgoi d;
    private static volatile dssr<dgoi> f;
    public String a = "";
    public int b;
    public dnqe c;
    private int e;

    static {
        dgoi dgoiVar = new dgoi();
        d = dgoiVar;
        dsqw.cc(dgoi.class, dgoiVar);
    }

    private dgoi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", dobi.a, "c"});
            }
            if (i2 == 3) {
                return new dgoi();
            }
            if (i2 == 4) {
                return new dgoh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgoi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgoi.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
