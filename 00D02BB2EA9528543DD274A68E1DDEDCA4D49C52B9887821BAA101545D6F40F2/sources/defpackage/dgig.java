package defpackage;
/* compiled from: PG */
/* renamed from: dgig  reason: default package */
/* loaded from: classes6.dex */
public final class dgig extends dsqw<dgig, dgif> implements dssk {
    public static final dgig c;
    private static volatile dssr<dgig> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dgig dgigVar = new dgig();
        c = dgigVar;
        dsqw.cc(dgig.class, dgigVar);
    }

    private dgig() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dgig();
            }
            if (i2 == 4) {
                return new dgif();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgig> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgig.class) {
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
