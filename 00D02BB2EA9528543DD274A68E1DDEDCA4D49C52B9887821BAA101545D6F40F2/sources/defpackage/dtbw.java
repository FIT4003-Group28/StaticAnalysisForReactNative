package defpackage;
/* compiled from: PG */
/* renamed from: dtbw  reason: default package */
/* loaded from: classes6.dex */
public final class dtbw extends dsqw<dtbw, dtbv> implements dssk {
    public static final dtbw e;
    private static volatile dssr<dtbw> f;
    public dsrj<dspd> a = dssu.b;
    public dsrf b = dsqz.b;
    public dsri c = dsrx.b;
    public dsrf d = dsqz.b;

    static {
        dtbw dtbwVar = new dtbw();
        e = dtbwVar;
        dsqw.cc(dtbw.class, dtbwVar);
    }

    private dtbw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001c\u0002'\u0003%\u0004'", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtbw();
            }
            if (i2 == 4) {
                return new dtbv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtbw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtbw.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
