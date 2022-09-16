package defpackage;
/* compiled from: PG */
/* renamed from: dfwg  reason: default package */
/* loaded from: classes6.dex */
public final class dfwg extends dsqw<dfwg, dfwf> implements dssk {
    public static final dfwg g;
    private static volatile dssr<dfwg> h;
    public int a;
    public dsrj<dszq> b = dssu.b;
    public dszq c;
    public dszq d;
    public dszq e;
    public dszq f;

    static {
        dfwg dfwgVar = new dfwg();
        g = dfwgVar;
        dsqw.cc(dfwg.class, dfwgVar);
    }

    private dfwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0001\u0000\u0003\u001b\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005", new Object[]{"a", "b", dszq.class, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dfwg();
            }
            if (i2 == 4) {
                return new dfwf();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfwg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dfwg.class) {
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
