package defpackage;
/* compiled from: PG */
/* renamed from: dliz  reason: default package */
/* loaded from: classes6.dex */
public final class dliz extends dsqw<dliz, dliy> implements dssk {
    public static final dliz b;
    private static volatile dssr<dliz> d;
    public dpov a;
    private int c;

    static {
        dliz dlizVar = new dliz();
        b = dlizVar;
        dsqw.cc(dliz.class, dlizVar);
    }

    private dliz() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dliz();
            }
            if (i2 == 4) {
                return new dliy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dliz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dliz.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
