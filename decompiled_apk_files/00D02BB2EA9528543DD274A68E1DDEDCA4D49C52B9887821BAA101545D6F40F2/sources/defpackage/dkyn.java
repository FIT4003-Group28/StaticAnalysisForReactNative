package defpackage;
/* compiled from: PG */
/* renamed from: dkyn  reason: default package */
/* loaded from: classes.dex */
public final class dkyn extends dsqw<dkyn, dkym> implements dssk {
    public static final dkyn g;
    private static volatile dssr<dkyn> i;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    private int h;

    static {
        dkyn dkynVar = new dkyn();
        g = dkynVar;
        dsqw.cc(dkyn.class, dkynVar);
    }

    private dkyn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dkyn();
            }
            if (i3 == 4) {
                return new dkym();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkyn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dkyn.class) {
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
