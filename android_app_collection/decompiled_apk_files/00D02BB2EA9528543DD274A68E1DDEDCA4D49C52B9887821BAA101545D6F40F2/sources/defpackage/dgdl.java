package defpackage;
/* compiled from: PG */
/* renamed from: dgdl  reason: default package */
/* loaded from: classes6.dex */
public final class dgdl extends dsqw<dgdl, dgdk> implements dssk {
    public static final dgdl b;
    private static volatile dssr<dgdl> d;
    public boolean a;
    private int c;

    static {
        dgdl dgdlVar = new dgdl();
        b = dgdlVar;
        dsqw.cc(dgdl.class, dgdlVar);
    }

    private dgdl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dgdl();
            }
            if (i2 == 4) {
                return new dgdk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgdl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgdl.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
