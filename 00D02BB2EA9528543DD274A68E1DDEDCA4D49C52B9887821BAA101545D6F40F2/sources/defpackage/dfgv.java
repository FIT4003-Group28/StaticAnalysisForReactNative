package defpackage;
/* compiled from: PG */
/* renamed from: dfgv  reason: default package */
/* loaded from: classes6.dex */
public final class dfgv extends dsqw<dfgv, dfgr> implements dssk {
    public static final dfgv d;
    private static volatile dssr<dfgv> e;
    public int a;
    public int b;
    public int c;

    static {
        dfgv dfgvVar = new dfgv();
        d = dfgvVar;
        dsqw.cc(dfgv.class, dfgvVar);
    }

    private dfgv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", dfgu.c(), "c", dfgs.a});
            }
            if (i2 == 3) {
                return new dfgv();
            }
            if (i2 == 4) {
                return new dfgr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfgv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfgv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
