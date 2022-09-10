package defpackage;
/* compiled from: PG */
/* renamed from: drty  reason: default package */
/* loaded from: classes6.dex */
public final class drty extends dsqw<drty, drtx> implements dssk {
    public static final drty g;
    private static volatile dssr<drty> h;
    public int a;
    public String b = "";
    public long c;
    public long d;
    public String e;
    public String f;

    static {
        drty drtyVar = new drty();
        g = drtyVar;
        dsqw.cc(drty.class, drtyVar);
    }

    private drty() {
        dssu<Object> dssuVar = dssu.b;
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0002", new Object[]{"a", "b", "c", "e", "f", "d"});
            }
            if (i2 == 3) {
                return new drty();
            }
            if (i2 == 4) {
                return new drtx();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drty> dssrVar = h;
            if (dssrVar == null) {
                synchronized (drty.class) {
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
