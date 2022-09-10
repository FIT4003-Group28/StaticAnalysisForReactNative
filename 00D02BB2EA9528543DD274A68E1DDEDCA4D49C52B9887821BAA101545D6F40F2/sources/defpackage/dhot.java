package defpackage;
/* compiled from: PG */
/* renamed from: dhot  reason: default package */
/* loaded from: classes6.dex */
public final class dhot extends dsqw<dhot, dhos> implements dssk {
    public static final dsrg<Integer, dkee> b = new dhor();
    public static final dhot c;
    private static volatile dssr<dhot> d;
    public dsrf a = dsqz.b;

    static {
        dhot dhotVar = new dhot();
        c = dhotVar;
        dsqw.cc(dhot.class, dhotVar);
    }

    private dhot() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", dkee.c()});
            }
            if (i2 == 3) {
                return new dhot();
            }
            if (i2 == 4) {
                return new dhos();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhot> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhot.class) {
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
