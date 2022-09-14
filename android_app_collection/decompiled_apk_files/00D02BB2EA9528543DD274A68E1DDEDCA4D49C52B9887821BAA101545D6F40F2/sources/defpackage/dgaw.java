package defpackage;
/* compiled from: PG */
/* renamed from: dgaw  reason: default package */
/* loaded from: classes6.dex */
public final class dgaw extends dsqw<dgaw, dgav> implements dssk {
    public static final dgaw g;
    private static volatile dssr<dgaw> h;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public int e;
    public long f;

    static {
        dgaw dgawVar = new dgaw();
        g = dgawVar;
        dsqw.cc(dgaw.class, dgawVar);
    }

    private dgaw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dgaw();
            }
            if (i2 == 4) {
                return new dgav();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgaw> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dgaw.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
