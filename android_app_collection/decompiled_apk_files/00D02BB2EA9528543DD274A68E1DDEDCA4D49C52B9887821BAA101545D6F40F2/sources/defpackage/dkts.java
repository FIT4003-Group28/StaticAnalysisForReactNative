package defpackage;
/* compiled from: PG */
/* renamed from: dkts  reason: default package */
/* loaded from: classes.dex */
public final class dkts extends dsqw<dkts, dktr> implements dssk {
    public static final dkts c;
    private static volatile dssr<dkts> e;
    public boolean a;
    public int b = 1814400;
    private int d;

    static {
        dkts dktsVar = new dkts();
        c = dktsVar;
        dsqw.cc(dkts.class, dktsVar);
    }

    private dkts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dkts();
            }
            if (i2 == 4) {
                return new dktr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkts> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkts.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
