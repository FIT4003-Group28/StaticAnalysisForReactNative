package defpackage;
/* compiled from: PG */
/* renamed from: dhfb  reason: default package */
/* loaded from: classes6.dex */
public final class dhfb extends dsqw<dhfb, dhfa> implements dssk {
    public static final dhfb b;
    private static volatile dssr<dhfb> c;
    public int a;

    static {
        dhfb dhfbVar = new dhfb();
        b = dhfbVar;
        dsqw.cc(dhfb.class, dhfbVar);
    }

    private dhfb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0004", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dhfb();
            }
            if (i2 == 4) {
                return new dhfa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhfb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhfb.class) {
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
