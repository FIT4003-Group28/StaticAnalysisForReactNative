package defpackage;
/* compiled from: PG */
/* renamed from: dtct  reason: default package */
/* loaded from: classes6.dex */
public final class dtct extends dsqw<dtct, dtcs> implements dssk {
    public static final dtct b;
    private static volatile dssr<dtct> c;
    public dsrj<dtcv> a = dssu.b;

    static {
        dtct dtctVar = new dtct();
        b = dtctVar;
        dsqw.cc(dtct.class, dtctVar);
    }

    private dtct() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dtcv.class});
            }
            if (i2 == 3) {
                return new dtct();
            }
            if (i2 == 4) {
                return new dtcs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtct> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtct.class) {
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
