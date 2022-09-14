package defpackage;
/* compiled from: PG */
/* renamed from: dpqb  reason: default package */
/* loaded from: classes6.dex */
public final class dpqb extends dsqw<dpqb, dpqa> implements dssk {
    public static final dpqb a;
    private static volatile dssr<dpqb> b;

    static {
        dpqb dpqbVar = new dpqb();
        a = dpqbVar;
        dsqw.cc(dpqb.class, dpqbVar);
    }

    private dpqb() {
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
                return new dpqb();
            }
            if (i2 == 4) {
                return new dpqa();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpqb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dpqb.class) {
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
