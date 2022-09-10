package defpackage;
/* compiled from: PG */
/* renamed from: dkrt  reason: default package */
/* loaded from: classes6.dex */
public final class dkrt extends dsqw<dkrt, dkrs> implements dssk {
    public static final dkrt b;
    private static volatile dssr<dkrt> d;
    public boolean a;
    private int c;

    static {
        dkrt dkrtVar = new dkrt();
        b = dkrtVar;
        dsqw.cc(dkrt.class, dkrtVar);
    }

    private dkrt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဇ\u0007", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkrt();
            }
            if (i2 == 4) {
                return new dkrs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkrt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkrt.class) {
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
