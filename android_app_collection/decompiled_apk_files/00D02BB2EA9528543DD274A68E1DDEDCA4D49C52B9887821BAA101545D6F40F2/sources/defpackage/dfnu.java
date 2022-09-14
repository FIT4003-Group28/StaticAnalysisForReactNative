package defpackage;
/* compiled from: PG */
/* renamed from: dfnu  reason: default package */
/* loaded from: classes6.dex */
public final class dfnu extends dsqw<dfnu, dfnt> implements dssk {
    public static final dfnu a;
    private static volatile dssr<dfnu> b;

    static {
        dfnu dfnuVar = new dfnu();
        a = dfnuVar;
        dsqw.cc(dfnu.class, dfnuVar);
    }

    private dfnu() {
        dspd dspdVar = dspd.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfnu();
            }
            if (i2 == 4) {
                return new dfnt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfnu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfnu.class) {
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
