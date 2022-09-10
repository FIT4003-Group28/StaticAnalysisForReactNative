package defpackage;
/* compiled from: PG */
/* renamed from: dgqj  reason: default package */
/* loaded from: classes6.dex */
public final class dgqj extends dsqw<dgqj, dgqi> implements dssk {
    public static final dgqj a;
    private static volatile dssr<dgqj> e;
    private int b;
    private dgqb c;
    private byte d = 2;

    static {
        dgqj dgqjVar = new dgqj();
        a = dgqjVar;
        dsqw.cc(dgqj.class, dgqjVar);
    }

    private dgqj() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgqj();
            }
            if (i2 == 4) {
                return new dgqi();
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
            dssr<dgqj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgqj.class) {
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
