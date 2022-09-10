package defpackage;
/* compiled from: PG */
/* renamed from: dgqx  reason: default package */
/* loaded from: classes6.dex */
public final class dgqx extends dsqw<dgqx, dgqw> implements dssk {
    public static final dgqx a;
    private static volatile dssr<dgqx> e;
    private int b;
    private double c;
    private byte d = 2;

    static {
        dgqx dgqxVar = new dgqx();
        a = dgqxVar;
        dsqw.cc(dgqx.class, dgqxVar);
    }

    private dgqx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔀ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgqx();
            }
            if (i2 == 4) {
                return new dgqw();
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
            dssr<dgqx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgqx.class) {
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
