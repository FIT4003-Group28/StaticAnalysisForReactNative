package defpackage;
/* compiled from: PG */
/* renamed from: dlgv  reason: default package */
/* loaded from: classes6.dex */
public final class dlgv extends dsqw<dlgv, dlgu> implements dssk {
    public static final dlgv c;
    private static volatile dssr<dlgv> d;
    public int a;
    public long b;

    static {
        dlgv dlgvVar = new dlgv();
        c = dlgvVar;
        dsqw.cc(dlgv.class, dlgvVar);
    }

    private dlgv() {
        dspd dspdVar = dspd.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dlgv();
            }
            if (i2 == 4) {
                return new dlgu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlgv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlgv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
