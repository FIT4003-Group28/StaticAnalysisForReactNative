package defpackage;
/* compiled from: PG */
/* renamed from: dhoh  reason: default package */
/* loaded from: classes.dex */
public final class dhoh extends dsqw<dhoh, dhog> implements dssk {
    public static final dsrg<Integer, dkee> b = new dhof();
    public static final dhoh c;
    private static volatile dssr<dhoh> d;
    public dsrf a = dsqz.b;

    static {
        dhoh dhohVar = new dhoh();
        c = dhohVar;
        dsqw.cc(dhoh.class, dhohVar);
    }

    private dhoh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", dkee.c()});
            }
            if (i2 == 3) {
                return new dhoh();
            }
            if (i2 == 4) {
                return new dhog();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhoh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhoh.class) {
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
