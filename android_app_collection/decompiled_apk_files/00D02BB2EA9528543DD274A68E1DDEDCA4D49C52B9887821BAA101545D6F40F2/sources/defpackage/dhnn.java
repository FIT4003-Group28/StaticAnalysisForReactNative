package defpackage;
/* compiled from: PG */
/* renamed from: dhnn  reason: default package */
/* loaded from: classes6.dex */
public final class dhnn extends dsqw<dhnn, dhnm> implements dssk {
    public static final dhnn a;
    private static volatile dssr<dhnn> b;

    static {
        dhnn dhnnVar = new dhnn();
        a = dhnnVar;
        dsqw.cc(dhnn.class, dhnnVar);
    }

    private dhnn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhnn();
            }
            if (i2 == 4) {
                return new dhnm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhnn> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhnn.class) {
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
