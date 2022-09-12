package defpackage;
/* compiled from: PG */
/* renamed from: dgck  reason: default package */
/* loaded from: classes6.dex */
public final class dgck extends dsqw<dgck, dgcj> implements dssk {
    public static final dgck b;
    private static volatile dssr<dgck> d;
    public int a;
    private int c;

    static {
        dgck dgckVar = new dgck();
        b = dgckVar;
        dsqw.cc(dgck.class, dgckVar);
    }

    private dgck() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dgcq.c()});
            }
            if (i2 == 3) {
                return new dgck();
            }
            if (i2 == 4) {
                return new dgcj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgck> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgck.class) {
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
