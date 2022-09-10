package defpackage;
/* compiled from: PG */
/* renamed from: dgkw  reason: default package */
/* loaded from: classes6.dex */
public final class dgkw extends dsqw<dgkw, dgkv> implements dssk {
    public static final dgkw f;
    private static volatile dssr<dgkw> g;
    public int a;
    public boolean b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dgkw dgkwVar = new dgkw();
        f = dgkwVar;
        dsqw.cc(dgkw.class, dgkwVar);
    }

    private dgkw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgkw();
            }
            if (i2 == 4) {
                return new dgkv();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgkw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgkw.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
