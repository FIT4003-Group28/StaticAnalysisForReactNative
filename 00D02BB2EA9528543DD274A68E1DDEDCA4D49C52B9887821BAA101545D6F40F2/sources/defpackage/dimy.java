package defpackage;
/* compiled from: PG */
/* renamed from: dimy  reason: default package */
/* loaded from: classes6.dex */
public final class dimy extends dsqw<dimy, dimx> implements dssk {
    public static final dimy a;
    private static volatile dssr<dimy> b;

    static {
        dimy dimyVar = new dimy();
        a = dimyVar;
        dsqw.cc(dimy.class, dimyVar);
    }

    private dimy() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dimy();
            }
            if (i2 == 4) {
                return new dimx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dimy> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dimy.class) {
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
