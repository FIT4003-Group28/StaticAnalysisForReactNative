package defpackage;
/* compiled from: PG */
/* renamed from: dhsv  reason: default package */
/* loaded from: classes6.dex */
public final class dhsv extends dsqw<dhsv, dhsu> implements dssk {
    public static final dhsv b;
    private static volatile dssr<dhsv> c;
    public dsrj<djda> a = dssu.b;

    static {
        dhsv dhsvVar = new dhsv();
        b = dhsvVar;
        dsqw.cc(dhsv.class, dhsvVar);
    }

    private dhsv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djda.class});
            }
            if (i2 == 3) {
                return new dhsv();
            }
            if (i2 == 4) {
                return new dhsu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhsv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhsv.class) {
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
