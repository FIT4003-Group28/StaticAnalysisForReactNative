package defpackage;
/* compiled from: PG */
/* renamed from: dtph  reason: default package */
/* loaded from: classes6.dex */
public final class dtph extends dsqw<dtph, dtpg> implements dssk {
    public static final dtph b;
    private static volatile dssr<dtph> d;
    public dhjx a;
    private int c;

    static {
        dtph dtphVar = new dtph();
        b = dtphVar;
        dsqw.cc(dtph.class, dtphVar);
    }

    private dtph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dtph();
            }
            if (i2 == 4) {
                return new dtpg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtph> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtph.class) {
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
