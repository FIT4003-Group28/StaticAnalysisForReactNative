package defpackage;
/* compiled from: PG */
/* renamed from: dtvc  reason: default package */
/* loaded from: classes6.dex */
public final class dtvc extends dsqw<dtvc, dtvb> implements dssk {
    public static final dtvc c;
    private static volatile dssr<dtvc> d;
    public boolean a;
    public boolean b;

    static {
        dtvc dtvcVar = new dtvc();
        c = dtvcVar;
        dsqw.cc(dtvc.class, dtvcVar);
    }

    private dtvc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtvc();
            }
            if (i2 == 4) {
                return new dtvb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtvc.class) {
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
