package defpackage;
/* compiled from: PG */
/* renamed from: dqwm  reason: default package */
/* loaded from: classes6.dex */
public final class dqwm extends dsqw<dqwm, dqwj> implements dssk {
    public static final dqwm d;
    private static volatile dssr<dqwm> e;
    public int a;
    public int b;
    public int c;

    static {
        dqwm dqwmVar = new dqwm();
        d = dqwmVar;
        dsqw.cc(dqwm.class, dqwmVar);
    }

    private dqwm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဌ\u0001", new Object[]{"a", "b", dqwi.c(), "c", dqwk.a});
            }
            if (i2 == 3) {
                return new dqwm();
            }
            if (i2 == 4) {
                return new dqwj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqwm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqwm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
