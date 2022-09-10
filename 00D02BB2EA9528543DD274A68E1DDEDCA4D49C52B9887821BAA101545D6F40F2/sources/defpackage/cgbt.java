package defpackage;
/* compiled from: PG */
/* renamed from: cgbt  reason: default package */
/* loaded from: classes4.dex */
public final class cgbt extends dsqw<cgbt, cgbq> implements dssk {
    public static final cgbt b;
    private static volatile dssr<cgbt> c;
    public dsrj<cgbs> a = dssu.b;

    static {
        cgbt cgbtVar = new cgbt();
        b = cgbtVar;
        dsqw.cc(cgbt.class, cgbtVar);
    }

    private cgbt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cgbs.class});
            }
            if (i2 == 3) {
                return new cgbt();
            }
            if (i2 == 4) {
                return new cgbq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgbt> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cgbt.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
