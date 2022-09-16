package defpackage;
/* compiled from: PG */
/* renamed from: dlve  reason: default package */
/* loaded from: classes6.dex */
public final class dlve extends dsqw<dlve, dlvd> implements dssk {
    public static final dlve b;
    private static volatile dssr<dlve> d;
    public boolean a;
    private int c;

    static {
        dlve dlveVar = new dlve();
        b = dlveVar;
        dsqw.cc(dlve.class, dlveVar);
    }

    private dlve() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlve();
            }
            if (i2 == 4) {
                return new dlvd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlve> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlve.class) {
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
