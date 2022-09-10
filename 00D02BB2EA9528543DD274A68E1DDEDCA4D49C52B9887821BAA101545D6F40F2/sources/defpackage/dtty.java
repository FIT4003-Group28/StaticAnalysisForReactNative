package defpackage;
/* compiled from: PG */
/* renamed from: dtty  reason: default package */
/* loaded from: classes6.dex */
public final class dtty extends dsqw<dtty, dttx> implements dssk {
    public static final dtty a;
    private static volatile dssr<dtty> b;

    static {
        dtty dttyVar = new dtty();
        a = dttyVar;
        dsqw.cc(dtty.class, dttyVar);
    }

    private dtty() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dtty();
            }
            if (i2 == 4) {
                return new dttx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtty> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtty.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
