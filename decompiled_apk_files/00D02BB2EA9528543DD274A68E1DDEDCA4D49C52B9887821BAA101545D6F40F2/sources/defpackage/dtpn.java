package defpackage;
/* compiled from: PG */
/* renamed from: dtpn  reason: default package */
/* loaded from: classes6.dex */
public final class dtpn extends dsqw<dtpn, dtpk> implements dssk {
    public static final dtpn i;
    private static volatile dssr<dtpn> j;
    public int a;
    public dhjz b;
    public String c = "";
    public String d = "";
    public int e = -1;
    public String f = "";
    public int g;
    public int h;

    static {
        dtpn dtpnVar = new dtpn();
        i = dtpnVar;
        dsqw.cc(dtpn.class, dtpnVar);
    }

    private dtpn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0006ဌ\u0004\u0007ဈ\u0005\bဌ\u0006\tဌ\u0007", new Object[]{"a", "b", "c", "d", "e", dtnw.a, "f", "g", dtpl.a, "h", dtob.a});
            }
            if (i3 == 3) {
                return new dtpn();
            }
            if (i3 == 4) {
                return new dtpk();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dtpn> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dtpn.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
