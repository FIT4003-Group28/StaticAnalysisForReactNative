package defpackage;
/* compiled from: PG */
/* renamed from: dgak  reason: default package */
/* loaded from: classes6.dex */
public final class dgak extends dsqw<dgak, dgad> implements dssk {
    public static final dgak f;
    private static volatile dssr<dgak> g;
    public int a;
    public int b;
    public int c;
    public dgao d;
    public int e;

    static {
        dgak dgakVar = new dgak();
        f = dgakVar;
        dsqw.cc(dgak.class, dgakVar);
    }

    private dgak() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", dgaj.c(), "c", dgaf.c(), "d", "e", dgah.c()});
            }
            if (i2 == 3) {
                return new dgak();
            }
            if (i2 == 4) {
                return new dgad();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgak> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgak.class) {
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
