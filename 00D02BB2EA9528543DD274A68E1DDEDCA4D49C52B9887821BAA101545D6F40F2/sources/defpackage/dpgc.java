package defpackage;
/* compiled from: PG */
/* renamed from: dpgc  reason: default package */
/* loaded from: classes6.dex */
public final class dpgc extends dsqw<dpgc, dpgb> implements dssk {
    public static final dpgc d;
    private static volatile dssr<dpgc> f;
    public dsrj<dpfz> a = dssu.b;
    public int b;
    public int c;
    private int e;

    static {
        dpgc dpgcVar = new dpgc();
        d = dpgcVar;
        dsqw.cc(dpgc.class, dpgcVar);
    }

    private dpgc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဌ\u0001", new Object[]{"e", "a", dpfz.class, "b", "c", dour.c()});
            }
            if (i2 == 3) {
                return new dpgc();
            }
            if (i2 == 4) {
                return new dpgb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpgc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpgc.class) {
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
