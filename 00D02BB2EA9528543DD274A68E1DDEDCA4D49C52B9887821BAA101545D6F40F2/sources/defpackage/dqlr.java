package defpackage;
/* compiled from: PG */
/* renamed from: dqlr  reason: default package */
/* loaded from: classes6.dex */
public final class dqlr extends dsqw<dqlr, dqlq> implements dssk {
    public static final dqlr a;
    private static volatile dssr<dqlr> b;

    static {
        dqlr dqlrVar = new dqlr();
        a = dqlrVar;
        dsqw.cc(dqlr.class, dqlrVar);
    }

    private dqlr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqlr();
            }
            if (i2 == 4) {
                return new dqlq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqlr> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqlr.class) {
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
