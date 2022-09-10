package defpackage;
/* compiled from: PG */
/* renamed from: dpns  reason: default package */
/* loaded from: classes6.dex */
public final class dpns extends dsqw<dpns, dpnr> implements dssk {
    public static final dpns f;
    private static volatile dssr<dpns> h;
    public drdg a;
    public int c;
    private int g;
    public dsrj<dqcq> b = dssu.b;
    public String d = "";
    public String e = "";

    static {
        dpns dpnsVar = new dpns();
        f = dpnsVar;
        dsqw.cc(dpns.class, dpnsVar);
    }

    private dpns() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"g", "a", "b", dqcq.class, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dpns();
            }
            if (i2 == 4) {
                return new dpnr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpns> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dpns.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
