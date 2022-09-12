package defpackage;
/* compiled from: PG */
/* renamed from: dvzl  reason: default package */
/* loaded from: classes6.dex */
public final class dvzl extends dsqs<dvzl, dvzk> implements dsqt {
    public static final dvzl g;
    private static volatile dssr<dvzl> i;
    public int a;
    public dvyw b;
    public dvus d;
    public dhze e;
    public dhld f;
    private byte h = 2;
    public dsrj<dvxl> c = dssu.b;

    static {
        dvzl dvzlVar = new dvzl();
        g = dvzlVar;
        dsqw.cc(dvzl.class, dvzlVar);
    }

    private dvzl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0003\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ဉ\u0002\u0007ᐉ\u0004", new Object[]{"a", "b", "c", dvxl.class, "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dvzl();
            }
            if (i3 == 4) {
                return new dvzk();
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
            dssr<dvzl> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvzl.class) {
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
