package defpackage;
/* compiled from: PG */
/* renamed from: dgqn  reason: default package */
/* loaded from: classes6.dex */
public final class dgqn extends dsqw<dgqn, dgqm> implements dssk {
    public static final dgqn a;
    private static volatile dssr<dgqn> e;
    private int b;
    private dgrh c;
    private byte d = 2;

    static {
        dgqn dgqnVar = new dgqn();
        a = dgqnVar;
        dsqw.cc(dgqn.class, dgqnVar);
    }

    private dgqn() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgqn();
            }
            if (i2 == 4) {
                return new dgqm();
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
            dssr<dgqn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgqn.class) {
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
