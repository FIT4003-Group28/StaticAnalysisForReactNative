package defpackage;
/* compiled from: PG */
/* renamed from: dtcv  reason: default package */
/* loaded from: classes6.dex */
public final class dtcv extends dsqw<dtcv, dtcu> implements dssk {
    public static final dtcv e;
    private static volatile dssr<dtcv> f;
    public int a;
    public dtyp b;
    public dspd c = dspd.b;
    public long d;

    static {
        dtcv dtcvVar = new dtcv();
        e = dtcvVar;
        dsqw.cc(dtcv.class, dtcvVar);
    }

    private dtcv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtcv();
            }
            if (i2 == 4) {
                return new dtcu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtcv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtcv.class) {
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
