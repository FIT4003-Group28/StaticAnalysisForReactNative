package defpackage;
/* compiled from: PG */
/* renamed from: dsks  reason: default package */
/* loaded from: classes6.dex */
public final class dsks extends dsqw<dsks, dskg> implements dssk {
    public static final dsks g;
    private static volatile dssr<dsks> h;
    public int a;
    public int b;
    public dskk c;
    public dskm d;
    public dskq e;
    public int f;

    static {
        dsks dsksVar = new dsks();
        g = dsksVar;
        dsqw.cc(dsks.class, dsksVar);
    }

    private dsks() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0004\u0005ဉ\u0003", new Object[]{"a", "b", dskh.a, "c", "d", "f", dskr.a, "e"});
            }
            if (i2 == 3) {
                return new dsks();
            }
            if (i2 == 4) {
                return new dskg();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsks> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dsks.class) {
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
