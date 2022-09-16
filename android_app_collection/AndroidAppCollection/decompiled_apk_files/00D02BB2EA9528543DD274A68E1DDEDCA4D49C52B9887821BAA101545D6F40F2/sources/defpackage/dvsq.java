package defpackage;
/* compiled from: PG */
/* renamed from: dvsq  reason: default package */
/* loaded from: classes.dex */
public final class dvsq extends dsqw<dvsq, dvsp> implements dssk {
    public static final dvsq d;
    private static volatile dssr<dvsq> f;
    public int a = 10;
    public int b = 10;
    public boolean c;
    private int e;

    static {
        dvsq dvsqVar = new dvsq();
        d = dvsqVar;
        dsqw.cc(dvsq.class, dvsqVar);
    }

    private dvsq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002င\u0001\u0004င\u0003\u0005ဇ\u0004", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvsq();
            }
            if (i2 == 4) {
                return new dvsp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvsq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvsq.class) {
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
