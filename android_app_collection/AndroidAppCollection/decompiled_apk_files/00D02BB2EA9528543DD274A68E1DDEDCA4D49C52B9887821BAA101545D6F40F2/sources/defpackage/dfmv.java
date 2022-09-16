package defpackage;
/* compiled from: PG */
/* renamed from: dfmv  reason: default package */
/* loaded from: classes6.dex */
public final class dfmv extends dsqw<dfmv, dfmu> implements dssk {
    public static final dfmv a;
    private static volatile dssr<dfmv> b;

    static {
        dfmv dfmvVar = new dfmv();
        a = dfmvVar;
        dsqw.cc(dfmv.class, dfmvVar);
    }

    private dfmv() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dfmv();
            }
            if (i2 == 4) {
                return new dfmu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfmv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfmv.class) {
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
