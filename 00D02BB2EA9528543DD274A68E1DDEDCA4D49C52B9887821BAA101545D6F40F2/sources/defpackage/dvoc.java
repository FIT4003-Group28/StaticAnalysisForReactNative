package defpackage;
/* compiled from: PG */
/* renamed from: dvoc  reason: default package */
/* loaded from: classes6.dex */
public final class dvoc extends dsqw<dvoc, dvob> implements dssk {
    public static final dvoc b;
    private static volatile dssr<dvoc> d;
    public boolean a;
    private int c;

    static {
        dvoc dvocVar = new dvoc();
        b = dvocVar;
        dsqw.cc(dvoc.class, dvocVar);
    }

    private dvoc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvoc();
            }
            if (i2 == 4) {
                return new dvob();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvoc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvoc.class) {
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
