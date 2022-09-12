package defpackage;
/* compiled from: PG */
/* renamed from: dfly  reason: default package */
/* loaded from: classes6.dex */
public final class dfly extends dsqw<dfly, dflx> implements dssk {
    public static final dfly a;
    private static volatile dssr<dfly> b;

    static {
        dfly dflyVar = new dfly();
        a = dflyVar;
        dsqw.cc(dfly.class, dflyVar);
    }

    private dfly() {
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
                return new dfly();
            }
            if (i2 == 4) {
                return new dflx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfly> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfly.class) {
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
