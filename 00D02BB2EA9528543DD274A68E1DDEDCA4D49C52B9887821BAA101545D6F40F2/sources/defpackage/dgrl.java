package defpackage;
/* compiled from: PG */
/* renamed from: dgrl  reason: default package */
/* loaded from: classes6.dex */
public final class dgrl extends dsqw<dgrl, dgrk> implements dssk {
    public static final dgrl a;
    private static volatile dssr<dgrl> e;
    private int b;
    private dgrh c;
    private byte d = 2;

    static {
        dgrl dgrlVar = new dgrl();
        a = dgrlVar;
        dsqw.cc(dgrl.class, dgrlVar);
    }

    private dgrl() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0001", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgrl();
            }
            if (i2 == 4) {
                return new dgrk();
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
            dssr<dgrl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgrl.class) {
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
