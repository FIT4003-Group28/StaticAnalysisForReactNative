package defpackage;
/* compiled from: PG */
/* renamed from: dtvu  reason: default package */
/* loaded from: classes6.dex */
public final class dtvu extends dsqw<dtvu, dtvn> implements dssk {
    public static final dtvu c;
    private static volatile dssr<dtvu> d;
    public dtvt a;
    public dtvr b;

    static {
        dtvu dtvuVar = new dtvu();
        c = dtvuVar;
        dsqw.cc(dtvu.class, dtvuVar);
    }

    private dtvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtvu();
            }
            if (i2 == 4) {
                return new dtvn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtvu.class) {
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
