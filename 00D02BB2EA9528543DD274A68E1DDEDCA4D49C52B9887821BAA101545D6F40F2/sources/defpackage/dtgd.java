package defpackage;
/* compiled from: PG */
/* renamed from: dtgd  reason: default package */
/* loaded from: classes6.dex */
public final class dtgd extends dsqw<dtgd, dtgc> implements dssk {
    public static final dtgd c;
    private static volatile dssr<dtgd> d;
    public int a;
    public dtgb b;

    static {
        dtgd dtgdVar = new dtgd();
        c = dtgdVar;
        dsqw.cc(dtgd.class, dtgdVar);
    }

    private dtgd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtgd();
            }
            if (i2 == 4) {
                return new dtgc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtgd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtgd.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
