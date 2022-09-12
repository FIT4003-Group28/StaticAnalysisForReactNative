package defpackage;
/* compiled from: PG */
/* renamed from: dhoj  reason: default package */
/* loaded from: classes6.dex */
public final class dhoj extends dsqw<dhoj, dhoi> implements dssk {
    public static final dhoj b;
    private static volatile dssr<dhoj> d;
    public int a;
    private int c;

    static {
        dhoj dhojVar = new dhoj();
        b = dhojVar;
        dsqw.cc(dhoj.class, dhojVar);
    }

    private dhoj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhoj();
            }
            if (i2 == 4) {
                return new dhoi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhoj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhoj.class) {
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
