package defpackage;
/* compiled from: PG */
/* renamed from: dpld  reason: default package */
/* loaded from: classes6.dex */
public final class dpld extends dsqw<dpld, dplc> implements dssk {
    public static final dpld d;
    private static volatile dssr<dpld> f;
    public int a;
    public int b;
    public dntk c;
    private byte e = 2;

    static {
        dpld dpldVar = new dpld();
        d = dpldVar;
        dsqw.cc(dpld.class, dpldVar);
    }

    private dpld() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0004ᐉ\u0003", new Object[]{"a", "b", dplf.c(), "c"});
            }
            if (i2 == 3) {
                return new dpld();
            }
            if (i2 == 4) {
                return new dplc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dpld> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpld.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
