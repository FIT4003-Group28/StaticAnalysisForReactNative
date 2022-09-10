package defpackage;
/* compiled from: PG */
/* renamed from: dtnj  reason: default package */
/* loaded from: classes6.dex */
public final class dtnj extends dsqw<dtnj, dtni> implements dssk {
    public static final dtnj g;
    private static volatile dssr<dtnj> i;
    public int a;
    public dvyw b;
    public dthb c;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dtnj dtnjVar = new dtnj();
        g = dtnjVar;
        dsqw.cc(dtnj.class, dtnjVar);
    }

    private dtnj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0000\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ဈ\u0005\bဈ\b\tဈ\t", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dtnj();
            }
            if (i3 == 4) {
                return new dtni();
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
            dssr<dtnj> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtnj.class) {
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
