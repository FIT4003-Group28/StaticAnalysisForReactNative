package defpackage;
/* compiled from: PG */
/* renamed from: dlpn  reason: default package */
/* loaded from: classes6.dex */
public final class dlpn extends dsqw<dlpn, dlpm> implements dssk {
    public static final dlpn b;
    private static volatile dssr<dlpn> c;
    public dsrj<dspd> a = dssu.b;

    static {
        dlpn dlpnVar = new dlpn();
        b = dlpnVar;
        dsqw.cc(dlpn.class, dlpnVar);
    }

    private dlpn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dlpn();
            }
            if (i2 == 4) {
                return new dlpm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlpn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlpn.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
