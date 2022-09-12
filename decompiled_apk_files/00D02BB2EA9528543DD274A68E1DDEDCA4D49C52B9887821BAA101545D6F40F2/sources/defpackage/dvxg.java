package defpackage;
/* compiled from: PG */
/* renamed from: dvxg  reason: default package */
/* loaded from: classes.dex */
public final class dvxg extends dsqw<dvxg, dvxf> implements dssk {
    public static final dvxg b;
    private static volatile dssr<dvxg> d;
    public boolean a;
    private int c;

    static {
        dvxg dvxgVar = new dvxg();
        b = dvxgVar;
        dsqw.cc(dvxg.class, dvxgVar);
    }

    private dvxg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvxg();
            }
            if (i2 == 4) {
                return new dvxf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvxg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvxg.class) {
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
