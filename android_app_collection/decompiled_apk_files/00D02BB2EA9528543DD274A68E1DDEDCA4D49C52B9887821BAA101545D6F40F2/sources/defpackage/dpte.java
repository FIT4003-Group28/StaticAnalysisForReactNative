package defpackage;
/* compiled from: PG */
/* renamed from: dpte  reason: default package */
/* loaded from: classes.dex */
public final class dpte extends dsqw<dpte, dptc> implements dssk {
    public static final dpte g;
    private static volatile dssr<dpte> h;
    public int a;
    public Object c;
    public long e;
    public dqpe f;
    public int b = 0;
    public String d = "";

    static {
        dpte dpteVar = new dpte();
        g = dpteVar;
        dsqw.cc(dpte.class, dpteVar);
    }

    private dpte() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ဉ\u0006", new Object[]{"c", "b", "a", "d", "e", dptg.class, dpti.class, dptb.class, "f"});
            }
            if (i2 == 3) {
                return new dpte();
            }
            if (i2 == 4) {
                return new dptc();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpte> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dpte.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
