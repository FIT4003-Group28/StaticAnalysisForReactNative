package defpackage;
/* compiled from: PG */
/* renamed from: dfnn  reason: default package */
/* loaded from: classes6.dex */
public final class dfnn extends dsqw<dfnn, dfnm> implements dssk {
    public static final dfnn a;
    private static volatile dssr<dfnn> b;

    static {
        dfnn dfnnVar = new dfnn();
        a = dfnnVar;
        dsqw.cc(dfnn.class, dfnnVar);
    }

    private dfnn() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfnn();
            }
            if (i2 == 4) {
                return new dfnm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfnn> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfnn.class) {
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
