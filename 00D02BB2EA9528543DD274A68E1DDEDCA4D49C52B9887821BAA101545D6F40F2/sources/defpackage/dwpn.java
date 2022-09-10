package defpackage;
/* compiled from: PG */
/* renamed from: dwpn  reason: default package */
/* loaded from: classes6.dex */
public final class dwpn extends dsqw<dwpn, dwpm> implements dssk {
    public static final dwpn d;
    private static volatile dssr<dwpn> e;
    public int a;
    public dspd b = dspd.b;
    public dspd c = dspd.b;

    static {
        dwpn dwpnVar = new dwpn();
        d = dwpnVar;
        dsqw.cc(dwpn.class, dwpnVar);
    }

    private dwpn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwpn();
            }
            if (i2 == 4) {
                return new dwpm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwpn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
