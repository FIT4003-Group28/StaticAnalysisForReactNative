package defpackage;
/* compiled from: PG */
/* renamed from: dbmx  reason: default package */
/* loaded from: classes5.dex */
public final class dbmx extends dsqw<dbmx, dbmw> implements dssk {
    public static final dbmx d;
    private static volatile dssr<dbmx> e;
    public int a;
    public dbod b;
    public String c = "";

    static {
        dbmx dbmxVar = new dbmx();
        d = dbmxVar;
        dsqw.cc(dbmx.class, dbmxVar);
    }

    private dbmx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dbmx();
            }
            if (i2 == 4) {
                return new dbmw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbmx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dbmx.class) {
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
