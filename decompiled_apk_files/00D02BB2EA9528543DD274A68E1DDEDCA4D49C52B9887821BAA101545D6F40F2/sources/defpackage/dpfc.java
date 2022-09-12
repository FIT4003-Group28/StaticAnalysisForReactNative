package defpackage;
/* compiled from: PG */
/* renamed from: dpfc  reason: default package */
/* loaded from: classes6.dex */
public final class dpfc extends dsqw<dpfc, dpfb> implements dssk {
    public static final dpfc b;
    private static volatile dssr<dpfc> d;
    public int a = 3600;
    private int c;

    static {
        dpfc dpfcVar = new dpfc();
        b = dpfcVar;
        dsqw.cc(dpfc.class, dpfcVar);
    }

    private dpfc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dpfc();
            }
            if (i2 == 4) {
                return new dpfb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpfc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpfc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
