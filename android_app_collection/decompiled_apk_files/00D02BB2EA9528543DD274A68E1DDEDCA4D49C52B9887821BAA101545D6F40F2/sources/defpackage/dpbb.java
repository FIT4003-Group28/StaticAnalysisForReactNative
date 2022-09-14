package defpackage;
/* compiled from: PG */
/* renamed from: dpbb  reason: default package */
/* loaded from: classes6.dex */
public final class dpbb extends dsqw<dpbb, dpba> implements dssk {
    public static final dpbb a;
    private static volatile dssr<dpbb> b;

    static {
        dpbb dpbbVar = new dpbb();
        a = dpbbVar;
        dsqw.cc(dpbb.class, dpbbVar);
    }

    private dpbb() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dpbb();
            }
            if (i2 == 4) {
                return new dpba();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpbb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dpbb.class) {
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
