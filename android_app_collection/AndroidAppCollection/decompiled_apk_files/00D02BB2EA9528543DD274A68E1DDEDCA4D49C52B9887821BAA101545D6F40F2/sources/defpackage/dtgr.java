package defpackage;
/* compiled from: PG */
/* renamed from: dtgr  reason: default package */
/* loaded from: classes6.dex */
public final class dtgr extends dsqw<dtgr, dtgq> implements dssk {
    public static final dtgr b;
    private static volatile dssr<dtgr> d;
    public boolean a;
    private int c;

    static {
        dtgr dtgrVar = new dtgr();
        b = dtgrVar;
        dsqw.cc(dtgr.class, dtgrVar);
    }

    private dtgr() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dtgr();
            }
            if (i2 == 4) {
                return new dtgq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtgr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtgr.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
