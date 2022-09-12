package defpackage;
/* compiled from: PG */
/* renamed from: daqq  reason: default package */
/* loaded from: classes.dex */
public final class daqq extends dsqw<daqq, daqp> implements dssk {
    public static final daqq g;
    private static volatile dssr<daqq> h;
    public int a;
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    public daqi f;

    static {
        daqq daqqVar = new daqq();
        g = daqqVar;
        dsqw.cc(daqq.class, daqqVar);
    }

    private daqq() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဌ\u0004\u0007ဇ\u0005\tဌ\u0007\nဉ\b", new Object[]{"a", "b", "c", daqn.a, "d", "e", daql.a, "f"});
            }
            if (i2 == 3) {
                return new daqq();
            }
            if (i2 == 4) {
                return new daqp();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daqq> dssrVar = h;
            if (dssrVar == null) {
                synchronized (daqq.class) {
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
