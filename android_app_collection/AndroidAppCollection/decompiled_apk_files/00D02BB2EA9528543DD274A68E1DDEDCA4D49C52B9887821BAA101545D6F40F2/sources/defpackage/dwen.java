package defpackage;
/* compiled from: PG */
/* renamed from: dwen  reason: default package */
/* loaded from: classes6.dex */
public final class dwen extends dsqw<dwen, dwem> implements dssk {
    public static final dwen b;
    private static volatile dssr<dwen> d;
    public boolean a;
    private int c;

    static {
        dwen dwenVar = new dwen();
        b = dwenVar;
        dsqw.cc(dwen.class, dwenVar);
    }

    private dwen() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwen();
            }
            if (i2 == 4) {
                return new dwem();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwen> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwen.class) {
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
