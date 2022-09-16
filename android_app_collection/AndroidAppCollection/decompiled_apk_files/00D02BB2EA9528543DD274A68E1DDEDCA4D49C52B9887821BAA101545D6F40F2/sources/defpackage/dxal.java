package defpackage;
/* compiled from: PG */
/* renamed from: dxal  reason: default package */
/* loaded from: classes.dex */
public final class dxal extends dsqw<dxal, dxak> implements dssk {
    public static final dxal g;
    private static volatile dssr<dxal> i;
    public int a;
    public int c;
    public long d;
    private byte h = 2;
    public String b = "";
    public dspd e = dspd.b;
    public String f = "";

    static {
        dxal dxalVar = new dxal();
        g = dxalVar;
        dsqw.cc(dxal.class, dxalVar);
    }

    private dxal() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0004\u0002ᔈ\u0000\u0003ᔄ\u0001\u0004ᔅ\u0002\u0006ည\u0003\u0007ᔈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dxal();
            }
            if (i3 == 4) {
                return new dxak();
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
            dssr<dxal> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dxal.class) {
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
