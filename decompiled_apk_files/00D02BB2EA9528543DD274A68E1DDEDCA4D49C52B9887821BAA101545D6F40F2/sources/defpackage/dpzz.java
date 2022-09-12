package defpackage;
/* compiled from: PG */
/* renamed from: dpzz  reason: default package */
/* loaded from: classes6.dex */
public final class dpzz extends dsqw<dpzz, dpzy> implements dssk {
    public static final dpzz g;
    private static volatile dssr<dpzz> i;
    public dnoj b;
    public int d;
    public int e;
    private int h;
    public String a = "";
    public String c = "";
    public int f = 1;

    static {
        dpzz dpzzVar = new dpzz();
        g = dpzzVar;
        dsqw.cc(dpzz.class, dpzzVar);
    }

    private dpzz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"h", "a", "b", "c", "d", dqfc.c(), "e", dfqf.a, "f", dfpz.a});
            }
            if (i3 == 3) {
                return new dpzz();
            }
            if (i3 == 4) {
                return new dpzy();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dpzz> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dpzz.class) {
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
