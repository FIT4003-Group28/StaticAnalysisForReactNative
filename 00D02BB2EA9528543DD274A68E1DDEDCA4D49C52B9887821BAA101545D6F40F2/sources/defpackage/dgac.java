package defpackage;
/* compiled from: PG */
/* renamed from: dgac  reason: default package */
/* loaded from: classes6.dex */
public final class dgac extends dsqw<dgac, dfzz> implements dssk {
    public static final dgac c;
    private static volatile dssr<dgac> d;
    public int a;
    public int b;

    static {
        dgac dgacVar = new dgac();
        c = dgacVar;
        dsqw.cc(dgac.class, dgacVar);
    }

    private dgac() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dgab.c()});
            }
            if (i2 == 3) {
                return new dgac();
            }
            if (i2 == 4) {
                return new dfzz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgac> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgac.class) {
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
