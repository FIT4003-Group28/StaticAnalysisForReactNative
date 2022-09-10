package defpackage;
/* compiled from: PG */
/* renamed from: dtby  reason: default package */
/* loaded from: classes6.dex */
public final class dtby extends dsqw<dtby, dtbx> implements dssk {
    public static final dtby d;
    private static volatile dssr<dtby> e;
    public dsrf a = dsqz.b;
    public dsri b = dsrx.b;
    public dsrf c = dsqz.b;

    static {
        dtby dtbyVar = new dtby();
        d = dtbyVar;
        dsqw.cc(dtby.class, dtbyVar);
    }

    private dtby() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001'\u0002%\u0003'", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtby();
            }
            if (i2 == 4) {
                return new dtbx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtby> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtby.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
