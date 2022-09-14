package defpackage;
/* compiled from: PG */
/* renamed from: dnbr  reason: default package */
/* loaded from: classes.dex */
public final class dnbr extends dsqw<dnbr, dnbq> implements dssk {
    public static final dnbr a;
    private static volatile dssr<dnbr> b;

    static {
        dnbr dnbrVar = new dnbr();
        a = dnbrVar;
        dsqw.cc(dnbr.class, dnbrVar);
    }

    private dnbr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnbr();
            }
            if (i2 == 4) {
                return new dnbq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnbr> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnbr.class) {
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
