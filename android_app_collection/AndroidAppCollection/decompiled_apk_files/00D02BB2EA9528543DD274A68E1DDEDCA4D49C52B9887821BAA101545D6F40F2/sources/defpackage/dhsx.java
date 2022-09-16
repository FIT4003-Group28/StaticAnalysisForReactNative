package defpackage;
/* compiled from: PG */
/* renamed from: dhsx  reason: default package */
/* loaded from: classes6.dex */
public final class dhsx extends dsqw<dhsx, dhsw> implements dssk {
    public static final dhsx b;
    private static volatile dssr<dhsx> d;
    private byte c = 2;
    public dsrj<drdy> a = dssu.b;

    static {
        dhsx dhsxVar = new dhsx();
        b = dhsxVar;
        dsqw.cc(dhsx.class, dhsxVar);
    }

    private dhsx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", drdy.class});
            }
            if (i2 == 3) {
                return new dhsx();
            }
            if (i2 == 4) {
                return new dhsw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dhsx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhsx.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
