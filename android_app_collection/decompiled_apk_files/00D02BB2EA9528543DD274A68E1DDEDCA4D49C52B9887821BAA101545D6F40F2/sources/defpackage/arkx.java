package defpackage;
/* compiled from: PG */
/* renamed from: arkx  reason: default package */
/* loaded from: classes2.dex */
public final class arkx extends dsqw<arkx, arkw> implements dssk {
    public static final arkx g;
    private static volatile dssr<arkx> h;
    public int a;
    public long b;
    public boolean c;
    public boolean d = true;
    public boolean e;
    public boolean f;

    static {
        arkx arkxVar = new arkx();
        g = arkxVar;
        dsqw.cc(arkx.class, arkxVar);
    }

    private arkx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0019\u0005\u0000\u0000\u0000\u0001ဂ\u0000\rဇ\u0003\u0016ဇ\u0001\u0017ဇ\u0004\u0019ဇ\u0005", new Object[]{"a", "b", "d", "c", "e", "f"});
            }
            if (i2 == 3) {
                return new arkx();
            }
            if (i2 == 4) {
                return new arkw();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<arkx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (arkx.class) {
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
