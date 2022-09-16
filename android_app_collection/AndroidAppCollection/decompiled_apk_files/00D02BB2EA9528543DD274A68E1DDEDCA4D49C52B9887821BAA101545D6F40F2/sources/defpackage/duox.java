package defpackage;
/* compiled from: PG */
/* renamed from: duox  reason: default package */
/* loaded from: classes6.dex */
public final class duox extends dsqw<duox, duow> implements dssk {
    public static final duox a;
    private static volatile dssr<duox> f;
    private int b;
    private dvss c;
    private duvb d;
    private byte e = 2;

    static {
        duox duoxVar = new duox();
        a = duoxVar;
        dsqw.cc(duox.class, duoxVar);
    }

    private duox() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new duox();
            }
            if (i2 == 4) {
                return new duow();
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
            dssr<duox> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duox.class) {
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
