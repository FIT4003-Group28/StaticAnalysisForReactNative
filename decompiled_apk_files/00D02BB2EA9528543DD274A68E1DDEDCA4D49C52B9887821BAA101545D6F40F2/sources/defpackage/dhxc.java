package defpackage;
/* compiled from: PG */
/* renamed from: dhxc  reason: default package */
/* loaded from: classes6.dex */
public final class dhxc extends dsqw<dhxc, dhxb> implements dssk {
    public static final dhxc a;
    private static volatile dssr<dhxc> b;

    static {
        dhxc dhxcVar = new dhxc();
        a = dhxcVar;
        dsqw.cc(dhxc.class, dhxcVar);
    }

    private dhxc() {
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
                return new dhxc();
            }
            if (i2 == 4) {
                return new dhxb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhxc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhxc.class) {
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
