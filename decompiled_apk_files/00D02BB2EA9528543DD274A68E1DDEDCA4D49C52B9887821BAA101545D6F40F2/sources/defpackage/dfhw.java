package defpackage;
/* compiled from: PG */
/* renamed from: dfhw  reason: default package */
/* loaded from: classes6.dex */
public final class dfhw extends dsqw<dfhw, dfhv> implements dssk {
    public static final dfhw a;
    private static volatile dssr<dfhw> b;

    static {
        dfhw dfhwVar = new dfhw();
        a = dfhwVar;
        dsqw.cc(dfhw.class, dfhwVar);
    }

    private dfhw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfhw();
            }
            if (i2 == 4) {
                return new dfhv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfhw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfhw.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
