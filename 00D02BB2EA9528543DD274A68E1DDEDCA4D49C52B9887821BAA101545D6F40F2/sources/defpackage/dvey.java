package defpackage;
/* compiled from: PG */
/* renamed from: dvey  reason: default package */
/* loaded from: classes.dex */
public final class dvey extends dsqw<dvey, dvex> implements dssk {
    public static final dvey b;
    private static volatile dssr<dvey> d;
    public boolean a;
    private int c;

    static {
        dvey dveyVar = new dvey();
        b = dveyVar;
        dsqw.cc(dvey.class, dveyVar);
    }

    private dvey() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဇ\u0005", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvey();
            }
            if (i2 == 4) {
                return new dvex();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvey> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvey.class) {
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
