package defpackage;
/* compiled from: PG */
/* renamed from: dijz  reason: default package */
/* loaded from: classes6.dex */
public final class dijz extends dsqw<dijz, dijy> implements dssk {
    public static final dijz g;
    private static volatile dssr<dijz> i;
    public int a;
    public int b;
    public int d;
    public dnqh e;
    private byte h = 2;
    public String c = "";
    public String f = "";

    static {
        dijz dijzVar = new dijz();
        g = dijzVar;
        dsqw.cc(dijz.class, dijzVar);
    }

    private dijz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ᐉ\u0003\u0006ဈ\u0005", new Object[]{"a", "b", drkm.a, "c", "d", drkl.a, "e", "f"});
            }
            if (i3 == 3) {
                return new dijz();
            }
            if (i3 == 4) {
                return new dijy();
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
            dssr<dijz> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dijz.class) {
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
