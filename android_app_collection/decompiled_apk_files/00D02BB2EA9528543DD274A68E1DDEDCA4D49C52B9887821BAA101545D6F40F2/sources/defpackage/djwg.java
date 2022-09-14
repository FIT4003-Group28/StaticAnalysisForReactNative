package defpackage;
/* compiled from: PG */
/* renamed from: djwg  reason: default package */
/* loaded from: classes.dex */
public final class djwg extends dsqw<djwg, djwf> implements dssk {
    public static final djwg b;
    private static volatile dssr<djwg> d;
    public dkdo a;
    private int c;

    static {
        djwg djwgVar = new djwg();
        b = djwgVar;
        dsqw.cc(djwg.class, djwgVar);
    }

    private djwg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djwg();
            }
            if (i2 == 4) {
                return new djwf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djwg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djwg.class) {
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
