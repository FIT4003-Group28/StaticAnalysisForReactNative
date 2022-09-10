package defpackage;
/* compiled from: PG */
/* renamed from: ddpm  reason: default package */
/* loaded from: classes6.dex */
public final class ddpm extends dsqw<ddpm, ddpl> implements dssk {
    public static final ddpm a;
    private static volatile dssr<ddpm> b;

    static {
        ddpm ddpmVar = new ddpm();
        a = ddpmVar;
        dsqw.cc(ddpm.class, ddpmVar);
    }

    private ddpm() {
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
                return new ddpm();
            }
            if (i2 == 4) {
                return new ddpl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddpm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddpm.class) {
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
