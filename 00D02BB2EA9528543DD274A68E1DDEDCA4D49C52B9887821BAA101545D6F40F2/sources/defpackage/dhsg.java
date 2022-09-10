package defpackage;
/* compiled from: PG */
/* renamed from: dhsg  reason: default package */
/* loaded from: classes6.dex */
public final class dhsg extends dsqw<dhsg, dhsd> implements dssk {
    public static final dhsg g;
    private static volatile dssr<dhsg> i;
    public int a;
    public dhsf d;
    public dnqh e;
    public djgw f;
    private byte h = 2;
    public String b = "";
    public String c = "";

    static {
        dhsg dhsgVar = new dhsg();
        g = dhsgVar;
        dsqw.cc(dhsg.class, dhsgVar);
    }

    private dhsg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dhsg();
            }
            if (i3 == 4) {
                return new dhsd();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dhsg> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dhsg.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
