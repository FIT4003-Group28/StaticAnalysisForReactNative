package defpackage;
/* compiled from: PG */
/* renamed from: dfnw  reason: default package */
/* loaded from: classes6.dex */
public final class dfnw extends dsqw<dfnw, dfnv> implements dssk {
    public static final dfnw a;
    private static volatile dssr<dfnw> b;

    static {
        dfnw dfnwVar = new dfnw();
        a = dfnwVar;
        dsqw.cc(dfnw.class, dfnwVar);
    }

    private dfnw() {
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
                return new dfnw();
            }
            if (i2 == 4) {
                return new dfnv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfnw> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfnw.class) {
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
