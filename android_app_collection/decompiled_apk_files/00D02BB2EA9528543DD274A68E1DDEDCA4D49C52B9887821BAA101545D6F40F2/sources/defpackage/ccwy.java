package defpackage;
/* compiled from: PG */
/* renamed from: ccwy  reason: default package */
/* loaded from: classes4.dex */
public final class ccwy extends dsqw<ccwy, ccwx> implements dssk {
    public static final ccwy d;
    private static volatile dssr<ccwy> e;
    public int a;
    public ccwu b;
    public dgfg c;

    static {
        ccwy ccwyVar = new ccwy();
        d = ccwyVar;
        dsqw.cc(ccwy.class, ccwyVar);
    }

    private ccwy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ccwy();
            }
            if (i2 == 4) {
                return new ccwx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccwy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ccwy.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
