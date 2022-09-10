package defpackage;
/* compiled from: PG */
/* renamed from: dfsc  reason: default package */
/* loaded from: classes6.dex */
public final class dfsc extends dsqw<dfsc, dfsb> implements dssk {
    public static final dfsc g;
    private static volatile dssr<dfsc> h;
    public int a;
    public dfsv d;
    public int f;
    public dsrj<dftv> b = dssu.b;
    public dsrj<dfsk> c = dssu.b;
    public String e = "";

    static {
        dfsc dfscVar = new dfsc();
        g = dfscVar;
        dsqw.cc(dfsc.class, dfscVar);
    }

    private dfsc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0002\u0000\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005ဈ\u0001\u0006င\u0002", new Object[]{"a", "b", dftv.class, "c", dfsk.class, "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dfsc();
            }
            if (i2 == 4) {
                return new dfsb();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfsc> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dfsc.class) {
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
