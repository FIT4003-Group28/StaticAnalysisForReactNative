package defpackage;
/* compiled from: PG */
/* renamed from: dgim  reason: default package */
/* loaded from: classes6.dex */
public final class dgim extends dsqw<dgim, dgil> implements dssk {
    public static final dgim c;
    private static volatile dssr<dgim> e;
    public String a = "";
    public dgis b;
    private int d;

    static {
        dgim dgimVar = new dgim();
        c = dgimVar;
        dsqw.cc(dgim.class, dgimVar);
    }

    private dgim() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဉ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dgim();
            }
            if (i2 == 4) {
                return new dgil();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgim> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgim.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
