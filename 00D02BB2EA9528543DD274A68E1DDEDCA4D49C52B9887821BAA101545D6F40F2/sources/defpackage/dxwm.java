package defpackage;
/* compiled from: PG */
/* renamed from: dxwm  reason: default package */
/* loaded from: classes6.dex */
public final class dxwm extends dsqw<dxwm, dxwl> implements dssk {
    public static final dxwm b;
    private static volatile dssr<dxwm> c;
    public int a;

    static {
        dxwm dxwmVar = new dxwm();
        b = dxwmVar;
        dsqw.cc(dxwm.class, dxwmVar);
    }

    private dxwm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxwm();
            }
            if (i2 == 4) {
                return new dxwl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwm> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxwm.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
