package defpackage;
/* compiled from: PG */
/* renamed from: dwmj  reason: default package */
/* loaded from: classes6.dex */
public final class dwmj extends dsqw<dwmj, dwls> implements dssk {
    public static final dwmj g;
    private static volatile dssr<dwmj> i;
    public int a;
    public Object c;
    public int d;
    public int b = 0;
    private byte h = 2;
    public String e = "";
    public String f = "";

    static {
        dwmj dwmjVar = new dwmj();
        g = dwmjVar;
        dsqw.cc(dwmj.class, dwmjVar);
    }

    private dwmj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0011\u0001\u0001\u0004\u0015\u0011\u0000\u0000\u0001\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bဌ\u000e\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0011ᐼ\u0000\u0012ြ\u0000\u0013ဈ\u000f\u0014ဈ\u0010\u0015ြ\u0000", new Object[]{"c", "b", "a", dwma.class, dwmc.class, dwmi.class, dwmg.class, "d", dwlt.a, dwly.class, dwlr.class, dwlj.class, dwll.class, dwlp.class, dwln.class, dqde.class, dqgp.class, dwlw.class, "e", "f", dnjp.class});
            }
            if (i3 == 3) {
                return new dwmj();
            }
            if (i3 == 4) {
                return new dwls();
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
            dssr<dwmj> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwmj.class) {
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
