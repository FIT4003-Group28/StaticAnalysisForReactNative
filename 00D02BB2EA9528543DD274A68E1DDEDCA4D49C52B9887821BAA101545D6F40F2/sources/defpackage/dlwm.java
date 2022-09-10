package defpackage;
/* compiled from: PG */
/* renamed from: dlwm  reason: default package */
/* loaded from: classes.dex */
public final class dlwm extends dsqw<dlwm, dlwl> implements dssk {
    public static final dlwm b;
    private static volatile dssr<dlwm> d;
    public String a = "";
    private int c;

    static {
        dlwm dlwmVar = new dlwm();
        b = dlwmVar;
        dsqw.cc(dlwm.class, dlwmVar);
    }

    private dlwm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlwm();
            }
            if (i2 == 4) {
                return new dlwl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlwm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlwm.class) {
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
