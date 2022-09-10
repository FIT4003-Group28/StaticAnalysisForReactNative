package defpackage;
/* compiled from: PG */
/* renamed from: dpxe  reason: default package */
/* loaded from: classes6.dex */
public final class dpxe extends dsqw<dpxe, dpxd> implements dssk {
    public static final dpxe g;
    private static volatile dssr<dpxe> i;
    public String a = "";
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;
    private int h;

    static {
        dpxe dpxeVar = new dpxe();
        g = dpxeVar;
        dsqw.cc(dpxe.class, dpxeVar);
    }

    private dpxe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dpxe();
            }
            if (i3 == 4) {
                return new dpxd();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dpxe> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dpxe.class) {
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
