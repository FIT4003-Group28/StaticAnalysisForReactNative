package defpackage;
/* compiled from: PG */
/* renamed from: dhkp  reason: default package */
/* loaded from: classes6.dex */
public final class dhkp extends dsqw<dhkp, dhko> implements dssk {
    public static final dhkp a;
    private static volatile dssr<dhkp> b;

    static {
        dhkp dhkpVar = new dhkp();
        a = dhkpVar;
        dsqw.cc(dhkp.class, dhkpVar);
    }

    private dhkp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhkp();
            }
            if (i2 == 4) {
                return new dhko();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhkp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhkp.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
