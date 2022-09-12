package defpackage;
/* compiled from: PG */
/* renamed from: dfnf  reason: default package */
/* loaded from: classes6.dex */
public final class dfnf extends dsqw<dfnf, dfne> implements dssk {
    public static final dfnf a;
    private static volatile dssr<dfnf> c;
    private byte b = 2;

    static {
        dfnf dfnfVar = new dfnf();
        a = dfnfVar;
        dsqw.cc(dfnf.class, dfnfVar);
    }

    private dfnf() {
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
                return new dfnf();
            }
            if (i2 == 4) {
                return new dfne();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dfnf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dfnf.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
