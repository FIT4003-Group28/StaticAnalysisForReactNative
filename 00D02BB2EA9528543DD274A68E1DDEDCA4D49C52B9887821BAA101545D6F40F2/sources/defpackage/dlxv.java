package defpackage;
/* compiled from: PG */
/* renamed from: dlxv  reason: default package */
/* loaded from: classes6.dex */
public final class dlxv extends dsqw<dlxv, dlxu> implements dssk {
    public static final dlxv a;
    private static volatile dssr<dlxv> b;

    static {
        dlxv dlxvVar = new dlxv();
        a = dlxvVar;
        dsqw.cc(dlxv.class, dlxvVar);
    }

    private dlxv() {
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
                return new dlxv();
            }
            if (i2 == 4) {
                return new dlxu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlxv.class) {
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
