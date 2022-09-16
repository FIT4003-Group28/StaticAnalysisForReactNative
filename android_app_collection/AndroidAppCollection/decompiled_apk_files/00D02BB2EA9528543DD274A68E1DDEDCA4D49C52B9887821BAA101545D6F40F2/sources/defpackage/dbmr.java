package defpackage;
/* compiled from: PG */
/* renamed from: dbmr  reason: default package */
/* loaded from: classes5.dex */
public final class dbmr extends dsqw<dbmr, dbmq> implements dssk {
    public static final dbmr c;
    private static volatile dssr<dbmr> d;
    public int a;
    public dbnb b;

    static {
        dbmr dbmrVar = new dbmr();
        c = dbmrVar;
        dsqw.cc(dbmr.class, dbmrVar);
    }

    private dbmr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dbmr();
            }
            if (i2 == 4) {
                return new dbmq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbmr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dbmr.class) {
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
