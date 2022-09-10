package defpackage;
/* compiled from: PG */
/* renamed from: dhpm  reason: default package */
/* loaded from: classes6.dex */
public final class dhpm extends dsqw<dhpm, dhpl> implements dssk {
    public static final dhpm c;
    private static volatile dssr<dhpm> e;
    public boolean a;
    public int b = 10;
    private int d;

    static {
        dhpm dhpmVar = new dhpm();
        c = dhpmVar;
        dsqw.cc(dhpm.class, dhpmVar);
    }

    private dhpm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dhpm();
            }
            if (i2 == 4) {
                return new dhpl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhpm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhpm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
