package defpackage;
/* compiled from: PG */
/* renamed from: dhzd  reason: default package */
/* loaded from: classes6.dex */
public final class dhzd extends dsqw<dhzd, dhzc> implements dssk {
    public static final dhzd c;
    private static volatile dssr<dhzd> d;
    public int a;
    public int b;

    static {
        dhzd dhzdVar = new dhzd();
        c = dhzdVar;
        dsqw.cc(dhzd.class, dhzdVar);
    }

    private dhzd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpxl.a});
            }
            if (i2 == 3) {
                return new dhzd();
            }
            if (i2 == 4) {
                return new dhzc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhzd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhzd.class) {
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
