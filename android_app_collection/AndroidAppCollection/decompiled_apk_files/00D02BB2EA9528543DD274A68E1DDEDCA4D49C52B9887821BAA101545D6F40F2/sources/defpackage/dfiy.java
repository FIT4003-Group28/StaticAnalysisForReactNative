package defpackage;
/* compiled from: PG */
/* renamed from: dfiy  reason: default package */
/* loaded from: classes6.dex */
public final class dfiy extends dsqw<dfiy, dfiv> implements dssk {
    public static final dfiy b;
    private static volatile dssr<dfiy> d;
    public int a;
    private int c;

    static {
        dfiy dfiyVar = new dfiy();
        b = dfiyVar;
        dsqw.cc(dfiy.class, dfiyVar);
    }

    private dfiy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dfiw.a});
            }
            if (i2 == 3) {
                return new dfiy();
            }
            if (i2 == 4) {
                return new dfiv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfiy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfiy.class) {
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
