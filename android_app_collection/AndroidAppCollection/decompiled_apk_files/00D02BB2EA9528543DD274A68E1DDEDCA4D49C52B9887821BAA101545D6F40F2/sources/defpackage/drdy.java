package defpackage;
/* compiled from: PG */
/* renamed from: drdy  reason: default package */
/* loaded from: classes6.dex */
public final class drdy extends dsqw<drdy, drdx> implements dssk {
    public static final drdy c;
    private static volatile dssr<drdy> f;
    public docg a;
    public drkr b;
    private int d;
    private byte e = 2;

    static {
        drdy drdyVar = new drdy();
        c = drdyVar;
        dsqw.cc(drdy.class, drdyVar);
    }

    private drdy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new drdy();
            }
            if (i2 == 4) {
                return new drdx();
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
            dssr<drdy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drdy.class) {
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
