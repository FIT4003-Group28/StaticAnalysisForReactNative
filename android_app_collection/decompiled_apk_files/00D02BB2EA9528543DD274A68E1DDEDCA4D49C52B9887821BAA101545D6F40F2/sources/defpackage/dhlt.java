package defpackage;
/* compiled from: PG */
/* renamed from: dhlt  reason: default package */
/* loaded from: classes.dex */
public final class dhlt extends dsqw<dhlt, dhls> implements dssk {
    public static final dhlt b;
    private static volatile dssr<dhlt> c;
    public dsri a = dsrx.b;

    static {
        dhlt dhltVar = new dhlt();
        b = dhltVar;
        dsqw.cc(dhlt.class, dhltVar);
    }

    private dhlt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dhlt();
            }
            if (i2 == 4) {
                return new dhls();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhlt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhlt.class) {
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
