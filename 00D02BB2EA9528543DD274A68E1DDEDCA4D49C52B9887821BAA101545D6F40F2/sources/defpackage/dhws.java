package defpackage;
/* compiled from: PG */
/* renamed from: dhws  reason: default package */
/* loaded from: classes6.dex */
public final class dhws extends dsqw<dhws, dhwr> implements dssk {
    public static final dhws c;
    private static volatile dssr<dhws> f;
    public int a;
    private dnqh d;
    private byte e = 2;
    public String b = "";

    static {
        dhws dhwsVar = new dhws();
        c = dhwsVar;
        dsqw.cc(dhws.class, dhwsVar);
    }

    private dhws() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new dhws();
            }
            if (i2 == 4) {
                return new dhwr();
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
            dssr<dhws> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhws.class) {
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
