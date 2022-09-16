package defpackage;
/* compiled from: PG */
/* renamed from: dfge  reason: default package */
/* loaded from: classes6.dex */
public final class dfge extends dsqw<dfge, dfgd> implements dssk {
    public static final dfge a;
    private static volatile dssr<dfge> b;

    static {
        dfge dfgeVar = new dfge();
        a = dfgeVar;
        dsqw.cc(dfge.class, dfgeVar);
    }

    private dfge() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfge();
            }
            if (i2 == 4) {
                return new dfgd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfge> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfge.class) {
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
