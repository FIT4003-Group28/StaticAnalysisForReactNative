package defpackage;
/* compiled from: PG */
/* renamed from: dtcg  reason: default package */
/* loaded from: classes6.dex */
public final class dtcg extends dsqw<dtcg, dtcf> implements dssk {
    public static final dtcg g;
    private static volatile dssr<dtcg> h;
    public int a;
    public dtci b;
    public dtce c;
    public dtck d;
    public dtca e;
    public dqgu f;

    static {
        dtcg dtcgVar = new dtcg();
        g = dtcgVar;
        dsqw.cc(dtcg.class, dtcgVar);
    }

    private dtcg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0000\u0006ဉ\u0005", new Object[]{"a", "c", "d", "e", "b", "f"});
            }
            if (i2 == 3) {
                return new dtcg();
            }
            if (i2 == 4) {
                return new dtcf();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtcg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtcg.class) {
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
