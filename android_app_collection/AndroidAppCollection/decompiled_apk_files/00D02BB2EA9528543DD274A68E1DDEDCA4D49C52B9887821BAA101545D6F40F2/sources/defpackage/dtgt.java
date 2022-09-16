package defpackage;
/* compiled from: PG */
/* renamed from: dtgt  reason: default package */
/* loaded from: classes6.dex */
public final class dtgt extends dsqw<dtgt, dtgs> implements dssk {
    public static final dtgt b;
    private static volatile dssr<dtgt> d;
    public dtgr a;
    private int c;

    static {
        dtgt dtgtVar = new dtgt();
        b = dtgtVar;
        dsqw.cc(dtgt.class, dtgtVar);
    }

    private dtgt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dtgt();
            }
            if (i2 == 4) {
                return new dtgs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtgt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtgt.class) {
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
