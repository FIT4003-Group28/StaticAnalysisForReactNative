package defpackage;
/* compiled from: PG */
/* renamed from: dhnt  reason: default package */
/* loaded from: classes6.dex */
public final class dhnt extends dsqw<dhnt, dhns> implements dssk {
    public static final dhnt a;
    private static volatile dssr<dhnt> b;

    static {
        dhnt dhntVar = new dhnt();
        a = dhntVar;
        dsqw.cc(dhnt.class, dhntVar);
    }

    private dhnt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhnt();
            }
            if (i2 == 4) {
                return new dhns();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhnt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhnt.class) {
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
