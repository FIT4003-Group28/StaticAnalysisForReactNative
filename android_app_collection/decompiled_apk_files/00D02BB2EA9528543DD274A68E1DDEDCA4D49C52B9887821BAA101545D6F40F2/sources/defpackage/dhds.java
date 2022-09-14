package defpackage;
/* compiled from: PG */
/* renamed from: dhds  reason: default package */
/* loaded from: classes6.dex */
public final class dhds extends dsqw<dhds, dhdq> implements dssk {
    public static final dhds b;
    private static volatile dssr<dhds> c;
    public dsrf a = dsqz.b;

    static {
        dhds dhdsVar = new dhds();
        b = dhdsVar;
        dsqw.cc(dhds.class, dhdsVar);
    }

    private dhds() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dhds();
            }
            if (i2 == 4) {
                return new dhdq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhds> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhds.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
