package defpackage;
/* compiled from: PG */
/* renamed from: dibg  reason: default package */
/* loaded from: classes6.dex */
public final class dibg extends dsqw<dibg, dibe> implements dssk {
    public static final dibg g;
    private static volatile dssr<dibg> i;
    public int a;
    public Object c;
    public int d;
    public int e;
    public dnqh f;
    public int b = 0;
    private byte h = 2;

    static {
        dibg dibgVar = new dibg();
        g = dibgVar;
        dsqw.cc(dibg.class, dibgVar);
    }

    private dibg() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0001\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001ြ\u0000\u0002ဌ\u0002\u0003ဌ\u0003\u0006ᐉ\u0006\bျ\u0000", new Object[]{"c", "b", "a", dpov.class, "d", dibf.a, "e", dpqw.c(), "f"});
            }
            if (i3 == 3) {
                return new dibg();
            }
            if (i3 == 4) {
                return new dibe();
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
            dssr<dibg> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dibg.class) {
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
