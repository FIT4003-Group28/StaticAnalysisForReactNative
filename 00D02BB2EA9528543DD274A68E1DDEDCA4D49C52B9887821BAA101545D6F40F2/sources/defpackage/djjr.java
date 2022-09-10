package defpackage;
/* compiled from: PG */
/* renamed from: djjr  reason: default package */
/* loaded from: classes6.dex */
public final class djjr extends dsqw<djjr, djjq> implements dssk {
    public static final djjr a;
    private static volatile dssr<djjr> b;

    static {
        djjr djjrVar = new djjr();
        a = djjrVar;
        dsqw.cc(djjr.class, djjrVar);
    }

    private djjr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djjr();
            }
            if (i2 == 4) {
                return new djjq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djjr> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djjr.class) {
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
