package defpackage;
/* compiled from: PG */
/* renamed from: dpdc  reason: default package */
/* loaded from: classes6.dex */
public final class dpdc extends dsqw<dpdc, dpdb> implements dssk {
    public static final dpdc c;
    private static volatile dssr<dpdc> e;
    public String a = "";
    public int b;
    private int d;

    static {
        dpdc dpdcVar = new dpdc();
        c = dpdcVar;
        dsqw.cc(dpdc.class, dpdcVar);
    }

    private dpdc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpdc();
            }
            if (i2 == 4) {
                return new dpdb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpdc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpdc.class) {
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