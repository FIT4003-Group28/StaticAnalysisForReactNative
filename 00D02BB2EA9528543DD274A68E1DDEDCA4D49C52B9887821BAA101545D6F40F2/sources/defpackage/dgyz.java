package defpackage;
/* compiled from: PG */
/* renamed from: dgyz  reason: default package */
/* loaded from: classes6.dex */
public final class dgyz extends dsqw<dgyz, dgyy> implements dssk {
    public static final dgyz c;
    private static volatile dssr<dgyz> d;
    public int a;
    public String b = "";

    static {
        dgyz dgyzVar = new dgyz();
        c = dgyzVar;
        dsqw.cc(dgyz.class, dgyzVar);
    }

    private dgyz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgyz();
            }
            if (i2 == 4) {
                return new dgyy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgyz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgyz.class) {
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
