package defpackage;
/* compiled from: PG */
/* renamed from: dmxf  reason: default package */
/* loaded from: classes.dex */
public final class dmxf extends dsqs<dmxf, dmxe> implements dsqt {
    public static final dmxf g;
    private static volatile dssr<dmxf> i;
    public int a;
    public dmxp b;
    public dmwc c;
    public int d;
    public dmyl e;
    private byte h = 2;
    public String f = "";

    static {
        dmxf dmxfVar = new dmxf();
        g = dmxfVar;
        dsqw.cc(dmxf.class, dmxfVar);
    }

    private dmxf() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဆ\u0003\u0005ဉ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dmxf();
            }
            if (i3 == 4) {
                return new dmxe();
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
            dssr<dmxf> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dmxf.class) {
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
