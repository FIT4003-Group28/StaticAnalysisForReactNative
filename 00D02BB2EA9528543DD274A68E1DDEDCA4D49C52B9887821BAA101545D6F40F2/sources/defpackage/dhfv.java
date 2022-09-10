package defpackage;
/* compiled from: PG */
/* renamed from: dhfv  reason: default package */
/* loaded from: classes6.dex */
public final class dhfv extends dsqw<dhfv, dhfu> implements dssk {
    public static final dhfv b;
    private static volatile dssr<dhfv> c;
    public String a = "";

    static {
        dhfv dhfvVar = new dhfv();
        b = dhfvVar;
        dsqw.cc(dhfv.class, dhfvVar);
    }

    private dhfv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dhfv();
            }
            if (i2 == 4) {
                return new dhfu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhfv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhfv.class) {
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
