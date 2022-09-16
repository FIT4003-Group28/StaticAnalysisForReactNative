package defpackage;
/* compiled from: PG */
/* renamed from: dgqb  reason: default package */
/* loaded from: classes6.dex */
public final class dgqb extends dsqw<dgqb, dgqa> implements dssk {
    public static final dgqb a;
    private static volatile dssr<dgqb> e;
    private int b;
    private dtyk c;
    private byte d = 2;

    static {
        dgqb dgqbVar = new dgqb();
        a = dgqbVar;
        dsqw.cc(dgqb.class, dgqbVar);
    }

    private dgqb() {
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
                return new dgqb();
            }
            if (i2 == 4) {
                return new dgqa();
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
            dssr<dgqb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgqb.class) {
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
