package defpackage;
/* compiled from: PG */
/* renamed from: dgda  reason: default package */
/* loaded from: classes6.dex */
public final class dgda extends dsqw<dgda, dgcx> implements dssk {
    public static final dgda c;
    private static volatile dssr<dgda> e;
    public dgbo a;
    public dgcz b;
    private int d;

    static {
        dgda dgdaVar = new dgda();
        c = dgdaVar;
        dsqw.cc(dgda.class, dgdaVar);
    }

    private dgda() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dgda();
            }
            if (i2 == 4) {
                return new dgcx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgda> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgda.class) {
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
