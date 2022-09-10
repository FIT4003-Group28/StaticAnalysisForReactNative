package defpackage;
/* compiled from: PG */
/* renamed from: dfnp  reason: default package */
/* loaded from: classes6.dex */
public final class dfnp extends dsqw<dfnp, dfno> implements dssk {
    public static final dfnp a;
    private static volatile dssr<dfnp> b;

    static {
        dfnp dfnpVar = new dfnp();
        a = dfnpVar;
        dsqw.cc(dfnp.class, dfnpVar);
    }

    private dfnp() {
        dssu<Object> dssuVar = dssu.b;
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
                return new dfnp();
            }
            if (i2 == 4) {
                return new dfno();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfnp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfnp.class) {
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
