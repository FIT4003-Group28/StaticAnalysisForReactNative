package defpackage;
/* compiled from: PG */
/* renamed from: dqvo  reason: default package */
/* loaded from: classes6.dex */
public final class dqvo extends dsqw<dqvo, dqvm> implements dssk {
    public static final dqvo a;
    private static volatile dssr<dqvo> c;
    private dssd<String, Integer> b = dssd.b;

    static {
        int i = dqvl.a;
        dqvo dqvoVar = new dqvo();
        a = dqvoVar;
        dsqw.cc(dqvo.class, dqvoVar);
    }

    private dqvo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001࠲", new Object[]{"b", dqvn.a, dqvl.a()});
            }
            if (i2 == 3) {
                return new dqvo();
            }
            if (i2 == 4) {
                return new dqvm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqvo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqvo.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
