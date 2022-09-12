package defpackage;
/* compiled from: PG */
/* renamed from: dkir  reason: default package */
/* loaded from: classes6.dex */
public final class dkir extends dsqw<dkir, dkio> implements dssk {
    public static final dkir b;
    private static volatile dssr<dkir> d;
    public int a;
    private int c;

    static {
        dkir dkirVar = new dkir();
        b = dkirVar;
        dsqw.cc(dkir.class, dkirVar);
    }

    private dkir() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dkiq.c()});
            }
            if (i2 == 3) {
                return new dkir();
            }
            if (i2 == 4) {
                return new dkio();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkir> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkir.class) {
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
