package defpackage;
/* compiled from: PG */
/* renamed from: dvgq  reason: default package */
/* loaded from: classes.dex */
public final class dvgq extends dsqw<dvgq, dvgp> implements dssk {
    public static final dvgq d;
    private static volatile dssr<dvgq> e;
    public int a;
    public int b;
    public dplx c;

    static {
        dvgq dvgqVar = new dvgq();
        d = dvgqVar;
        dsqw.cc(dvgq.class, dvgqVar);
    }

    private dvgq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvgq();
            }
            if (i2 == 4) {
                return new dvgp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvgq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvgq.class) {
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
