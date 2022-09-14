package defpackage;
/* compiled from: PG */
/* renamed from: dtop  reason: default package */
/* loaded from: classes6.dex */
public final class dtop extends dsqw<dtop, dtoo> implements dssk {
    public static final dtop a;
    private static volatile dssr<dtop> f;
    private int b;
    private dtmr c;
    private dtid d;
    private byte e = 2;

    static {
        dtop dtopVar = new dtop();
        a = dtopVar;
        dsqw.cc(dtop.class, dtopVar);
    }

    private dtop() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᐉ\u0002\u0003ᐉ\u0003", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtop();
            }
            if (i2 == 4) {
                return new dtoo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dtop> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtop.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
