package defpackage;
/* compiled from: PG */
/* renamed from: ccww  reason: default package */
/* loaded from: classes4.dex */
public final class ccww extends dsqw<ccww, ccwv> implements dssk {
    public static final ccww g;
    private static volatile dssr<ccww> h;
    public int a;
    public ccwk d;
    public ccme e;
    public String b = "";
    public String c = "";
    public dsrj<ccwu> f = dssu.b;

    static {
        ccww ccwwVar = new ccww();
        g = ccwwVar;
        dsqw.cc(ccww.class, ccwwVar);
    }

    private ccww() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0005ဈ\u0001\u0006ဉ\u0003\u0007ဉ\u0002", new Object[]{"a", "b", "f", ccwu.class, "c", "e", "d"});
            }
            if (i2 == 3) {
                return new ccww();
            }
            if (i2 == 4) {
                return new ccwv();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccww> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ccww.class) {
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
