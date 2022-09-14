package defpackage;
/* compiled from: PG */
/* renamed from: ddtu  reason: default package */
/* loaded from: classes6.dex */
public final class ddtu extends dsqw<ddtu, ddtt> implements dssk {
    public static final ddtu a;
    private static volatile dssr<ddtu> b;

    static {
        ddtu ddtuVar = new ddtu();
        a = ddtuVar;
        dsqw.cc(ddtu.class, ddtuVar);
    }

    private ddtu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddtu();
            }
            if (i2 == 4) {
                return new ddtt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddtu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddtu.class) {
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
