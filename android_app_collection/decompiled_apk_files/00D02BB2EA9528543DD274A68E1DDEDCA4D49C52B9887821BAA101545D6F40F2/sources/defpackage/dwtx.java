package defpackage;
/* compiled from: PG */
/* renamed from: dwtx  reason: default package */
/* loaded from: classes6.dex */
public final class dwtx extends dsqw<dwtx, dwtw> implements dssk {
    public static final dwtx e;
    private static volatile dssr<dwtx> f;
    public int a;
    public dioi b;
    public dioi c;
    public dioi d;

    static {
        dwtx dwtxVar = new dwtx();
        e = dwtxVar;
        dsqw.cc(dwtx.class, dwtxVar);
    }

    private dwtx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwtx();
            }
            if (i2 == 4) {
                return new dwtw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwtx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwtx.class) {
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
