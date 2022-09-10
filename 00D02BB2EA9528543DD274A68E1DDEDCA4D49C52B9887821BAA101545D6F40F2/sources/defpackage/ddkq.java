package defpackage;
/* compiled from: PG */
/* renamed from: ddkq  reason: default package */
/* loaded from: classes.dex */
public final class ddkq extends dsqw<ddkq, ddkl> implements dssk {
    public static final ddkq d;
    private static volatile dssr<ddkq> e;
    public int a;
    public ddkn b;
    public ddkp c;

    static {
        ddkq ddkqVar = new ddkq();
        d = ddkqVar;
        dsqw.cc(ddkq.class, ddkqVar);
    }

    private ddkq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddkq();
            }
            if (i2 == 4) {
                return new ddkl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddkq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddkq.class) {
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
