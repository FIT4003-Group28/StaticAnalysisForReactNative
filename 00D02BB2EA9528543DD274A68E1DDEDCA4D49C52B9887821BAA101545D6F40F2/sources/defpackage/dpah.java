package defpackage;
/* compiled from: PG */
/* renamed from: dpah  reason: default package */
/* loaded from: classes6.dex */
public final class dpah extends dsqw<dpah, dpag> implements dssk {
    public static final dpah g;
    private static volatile dssr<dpah> i;
    public int a;
    public dpan b;
    public dquj c;
    public drgz d;
    private byte h = 2;
    public String e = "";
    public String f = "";

    static {
        dpah dpahVar = new dpah();
        g = dpahVar;
        dsqw.cc(dpah.class, dpahVar);
    }

    private dpah() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဈ\u0003\u0004ဉ\u0002\u0005ဈ\u0004", new Object[]{"a", "b", "c", "e", "d", "f"});
            }
            if (i3 == 3) {
                return new dpah();
            }
            if (i3 == 4) {
                return new dpag();
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
            dssr<dpah> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dpah.class) {
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
