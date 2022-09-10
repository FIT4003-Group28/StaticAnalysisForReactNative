package defpackage;
/* compiled from: PG */
/* renamed from: djdj  reason: default package */
/* loaded from: classes6.dex */
public final class djdj extends dsqw<djdj, djdi> implements dssk {
    public static final djdj g;
    private static volatile dssr<djdj> h;
    public int a;
    public int c;
    public boolean f;
    public String b = "";
    public String d = "";
    public dsrj<dqeg> e = dssu.b;

    static {
        djdj djdjVar = new djdj();
        g = djdjVar;
        dsqw.cc(djdj.class, djdjVar);
    }

    private djdj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0001\u0000\u0002ဈ\u0001\u0003င\u0002\u0005ဈ\u0003\u0006\u001b\u0007ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", dqeg.class, "f"});
            }
            if (i2 == 3) {
                return new djdj();
            }
            if (i2 == 4) {
                return new djdi();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djdj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djdj.class) {
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
