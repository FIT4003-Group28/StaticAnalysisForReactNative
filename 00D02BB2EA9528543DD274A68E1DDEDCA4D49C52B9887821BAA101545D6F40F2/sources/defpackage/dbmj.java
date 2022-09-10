package defpackage;
/* compiled from: PG */
/* renamed from: dbmj  reason: default package */
/* loaded from: classes5.dex */
public final class dbmj extends dsqw<dbmj, dbmi> implements dssk {
    public static final dbmj f;
    private static volatile dssr<dbmj> g;
    public int a;
    public dspd b = dspd.b;
    public dspd c = dspd.b;
    public dbmh d;
    public dbmc e;

    static {
        dbmj dbmjVar = new dbmj();
        f = dbmjVar;
        dsqw.cc(dbmj.class, dbmjVar);
    }

    private dbmj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dbmj();
            }
            if (i2 == 4) {
                return new dbmi();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbmj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dbmj.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
