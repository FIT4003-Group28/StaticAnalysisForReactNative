package defpackage;
/* compiled from: PG */
/* renamed from: dhgx  reason: default package */
/* loaded from: classes6.dex */
public final class dhgx extends dsqw<dhgx, dhgw> implements dssk {
    public static final dhgx a;
    private static volatile dssr<dhgx> e;
    private int b;
    private dhgr c;
    private byte d = 2;

    static {
        dhgx dhgxVar = new dhgx();
        a = dhgxVar;
        dsqw.cc(dhgx.class, dhgxVar);
    }

    private dhgx() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001ee\u0001\u0000\u0000\u0001eᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhgx();
            }
            if (i2 == 4) {
                return new dhgw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dhgx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhgx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
