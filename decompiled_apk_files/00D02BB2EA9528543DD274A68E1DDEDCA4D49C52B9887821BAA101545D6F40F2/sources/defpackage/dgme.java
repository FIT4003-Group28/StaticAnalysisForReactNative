package defpackage;
/* compiled from: PG */
/* renamed from: dgme  reason: default package */
/* loaded from: classes6.dex */
public final class dgme extends dsqw<dgme, dgmb> implements dssk {
    public static final dgme b;
    private static volatile dssr<dgme> d;
    public int a;
    private int c;

    static {
        dgme dgmeVar = new dgme();
        b = dgmeVar;
        dsqw.cc(dgme.class, dgmeVar);
    }

    private dgme() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dgmc.a});
            }
            if (i2 == 3) {
                return new dgme();
            }
            if (i2 == 4) {
                return new dgmb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgme> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgme.class) {
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
