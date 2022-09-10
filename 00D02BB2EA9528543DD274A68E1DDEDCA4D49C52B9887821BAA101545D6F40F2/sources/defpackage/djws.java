package defpackage;
/* compiled from: PG */
/* renamed from: djws  reason: default package */
/* loaded from: classes6.dex */
public final class djws extends dsqw<djws, djwl> implements dssk {
    public static final djws g;
    private static volatile dssr<djws> i;
    public Object b;
    public drhj c;
    public int e;
    private int h;
    public int a = 0;
    public String d = "";
    public String f = "";

    static {
        djws djwsVar = new djws();
        g = djwsVar;
        dsqw.cc(djws.class, djwsVar);
    }

    private djws() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"b", "a", "h", "c", "d", "e", djwj.a, "f", djwr.class, djwn.class});
            }
            if (i3 == 3) {
                return new djws();
            }
            if (i3 == 4) {
                return new djwl();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<djws> dssrVar = i;
            if (dssrVar == null) {
                synchronized (djws.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
