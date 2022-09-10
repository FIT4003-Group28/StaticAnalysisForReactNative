package defpackage;
/* compiled from: PG */
/* renamed from: dgqh  reason: default package */
/* loaded from: classes6.dex */
public final class dgqh extends dsqw<dgqh, dgqg> implements dssk {
    public static final dgqh a;
    private static volatile dssr<dgqh> e;
    private int b;
    private dgqf c;
    private byte d = 2;

    static {
        dgqh dgqhVar = new dgqh();
        a = dgqhVar;
        dsqw.cc(dgqh.class, dgqhVar);
    }

    private dgqh() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0004", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgqh();
            }
            if (i2 == 4) {
                return new dgqg();
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
            dssr<dgqh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgqh.class) {
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
