package defpackage;
/* compiled from: PG */
/* renamed from: dhwa  reason: default package */
/* loaded from: classes6.dex */
public final class dhwa extends dsqw<dhwa, dhvz> implements dssk {
    public static final dhwa d;
    private static volatile dssr<dhwa> f;
    public int a;
    public dnqh c;
    private byte e = 2;
    public String b = "";

    static {
        dhwa dhwaVar = new dhwa();
        d = dhwaVar;
        dsqw.cc(dhwa.class, dhwaVar);
    }

    private dhwa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhwa();
            }
            if (i2 == 4) {
                return new dhvz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dhwa> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhwa.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
