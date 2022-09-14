package defpackage;
/* compiled from: PG */
/* renamed from: dhpd  reason: default package */
/* loaded from: classes6.dex */
public final class dhpd extends dsqw<dhpd, dhpa> implements dssk {
    public static final dhpd b;
    private static volatile dssr<dhpd> d;
    public dhpc a;
    private int c;

    static {
        dhpd dhpdVar = new dhpd();
        b = dhpdVar;
        dsqw.cc(dhpd.class, dhpdVar);
    }

    private dhpd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dhpd();
            }
            if (i2 == 4) {
                return new dhpa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhpd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhpd.class) {
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
