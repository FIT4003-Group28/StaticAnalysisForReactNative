package defpackage;
/* compiled from: PG */
/* renamed from: dtwv  reason: default package */
/* loaded from: classes6.dex */
public final class dtwv extends dsqw<dtwv, dtws> implements dssk {
    public static final dtwv c;
    private static volatile dssr<dtwv> d;
    public int a;
    public int b;

    static {
        dtwv dtwvVar = new dtwv();
        c = dtwvVar;
        dsqw.cc(dtwv.class, dtwvVar);
    }

    private dtwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtwv();
            }
            if (i2 == 4) {
                return new dtws();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtwv.class) {
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
