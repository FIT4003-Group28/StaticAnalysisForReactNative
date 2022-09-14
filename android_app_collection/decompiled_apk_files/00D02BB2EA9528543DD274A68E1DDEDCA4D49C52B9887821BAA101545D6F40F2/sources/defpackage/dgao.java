package defpackage;
/* compiled from: PG */
/* renamed from: dgao  reason: default package */
/* loaded from: classes6.dex */
public final class dgao extends dsqw<dgao, dgal> implements dssk {
    public static final dgao c;
    private static volatile dssr<dgao> d;
    public int a;
    public int b;

    static {
        dgao dgaoVar = new dgao();
        c = dgaoVar;
        dsqw.cc(dgao.class, dgaoVar);
    }

    private dgao() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dgan.c()});
            }
            if (i2 == 3) {
                return new dgao();
            }
            if (i2 == 4) {
                return new dgal();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgao> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgao.class) {
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
