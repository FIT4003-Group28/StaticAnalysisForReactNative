package defpackage;
/* compiled from: PG */
/* renamed from: dgqv  reason: default package */
/* loaded from: classes6.dex */
public final class dgqv extends dsqw<dgqv, dgqu> implements dssk {
    public static final dgqv a;
    private static volatile dssr<dgqv> e;
    private int b;
    private dgqx c;
    private byte d = 2;

    static {
        dgqv dgqvVar = new dgqv();
        a = dgqvVar;
        dsqw.cc(dgqv.class, dgqvVar);
    }

    private dgqv() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgqv();
            }
            if (i2 == 4) {
                return new dgqu();
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
            dssr<dgqv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgqv.class) {
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
