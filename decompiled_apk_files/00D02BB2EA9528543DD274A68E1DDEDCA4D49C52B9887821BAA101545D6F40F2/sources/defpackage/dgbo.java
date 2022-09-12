package defpackage;
/* compiled from: PG */
/* renamed from: dgbo  reason: default package */
/* loaded from: classes6.dex */
public final class dgbo extends dsqw<dgbo, dgbl> implements dssk {
    public static final dgbo e;
    private static volatile dssr<dgbo> f;
    public int a;
    public String b = "";
    public String c = "";
    public int d;

    static {
        dgbo dgboVar = new dgbo();
        e = dgboVar;
        dsqw.cc(dgbo.class, dgboVar);
    }

    private dgbo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0004ဈ\u0000\u0007ဌ\u0003", new Object[]{"a", "c", "b", "d", dgbm.a});
            }
            if (i2 == 3) {
                return new dgbo();
            }
            if (i2 == 4) {
                return new dgbl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgbo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgbo.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
