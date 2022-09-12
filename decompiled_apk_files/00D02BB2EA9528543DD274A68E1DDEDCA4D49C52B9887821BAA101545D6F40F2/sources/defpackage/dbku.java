package defpackage;
/* compiled from: PG */
/* renamed from: dbku  reason: default package */
/* loaded from: classes5.dex */
public final class dbku extends dsqw<dbku, dbks> implements dssk {
    public static final dbku a;
    private static volatile dssr<dbku> c;
    private dssd<String, String> b = dssd.b;

    static {
        dbku dbkuVar = new dbku();
        a = dbkuVar;
        dsqw.cc(dbku.class, dbkuVar);
    }

    private dbku() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", dbkt.a});
            }
            if (i2 == 3) {
                return new dbku();
            }
            if (i2 == 4) {
                return new dbks();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbku> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dbku.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
