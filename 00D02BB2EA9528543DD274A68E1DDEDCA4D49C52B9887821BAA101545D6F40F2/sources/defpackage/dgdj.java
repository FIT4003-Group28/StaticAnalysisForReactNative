package defpackage;
/* compiled from: PG */
/* renamed from: dgdj  reason: default package */
/* loaded from: classes6.dex */
public final class dgdj extends dsqw<dgdj, dgdh> implements dssk {
    public static final dgdj c;
    private static volatile dssr<dgdj> d;
    public int a;
    public int b;

    static {
        dgdj dgdjVar = new dgdj();
        c = dgdjVar;
        dsqw.cc(dgdj.class, dgdjVar);
    }

    private dgdj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dgdi.a});
            }
            if (i2 == 3) {
                return new dgdj();
            }
            if (i2 == 4) {
                return new dgdh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgdj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgdj.class) {
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
