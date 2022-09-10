package defpackage;
/* compiled from: PG */
/* renamed from: dvre  reason: default package */
/* loaded from: classes6.dex */
public final class dvre extends dsqw<dvre, dvrd> implements dssk {
    public static final dvre g;
    private static volatile dssr<dvre> h;
    public int a;
    public int c;
    public int d;
    public boolean f;
    public dsrj<dgkg> b = dssu.b;
    public String e = "";

    static {
        dvre dvreVar = new dvre();
        g = dvreVar;
        dsqw.cc(dvre.class, dvreVar);
    }

    private dvre() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0001\u0000\u0002\u001b\u0003င\u0001\u0004င\u0002\u0005ဈ\u0003\u0007ဇ\u0004", new Object[]{"a", "b", dgkg.class, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dvre();
            }
            if (i2 == 4) {
                return new dvrd();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvre> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvre.class) {
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
