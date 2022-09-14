package defpackage;
/* compiled from: PG */
/* renamed from: djoz  reason: default package */
/* loaded from: classes6.dex */
public final class djoz extends dsqw<djoz, djoy> implements dssk {
    public static final djoz c;
    private static volatile dssr<djoz> d;
    public int a;
    public int b;

    static {
        djoz djozVar = new djoz();
        c = djozVar;
        dsqw.cc(djoz.class, djozVar);
    }

    private djoz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqhy.c()});
            }
            if (i2 == 3) {
                return new djoz();
            }
            if (i2 == 4) {
                return new djoy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djoz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djoz.class) {
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
