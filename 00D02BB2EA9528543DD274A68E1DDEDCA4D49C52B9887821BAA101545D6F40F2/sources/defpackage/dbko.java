package defpackage;
/* compiled from: PG */
/* renamed from: dbko  reason: default package */
/* loaded from: classes5.dex */
public final class dbko extends dsqw<dbko, dbkn> implements dssk {
    public static final dbko b;
    private static volatile dssr<dbko> d;
    public dble a;
    private int c;

    static {
        dbko dbkoVar = new dbko();
        b = dbkoVar;
        dsqw.cc(dbko.class, dbkoVar);
    }

    private dbko() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\b", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dbko();
            }
            if (i2 == 4) {
                return new dbkn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbko> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dbko.class) {
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
