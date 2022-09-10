package defpackage;
/* compiled from: PG */
/* renamed from: amzc  reason: default package */
/* loaded from: classes.dex */
public final class amzc extends dsqw<amzc, amzb> implements dssk {
    public static final amzc c;
    private static volatile dssr<amzc> f;
    public amze a;
    private int d;
    private byte e = 2;
    public dspd b = dspd.b;

    static {
        amzc amzcVar = new amzc();
        c = amzcVar;
        dsqw.cc(amzc.class, amzcVar);
    }

    private amzc() {
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
                return new amzc();
            }
            if (i2 == 4) {
                return new amzb();
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
            dssr<amzc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (amzc.class) {
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
