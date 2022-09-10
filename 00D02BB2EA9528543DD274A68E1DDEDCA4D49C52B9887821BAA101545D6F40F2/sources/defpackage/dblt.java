package defpackage;
/* compiled from: PG */
/* renamed from: dblt  reason: default package */
/* loaded from: classes5.dex */
public final class dblt extends dsqw<dblt, dbls> implements dssk {
    public static final dblt a;
    private static volatile dssr<dblt> d;
    private int b;
    private dblr c;

    static {
        dblt dbltVar = new dblt();
        a = dbltVar;
        dsqw.cc(dblt.class, dbltVar);
    }

    private dblt() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0000\u000eဉ\f", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dblt();
            }
            if (i2 == 4) {
                return new dbls();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dblt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dblt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
