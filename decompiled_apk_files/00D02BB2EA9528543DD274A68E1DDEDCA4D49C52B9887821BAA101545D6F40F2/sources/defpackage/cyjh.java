package defpackage;
/* compiled from: PG */
/* renamed from: cyjh  reason: default package */
/* loaded from: classes5.dex */
public final class cyjh extends dsqw<cyjh, cyiv> implements dssk {
    public static final cyjh g;
    private static volatile dssr<cyjh> h;
    public int a;
    public long b;
    public String c = "";
    public int d;
    public int e;
    public cyjf f;

    static {
        cyjh cyjhVar = new cyjh();
        g = cyjhVar;
        dsqw.cc(cyjh.class, cyjhVar);
    }

    private cyjh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003Ȉ\u0004\f\u0005\f\u0006\t", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new cyjh();
            }
            if (i2 == 4) {
                return new cyiv();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyjh> dssrVar = h;
            if (dssrVar == null) {
                synchronized (cyjh.class) {
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
