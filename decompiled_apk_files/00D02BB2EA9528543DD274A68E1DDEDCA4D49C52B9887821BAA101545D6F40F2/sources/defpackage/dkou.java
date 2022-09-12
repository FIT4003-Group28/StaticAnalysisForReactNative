package defpackage;
/* compiled from: PG */
/* renamed from: dkou  reason: default package */
/* loaded from: classes6.dex */
public final class dkou extends dsqw<dkou, dkot> implements dssk {
    public static final dkou a;
    private static volatile dssr<dkou> b;

    static {
        dkou dkouVar = new dkou();
        a = dkouVar;
        dsqw.cc(dkou.class, dkouVar);
    }

    private dkou() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkou();
            }
            if (i2 == 4) {
                return new dkot();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkou> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkou.class) {
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
