package defpackage;
/* compiled from: PG */
/* renamed from: dhup  reason: default package */
/* loaded from: classes6.dex */
public final class dhup extends dsqw<dhup, dhuo> implements dssk {
    public static final dhup c;
    private static volatile dssr<dhup> d;
    public int a;
    public int b;

    static {
        dhup dhupVar = new dhup();
        c = dhupVar;
        dsqw.cc(dhup.class, dhupVar);
    }

    private dhup() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drba.a});
            }
            if (i2 == 3) {
                return new dhup();
            }
            if (i2 == 4) {
                return new dhuo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhup> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhup.class) {
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
