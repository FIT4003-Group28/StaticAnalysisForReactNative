package defpackage;
/* compiled from: PG */
/* renamed from: dmjg  reason: default package */
/* loaded from: classes.dex */
public final class dmjg extends dsqw<dmjg, dmjf> implements dssk {
    public static final dmjg g;
    private static volatile dssr<dmjg> i;
    public int a;
    public int d;
    public boolean e;
    public dgrn f;
    private byte h = 2;
    public String b = "";
    public dsrj<dmjk> c = dssu.b;

    static {
        dmjg dmjgVar = new dmjg();
        g = dmjgVar;
        dsqw.cc(dmjg.class, dmjgVar);
    }

    private dmjg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003င\u0001\u0004ဇ\u0002\u0005ᐉ\u0003", new Object[]{"a", "b", "c", dmjk.class, "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dmjg();
            }
            if (i3 == 4) {
                return new dmjf();
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
            dssr<dmjg> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dmjg.class) {
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
