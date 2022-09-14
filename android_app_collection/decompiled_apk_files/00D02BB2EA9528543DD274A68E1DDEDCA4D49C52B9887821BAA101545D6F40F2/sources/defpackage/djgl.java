package defpackage;
/* compiled from: PG */
/* renamed from: djgl  reason: default package */
/* loaded from: classes6.dex */
public final class djgl extends dsqw<djgl, djgk> implements dssk {
    public static final djgl g;
    private static volatile dssr<djgl> i;
    public int a;
    public Object c;
    public djez d;
    public int b = 0;
    private byte h = 2;
    public String e = "";
    public String f = "";

    static {
        djgl djglVar = new djgl();
        g = djglVar;
        dsqw.cc(djgl.class, djglVar);
    }

    private djgl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ᐼ\u0000\u0002ဈ\u0005\u0003ဈ\u0006\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ᐉ\u0004\u0007ᐼ\u0000", new Object[]{"c", "b", "a", djfx.class, "e", "f", djfn.class, djgd.class, "d", djhu.class});
            }
            if (i3 == 3) {
                return new djgl();
            }
            if (i3 == 4) {
                return new djgk();
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
            dssr<djgl> dssrVar = i;
            if (dssrVar == null) {
                synchronized (djgl.class) {
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
