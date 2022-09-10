package defpackage;
/* compiled from: PG */
/* renamed from: dhkx  reason: default package */
/* loaded from: classes6.dex */
public final class dhkx extends dsqs<dhkx, dhku> implements dsqt {
    public static final dhkx c;
    private static volatile dssr<dhkx> f;
    public dnwb a;
    public int b;
    private int d;
    private byte e = 2;

    static {
        dhkx dhkxVar = new dhkx();
        c = dhkxVar;
        dsqw.cc(dhkx.class, dhkxVar);
    }

    private dhkx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"d", "a", "b", dhkv.a});
            }
            if (i2 == 3) {
                return new dhkx();
            }
            if (i2 == 4) {
                return new dhku();
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
            dssr<dhkx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhkx.class) {
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
