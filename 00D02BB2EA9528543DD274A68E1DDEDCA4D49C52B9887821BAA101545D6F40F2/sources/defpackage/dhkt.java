package defpackage;
/* compiled from: PG */
/* renamed from: dhkt  reason: default package */
/* loaded from: classes6.dex */
public final class dhkt extends dsqs<dhkt, dhks> implements dsqt {
    public static final dhkt c;
    private static volatile dssr<dhkt> f;
    public int a;
    private dnqh d;
    private byte e = 2;
    public String b = "";

    static {
        dhkt dhktVar = new dhkt();
        c = dhktVar;
        dsqw.cc(dhkt.class, dhktVar);
    }

    private dhkt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဈ\u0002", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new dhkt();
            }
            if (i2 == 4) {
                return new dhks();
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
            dssr<dhkt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhkt.class) {
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
