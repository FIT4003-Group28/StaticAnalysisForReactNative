package defpackage;
/* compiled from: PG */
/* renamed from: dgzr  reason: default package */
/* loaded from: classes6.dex */
public final class dgzr extends dsqw<dgzr, dgzq> implements dssk {
    public static final dgzr c;
    private static volatile dssr<dgzr> d;
    public dhaf a;
    public dsrj<dgzv> b = dssu.b;

    static {
        dgzr dgzrVar = new dgzr();
        c = dgzrVar;
        dsqw.cc(dgzr.class, dgzrVar);
    }

    private dgzr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0002\u001b", new Object[]{"a", "b", dgzv.class});
            }
            if (i2 == 3) {
                return new dgzr();
            }
            if (i2 == 4) {
                return new dgzq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgzr.class) {
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
