package defpackage;
/* compiled from: PG */
/* renamed from: dtut  reason: default package */
/* loaded from: classes6.dex */
public final class dtut extends dsqw<dtut, dtus> implements dssk {
    public static final dtut d;
    private static volatile dssr<dtut> e;
    public String a = "";
    public boolean b;
    public boolean c;

    static {
        dtut dtutVar = new dtut();
        d = dtutVar;
        dsqw.cc(dtut.class, dtutVar);
    }

    private dtut() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003\u0007\u0004\u0007", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtut();
            }
            if (i2 == 4) {
                return new dtus();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtut> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtut.class) {
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
