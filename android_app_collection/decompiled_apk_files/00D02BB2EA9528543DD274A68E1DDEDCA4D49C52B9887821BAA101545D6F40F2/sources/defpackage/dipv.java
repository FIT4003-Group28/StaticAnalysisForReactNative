package defpackage;
/* compiled from: PG */
/* renamed from: dipv  reason: default package */
/* loaded from: classes6.dex */
public final class dipv extends dsqw<dipv, dipu> implements dssk {
    public static final dipv c;
    private static volatile dssr<dipv> f;
    public dipo a;
    private int d;
    private byte e = 2;
    public dspd b = dspd.b;

    static {
        dipv dipvVar = new dipv();
        c = dipvVar;
        dsqw.cc(dipv.class, dipvVar);
    }

    private dipv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ည\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dipv();
            }
            if (i2 == 4) {
                return new dipu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dipv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dipv.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
