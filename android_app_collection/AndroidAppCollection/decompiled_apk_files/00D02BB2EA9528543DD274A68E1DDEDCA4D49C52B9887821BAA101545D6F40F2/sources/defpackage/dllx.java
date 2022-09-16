package defpackage;
/* compiled from: PG */
/* renamed from: dllx  reason: default package */
/* loaded from: classes6.dex */
public final class dllx extends dsqw<dllx, dllu> implements dssk {
    public static final dllx g;
    private static volatile dssr<dllx> h;
    public int a;
    public dpum b;
    public int d;
    public boolean f;
    public String c = "";
    public dspd e = dspd.b;

    static {
        dllx dllxVar = new dllx();
        g = dllxVar;
        dsqw.cc(dllx.class, dllxVar);
    }

    private dllx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ည\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", dllv.a, "e", "f"});
            }
            if (i2 == 3) {
                return new dllx();
            }
            if (i2 == 4) {
                return new dllu();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dllx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dllx.class) {
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
