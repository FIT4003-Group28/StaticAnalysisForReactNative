package defpackage;
/* compiled from: PG */
/* renamed from: dfva  reason: default package */
/* loaded from: classes6.dex */
public final class dfva extends dsqw<dfva, dfuz> implements dssk {
    public static final dfva a;
    private static volatile dssr<dfva> b;

    static {
        dfva dfvaVar = new dfva();
        a = dfvaVar;
        dsqw.cc(dfva.class, dfvaVar);
    }

    private dfva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfva();
            }
            if (i2 == 4) {
                return new dfuz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfva> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfva.class) {
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
