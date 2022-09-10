package defpackage;
/* compiled from: PG */
/* renamed from: dtcc  reason: default package */
/* loaded from: classes6.dex */
public final class dtcc extends dsqw<dtcc, dtcb> implements dssk {
    public static final dtcc d;
    private static volatile dssr<dtcc> e;
    public int a;
    public dtcg b;
    public dtbu c;

    static {
        dtcc dtccVar = new dtcc();
        d = dtccVar;
        dsqw.cc(dtcc.class, dtccVar);
    }

    private dtcc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtcc();
            }
            if (i2 == 4) {
                return new dtcb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtcc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtcc.class) {
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
