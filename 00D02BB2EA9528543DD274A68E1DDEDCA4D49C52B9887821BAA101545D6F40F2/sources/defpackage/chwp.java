package defpackage;
/* compiled from: PG */
/* renamed from: chwp  reason: default package */
/* loaded from: classes4.dex */
public final class chwp extends dsqw<chwp, chwo> implements dssk {
    public static final chwp c;
    private static volatile dssr<chwp> d;
    public int a;
    public dpvc b;

    static {
        chwp chwpVar = new chwp();
        c = chwpVar;
        dsqw.cc(chwp.class, chwpVar);
    }

    private chwp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new chwp();
            }
            if (i2 == 4) {
                return new chwo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chwp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (chwp.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
