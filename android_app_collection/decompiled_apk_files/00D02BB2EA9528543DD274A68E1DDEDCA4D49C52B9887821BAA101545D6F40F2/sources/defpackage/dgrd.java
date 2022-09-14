package defpackage;
/* compiled from: PG */
/* renamed from: dgrd  reason: default package */
/* loaded from: classes6.dex */
public final class dgrd extends dsqw<dgrd, dgrc> implements dssk {
    public static final dgrd a;
    private static volatile dssr<dgrd> f;
    private int b;
    private dgqx c;
    private dgqx d;
    private byte e = 2;

    static {
        dgrd dgrdVar = new dgrd();
        a = dgrdVar;
        dsqw.cc(dgrd.class, dgrdVar);
    }

    private dgrd() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dgrd();
            }
            if (i2 == 4) {
                return new dgrc();
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
            dssr<dgrd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgrd.class) {
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
