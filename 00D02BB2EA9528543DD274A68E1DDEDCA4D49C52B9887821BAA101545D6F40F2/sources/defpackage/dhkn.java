package defpackage;
/* compiled from: PG */
/* renamed from: dhkn  reason: default package */
/* loaded from: classes6.dex */
public final class dhkn extends dsqw<dhkn, dhkm> implements dssk {
    public static final dhkn a;
    private static volatile dssr<dhkn> b;

    static {
        dhkn dhknVar = new dhkn();
        a = dhknVar;
        dsqw.cc(dhkn.class, dhknVar);
    }

    private dhkn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhkn();
            }
            if (i2 == 4) {
                return new dhkm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhkn> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhkn.class) {
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
