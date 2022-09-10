package defpackage;
/* compiled from: PG */
/* renamed from: dpcu  reason: default package */
/* loaded from: classes6.dex */
public final class dpcu extends dsqw<dpcu, dpct> implements dssk {
    public static final dpcu c;
    private static volatile dssr<dpcu> e;
    public long a;
    public long b;
    private int d;

    static {
        dpcu dpcuVar = new dpcu();
        c = dpcuVar;
        dsqw.cc(dpcu.class, dpcuVar);
    }

    private dpcu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002စ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpcu();
            }
            if (i2 == 4) {
                return new dpct();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpcu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpcu.class) {
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
