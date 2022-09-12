package defpackage;
/* compiled from: PG */
/* renamed from: dluu  reason: default package */
/* loaded from: classes6.dex */
public final class dluu extends dsqw<dluu, dlur> implements dssk {
    public static final dluu b;
    private static volatile dssr<dluu> d;
    public int a;
    private int c;

    static {
        dluu dluuVar = new dluu();
        b = dluuVar;
        dsqw.cc(dluu.class, dluuVar);
    }

    private dluu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dlus.a});
            }
            if (i2 == 3) {
                return new dluu();
            }
            if (i2 == 4) {
                return new dlur();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dluu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dluu.class) {
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
