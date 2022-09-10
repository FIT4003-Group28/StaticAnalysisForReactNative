package defpackage;
/* compiled from: PG */
/* renamed from: dqts  reason: default package */
/* loaded from: classes6.dex */
public final class dqts extends dsqw<dqts, dqtr> implements dssk {
    public static final dqts c;
    private static volatile dssr<dqts> d;
    public int a;
    public dpsn b;

    static {
        dqts dqtsVar = new dqts();
        c = dqtsVar;
        dsqw.cc(dqts.class, dqtsVar);
    }

    private dqts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqts();
            }
            if (i2 == 4) {
                return new dqtr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqts> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqts.class) {
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
