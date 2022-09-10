package defpackage;
/* compiled from: PG */
/* renamed from: ddif  reason: default package */
/* loaded from: classes5.dex */
public final class ddif extends dsqw<ddif, ddie> implements dssk {
    public static final ddif b;
    private static volatile dssr<ddif> d;
    public int a;
    private int c;

    static {
        ddif ddifVar = new ddif();
        b = ddifVar;
        dsqw.cc(ddif.class, ddifVar);
    }

    private ddif() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dgbc.c()});
            }
            if (i2 == 3) {
                return new ddif();
            }
            if (i2 == 4) {
                return new ddie();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddif> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddif.class) {
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
