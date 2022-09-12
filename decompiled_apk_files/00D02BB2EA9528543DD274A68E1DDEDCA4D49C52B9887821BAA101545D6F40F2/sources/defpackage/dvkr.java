package defpackage;
/* compiled from: PG */
/* renamed from: dvkr  reason: default package */
/* loaded from: classes6.dex */
public final class dvkr extends dsqw<dvkr, dvkq> implements dssk {
    public static final dvkr a;
    private static volatile dssr<dvkr> b;

    static {
        dvkr dvkrVar = new dvkr();
        a = dvkrVar;
        dsqw.cc(dvkr.class, dvkrVar);
    }

    private dvkr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvkr();
            }
            if (i2 == 4) {
                return new dvkq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvkr> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvkr.class) {
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
