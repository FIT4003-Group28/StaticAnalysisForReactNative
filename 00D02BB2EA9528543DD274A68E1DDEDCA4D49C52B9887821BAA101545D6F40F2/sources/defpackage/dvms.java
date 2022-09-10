package defpackage;
/* compiled from: PG */
/* renamed from: dvms  reason: default package */
/* loaded from: classes6.dex */
public final class dvms extends dsqw<dvms, dvmr> implements dssk {
    public static final dvms b;
    private static volatile dssr<dvms> d;
    public boolean a;
    private int c;

    static {
        dvms dvmsVar = new dvms();
        b = dvmsVar;
        dsqw.cc(dvms.class, dvmsVar);
    }

    private dvms() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dvms();
            }
            if (i2 == 4) {
                return new dvmr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvms> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvms.class) {
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
