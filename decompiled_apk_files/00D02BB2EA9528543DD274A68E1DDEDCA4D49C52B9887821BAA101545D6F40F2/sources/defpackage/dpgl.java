package defpackage;
/* compiled from: PG */
/* renamed from: dpgl  reason: default package */
/* loaded from: classes6.dex */
public final class dpgl extends dsqw<dpgl, dpgk> implements dssk {
    public static final dpgl g;
    private static volatile dssr<dpgl> i;
    public int a;
    private byte h = 2;
    public dsrj<dpce> b = dssu.b;
    public dsrj<dpgh> c = dssu.b;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dpgl dpglVar = new dpgl();
        g = dpglVar;
        dsqw.cc(dpgl.class, dpglVar);
    }

    private dpgl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0001\u0001Л\u0002\u001b\u0003ဈ\u0000\u0004ဈ\u0001\u0006ဈ\u0003", new Object[]{"a", "b", dpce.class, "c", dpgh.class, "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dpgl();
            }
            if (i3 == 4) {
                return new dpgk();
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
            dssr<dpgl> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dpgl.class) {
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
