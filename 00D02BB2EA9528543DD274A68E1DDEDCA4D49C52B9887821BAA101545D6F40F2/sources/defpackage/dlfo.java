package defpackage;
/* compiled from: PG */
/* renamed from: dlfo  reason: default package */
/* loaded from: classes6.dex */
public final class dlfo extends dsqw<dlfo, dlfl> implements dssk {
    public static final dlfo b;
    private static volatile dssr<dlfo> d;
    public int a;
    private int c;

    static {
        dlfo dlfoVar = new dlfo();
        b = dlfoVar;
        dsqw.cc(dlfo.class, dlfoVar);
    }

    private dlfo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dlfm.a});
            }
            if (i2 == 3) {
                return new dlfo();
            }
            if (i2 == 4) {
                return new dlfl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlfo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlfo.class) {
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
