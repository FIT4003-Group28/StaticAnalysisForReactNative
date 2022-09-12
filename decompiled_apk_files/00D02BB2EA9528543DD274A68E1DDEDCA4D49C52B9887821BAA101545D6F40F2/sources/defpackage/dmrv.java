package defpackage;
/* compiled from: PG */
/* renamed from: dmrv  reason: default package */
/* loaded from: classes.dex */
public final class dmrv extends dsqw<dmrv, dmru> implements dssk {
    public static final dmrv d;
    private static volatile dssr<dmrv> e;
    public dsrf a = dsqz.b;
    public dsrf b = dsqz.b;
    public dsrf c = dsqz.b;

    static {
        dmrv dmrvVar = new dmrv();
        d = dmrvVar;
        dsqw.cc(dmrv.class, dmrvVar);
    }

    private dmrv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001'\u0002'\u0003'", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmrv();
            }
            if (i2 == 4) {
                return new dmru();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmrv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmrv.class) {
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
