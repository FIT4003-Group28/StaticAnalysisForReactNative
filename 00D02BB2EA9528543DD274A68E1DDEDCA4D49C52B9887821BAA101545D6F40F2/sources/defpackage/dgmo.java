package defpackage;
/* compiled from: PG */
/* renamed from: dgmo  reason: default package */
/* loaded from: classes6.dex */
public final class dgmo extends dsqw<dgmo, dgml> implements dssk {
    public static final dgmo f;
    private static volatile dssr<dgmo> h;
    public dgmn b;
    public int d;
    public boolean e;
    private int g;
    public String a = "";
    public String c = "";

    static {
        dgmo dgmoVar = new dgmo();
        f = dgmoVar;
        dsqw.cc(dgmo.class, dgmoVar);
    }

    private dgmo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဇ\u0004", new Object[]{"g", "a", "b", "c", "d", dgmj.a, "e"});
            }
            if (i2 == 3) {
                return new dgmo();
            }
            if (i2 == 4) {
                return new dgml();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgmo> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dgmo.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
