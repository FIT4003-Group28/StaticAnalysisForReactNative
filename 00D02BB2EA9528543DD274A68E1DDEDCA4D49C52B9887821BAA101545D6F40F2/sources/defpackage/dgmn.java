package defpackage;
/* compiled from: PG */
/* renamed from: dgmn  reason: default package */
/* loaded from: classes6.dex */
public final class dgmn extends dsqw<dgmn, dgmm> implements dssk {
    public static final dgmn d;
    private static volatile dssr<dgmn> f;
    public String a = "";
    public String b = "";
    public String c = "";
    private int e;

    static {
        dgmn dgmnVar = new dgmn();
        d = dgmnVar;
        dsqw.cc(dgmn.class, dgmnVar);
    }

    private dgmn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgmn();
            }
            if (i2 == 4) {
                return new dgmm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgmn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgmn.class) {
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
