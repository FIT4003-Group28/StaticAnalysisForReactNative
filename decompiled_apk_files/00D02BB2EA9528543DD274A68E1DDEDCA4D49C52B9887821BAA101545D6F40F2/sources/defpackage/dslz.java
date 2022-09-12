package defpackage;
/* compiled from: PG */
/* renamed from: dslz  reason: default package */
/* loaded from: classes6.dex */
public final class dslz extends dsqw<dslz, dslw> implements dssk {
    public static final dslz g;
    private static volatile dssr<dslz> h;
    public int a;
    public Object c;
    public int f;
    public int b = 0;
    public dsrf d = dsqz.b;
    public dspd e = dspd.b;

    static {
        dslz dslzVar = new dslz();
        g = dslzVar;
        dsqw.cc(dslz.class, dslzVar);
    }

    private dslz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0004\u0016\u0005ည\u0002\u0006င\u0003", new Object[]{"c", "b", "a", dgyj.class, dslx.a, "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dslz();
            }
            if (i2 == 4) {
                return new dslw();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dslz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dslz.class) {
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
