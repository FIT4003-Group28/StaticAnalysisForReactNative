package defpackage;
/* compiled from: PG */
/* renamed from: dhgt  reason: default package */
/* loaded from: classes6.dex */
public final class dhgt extends dsqw<dhgt, dhgs> implements dssk {
    public static final dhgt a;
    private static volatile dssr<dhgt> b;

    static {
        dhgt dhgtVar = new dhgt();
        a = dhgtVar;
        dsqw.cc(dhgt.class, dhgtVar);
    }

    private dhgt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhgt();
            }
            if (i2 == 4) {
                return new dhgs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhgt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhgt.class) {
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
