package defpackage;
/* compiled from: PG */
/* renamed from: djrq  reason: default package */
/* loaded from: classes.dex */
public final class djrq extends dsqw<djrq, djrp> implements dssk {
    public static final djrq b;
    private static volatile dssr<djrq> d;
    public boolean a;
    private int c;

    static {
        djrq djrqVar = new djrq();
        b = djrqVar;
        dsqw.cc(djrq.class, djrqVar);
    }

    private djrq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djrq();
            }
            if (i2 == 4) {
                return new djrp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djrq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djrq.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
