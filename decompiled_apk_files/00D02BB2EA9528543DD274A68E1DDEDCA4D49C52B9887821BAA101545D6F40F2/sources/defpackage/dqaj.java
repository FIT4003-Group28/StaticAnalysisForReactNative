package defpackage;
/* compiled from: PG */
/* renamed from: dqaj  reason: default package */
/* loaded from: classes6.dex */
public final class dqaj extends dsqw<dqaj, dqai> implements dssk {
    public static final dqaj b;
    private static volatile dssr<dqaj> d;
    public dqaw a;
    private int c;

    static {
        dqaj dqajVar = new dqaj();
        b = dqajVar;
        dsqw.cc(dqaj.class, dqajVar);
    }

    private dqaj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqaj();
            }
            if (i2 == 4) {
                return new dqai();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqaj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqaj.class) {
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
