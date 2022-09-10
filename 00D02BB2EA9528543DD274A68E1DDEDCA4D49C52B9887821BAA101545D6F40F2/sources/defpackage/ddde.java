package defpackage;
/* compiled from: PG */
/* renamed from: ddde  reason: default package */
/* loaded from: classes.dex */
public final class ddde extends dsqw<ddde, dddd> implements dssk {
    public static final ddde a;
    private static volatile dssr<ddde> b;

    static {
        ddde dddeVar = new ddde();
        a = dddeVar;
        dsqw.cc(ddde.class, dddeVar);
    }

    private ddde() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddde();
            }
            if (i2 == 4) {
                return new dddd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddde> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddde.class) {
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
