package defpackage;
/* compiled from: PG */
/* renamed from: dsdx  reason: default package */
/* loaded from: classes6.dex */
public final class dsdx extends dsqw<dsdx, dsdq> implements dssk {
    public static final dsdx d;
    private static volatile dssr<dsdx> f;
    public int a;
    public long b;
    public dsdw c;
    private int e;

    static {
        dsdx dsdxVar = new dsdx();
        d = dsdxVar;
        dsqw.cc(dsdx.class, dsdxVar);
    }

    private dsdx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", dsdr.a, "b", "c"});
            }
            if (i2 == 3) {
                return new dsdx();
            }
            if (i2 == 4) {
                return new dsdq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsdx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsdx.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
