package defpackage;
/* compiled from: PG */
/* renamed from: dhvw  reason: default package */
/* loaded from: classes6.dex */
public final class dhvw extends dsqw<dhvw, dhvv> implements dssk {
    public static final dhvw e;
    private static volatile dssr<dhvw> g;
    public int a;
    public dnqh b;
    public int c;
    private byte f = 2;
    public String d = "";

    static {
        dhvw dhvwVar = new dhvw();
        e = dhvwVar;
        dsqw.cc(dhvw.class, dhvwVar);
    }

    private dhvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", dgef.c(), "d"});
            }
            if (i2 == 3) {
                return new dhvw();
            }
            if (i2 == 4) {
                return new dhvv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dhvw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhvw.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
