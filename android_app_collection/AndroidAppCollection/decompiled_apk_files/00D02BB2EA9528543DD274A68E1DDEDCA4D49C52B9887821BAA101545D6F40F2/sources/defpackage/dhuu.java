package defpackage;
/* compiled from: PG */
/* renamed from: dhuu  reason: default package */
/* loaded from: classes6.dex */
public final class dhuu extends dsqw<dhuu, dhut> implements dssk {
    public static final dhuu a;
    private static volatile dssr<dhuu> b;

    static {
        dhuu dhuuVar = new dhuu();
        a = dhuuVar;
        dsqw.cc(dhuu.class, dhuuVar);
    }

    private dhuu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhuu();
            }
            if (i2 == 4) {
                return new dhut();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhuu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhuu.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
