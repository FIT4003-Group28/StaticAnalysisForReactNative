package defpackage;
/* compiled from: PG */
/* renamed from: dgcz  reason: default package */
/* loaded from: classes6.dex */
public final class dgcz extends dsqw<dgcz, dgcy> implements dssk {
    public static final dgcz c;
    private static volatile dssr<dgcz> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dgcz dgczVar = new dgcz();
        c = dgczVar;
        dsqw.cc(dgcz.class, dgczVar);
    }

    private dgcz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dgcz();
            }
            if (i2 == 4) {
                return new dgcy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgcz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgcz.class) {
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
