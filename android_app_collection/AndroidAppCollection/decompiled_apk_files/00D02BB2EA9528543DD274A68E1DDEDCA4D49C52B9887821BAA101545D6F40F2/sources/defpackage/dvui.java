package defpackage;
/* compiled from: PG */
/* renamed from: dvui  reason: default package */
/* loaded from: classes6.dex */
public final class dvui extends dsqw<dvui, dvuf> implements dssk {
    public static final dvui a;
    private static volatile dssr<dvui> b;

    static {
        dvui dvuiVar = new dvui();
        a = dvuiVar;
        dsqw.cc(dvui.class, dvuiVar);
    }

    private dvui() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
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
                return new dvui();
            }
            if (i2 == 4) {
                return new dvuf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvui> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvui.class) {
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
