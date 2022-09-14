package defpackage;
/* compiled from: PG */
/* renamed from: cgck  reason: default package */
/* loaded from: classes4.dex */
public final class cgck extends dsqw<cgck, cgcj> implements dssk {
    public static final cgck a;
    private static volatile dssr<cgck> b;

    static {
        cgck cgckVar = new cgck();
        a = cgckVar;
        dsqw.cc(cgck.class, cgckVar);
    }

    private cgck() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new cgck();
            }
            if (i2 == 4) {
                return new cgcj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgck> dssrVar = b;
            if (dssrVar == null) {
                synchronized (cgck.class) {
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
