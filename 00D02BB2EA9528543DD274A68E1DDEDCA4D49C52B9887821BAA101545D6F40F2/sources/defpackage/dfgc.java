package defpackage;
/* compiled from: PG */
/* renamed from: dfgc  reason: default package */
/* loaded from: classes6.dex */
public final class dfgc extends dsqw<dfgc, dfgb> implements dssk {
    public static final dfgc a;
    private static volatile dssr<dfgc> b;

    static {
        dfgc dfgcVar = new dfgc();
        a = dfgcVar;
        dsqw.cc(dfgc.class, dfgcVar);
    }

    private dfgc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfgc();
            }
            if (i2 == 4) {
                return new dfgb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfgc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfgc.class) {
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
