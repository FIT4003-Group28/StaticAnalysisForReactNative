package defpackage;
/* compiled from: PG */
/* renamed from: dhdu  reason: default package */
/* loaded from: classes6.dex */
public final class dhdu extends dsqw<dhdu, dhdt> implements dssk {
    public static final dhdu a;
    private static volatile dssr<dhdu> d;
    private boolean b;
    private boolean c;

    static {
        dhdu dhduVar = new dhdu();
        a = dhduVar;
        dsqw.cc(dhdu.class, dhduVar);
    }

    private dhdu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0000\u0000\u0001\u0007\u0004\u0007", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dhdu();
            }
            if (i2 == 4) {
                return new dhdt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhdu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhdu.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
