package defpackage;
/* compiled from: PG */
/* renamed from: dbmc  reason: default package */
/* loaded from: classes5.dex */
public final class dbmc extends dsqw<dbmc, dbmb> implements dssk {
    public static final dbmc c;
    private static volatile dssr<dbmc> d;
    public int a;
    public boolean b = true;

    static {
        dbmc dbmcVar = new dbmc();
        c = dbmcVar;
        dsqw.cc(dbmc.class, dbmcVar);
    }

    private dbmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dbmc();
            }
            if (i2 == 4) {
                return new dbmb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbmc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dbmc.class) {
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
