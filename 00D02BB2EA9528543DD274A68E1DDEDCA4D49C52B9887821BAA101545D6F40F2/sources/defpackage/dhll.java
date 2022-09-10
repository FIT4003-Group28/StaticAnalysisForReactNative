package defpackage;
/* compiled from: PG */
/* renamed from: dhll  reason: default package */
/* loaded from: classes6.dex */
public final class dhll extends dsqw<dhll, dhlk> implements dssk {
    public static final dhll g;
    private static volatile dssr<dhll> i;
    public int a;
    public boolean b;
    public dozz c;
    public dpuq e;
    private byte h = 2;
    public dsrj<dozz> d = dssu.b;
    public dsrj<dozz> f = dssu.b;

    static {
        dhll dhllVar = new dhll();
        g = dhllVar;
        dsqw.cc(dhll.class, dhllVar);
    }

    private dhll() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0003\u0001ဇ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဉ\u0002\u0006Л", new Object[]{"a", "b", "c", "d", dozz.class, "e", "f", dozz.class});
            }
            if (i3 == 3) {
                return new dhll();
            }
            if (i3 == 4) {
                return new dhlk();
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
            dssr<dhll> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dhll.class) {
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
