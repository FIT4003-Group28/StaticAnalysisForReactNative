package defpackage;
/* compiled from: PG */
/* renamed from: dgku  reason: default package */
/* loaded from: classes6.dex */
public final class dgku extends dsqw<dgku, dgkt> implements dssk {
    public static final dgku c;
    private static volatile dssr<dgku> d;
    public int a;
    public String b = "";

    static {
        dgku dgkuVar = new dgku();
        c = dgkuVar;
        dsqw.cc(dgku.class, dgkuVar);
    }

    private dgku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgku();
            }
            if (i2 == 4) {
                return new dgkt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgku> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgku.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
