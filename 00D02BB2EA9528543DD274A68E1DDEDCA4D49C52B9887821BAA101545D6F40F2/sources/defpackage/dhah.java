package defpackage;
/* compiled from: PG */
/* renamed from: dhah  reason: default package */
/* loaded from: classes6.dex */
public final class dhah extends dsqw<dhah, dhag> implements dssk {
    public static final dhah c;
    private static volatile dssr<dhah> d;
    public int a;
    public int b;

    static {
        dhah dhahVar = new dhah();
        c = dhahVar;
        dsqw.cc(dhah.class, dhahVar);
    }

    private dhah() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\r\u0002\r", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhah();
            }
            if (i2 == 4) {
                return new dhag();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhah> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhah.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
