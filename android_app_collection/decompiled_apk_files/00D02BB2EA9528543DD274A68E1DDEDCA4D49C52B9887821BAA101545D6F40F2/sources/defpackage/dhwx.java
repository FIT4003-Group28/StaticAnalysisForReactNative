package defpackage;
/* compiled from: PG */
/* renamed from: dhwx  reason: default package */
/* loaded from: classes6.dex */
public final class dhwx extends dsqw<dhwx, dhww> implements dssk {
    public static final dhwx b;
    private static volatile dssr<dhwx> d;
    public int a;
    private int c;

    static {
        dhwx dhwxVar = new dhwx();
        b = dhwxVar;
        dsqw.cc(dhwx.class, dhwxVar);
    }

    private dhwx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhwx();
            }
            if (i2 == 4) {
                return new dhww();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhwx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhwx.class) {
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
