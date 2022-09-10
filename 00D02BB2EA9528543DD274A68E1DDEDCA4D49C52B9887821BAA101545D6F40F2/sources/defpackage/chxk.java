package defpackage;
/* compiled from: PG */
/* renamed from: chxk  reason: default package */
/* loaded from: classes4.dex */
public final class chxk extends dsqw<chxk, chxi> implements dssk {
    public static final chxk g;
    private static volatile dssr<chxk> i;
    public int a;
    public Object c;
    public boolean d;
    public int b = 0;
    private byte h = 2;
    public String e = "";
    public String f = "";

    static {
        chxk chxkVar = new chxk();
        g = chxkVar;
        dsqw.cc(chxk.class, chxkVar);
    }

    private chxk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0013\u0001\u0001\u0001\u0014\u0013\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဇ\u0010\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u0010ᐼ\u0000\u0011ြ\u0000\u0012ဈ\u0011\u0013ဈ\u0012\u0014ြ\u0000", new Object[]{"c", "b", "a", chwr.class, chwv.class, chwb.class, chwd.class, chxh.class, "d", chwp.class, chwh.class, chvy.class, chvq.class, chvs.class, chvw.class, chvu.class, chwn.class, chwt.class, chwl.class, "e", "f", chwf.class});
            }
            if (i3 == 3) {
                return new chxk();
            }
            if (i3 == 4) {
                return new chxi();
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
            dssr<chxk> dssrVar = i;
            if (dssrVar == null) {
                synchronized (chxk.class) {
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
