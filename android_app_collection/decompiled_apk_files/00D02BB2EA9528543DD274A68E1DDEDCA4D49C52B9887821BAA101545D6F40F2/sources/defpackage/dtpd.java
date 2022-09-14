package defpackage;
/* compiled from: PG */
/* renamed from: dtpd  reason: default package */
/* loaded from: classes6.dex */
public final class dtpd extends dsqw<dtpd, dtpc> implements dssk {
    public static final dtpd c;
    private static volatile dssr<dtpd> e;
    public int a = -1;
    public String b = "";
    private int d;

    static {
        dtpd dtpdVar = new dtpd();
        c = dtpdVar;
        dsqw.cc(dtpd.class, dtpdVar);
    }

    private dtpd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", dtnw.a, "b"});
            }
            if (i2 == 3) {
                return new dtpd();
            }
            if (i2 == 4) {
                return new dtpc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtpd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtpd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
