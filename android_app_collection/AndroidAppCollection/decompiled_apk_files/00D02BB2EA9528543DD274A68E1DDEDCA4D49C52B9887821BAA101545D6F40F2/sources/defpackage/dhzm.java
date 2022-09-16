package defpackage;
/* compiled from: PG */
/* renamed from: dhzm  reason: default package */
/* loaded from: classes6.dex */
public final class dhzm extends dsqw<dhzm, dhzl> implements dssk {
    public static final dhzm a;
    private static volatile dssr<dhzm> b;

    static {
        dhzm dhzmVar = new dhzm();
        a = dhzmVar;
        dsqw.cc(dhzm.class, dhzmVar);
    }

    private dhzm() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhzm();
            }
            if (i2 == 4) {
                return new dhzl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhzm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhzm.class) {
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
