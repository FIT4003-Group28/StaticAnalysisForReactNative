package defpackage;
/* compiled from: PG */
/* renamed from: dvpn  reason: default package */
/* loaded from: classes6.dex */
public final class dvpn extends dsqw<dvpn, dvpm> implements dssk {
    public static final dvpn a;
    private static volatile dssr<dvpn> b;

    static {
        dvpn dvpnVar = new dvpn();
        a = dvpnVar;
        dsqw.cc(dvpn.class, dvpnVar);
    }

    private dvpn() {
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
                return new dvpn();
            }
            if (i2 == 4) {
                return new dvpm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvpn> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvpn.class) {
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
