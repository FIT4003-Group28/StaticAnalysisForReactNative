package defpackage;
/* compiled from: PG */
/* renamed from: dbmt  reason: default package */
/* loaded from: classes5.dex */
public final class dbmt extends dsqw<dbmt, dbms> implements dssk {
    public static final dbmt a;
    private static volatile dssr<dbmt> b;

    static {
        dbmt dbmtVar = new dbmt();
        a = dbmtVar;
        dsqw.cc(dbmt.class, dbmtVar);
    }

    private dbmt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dbmt();
            }
            if (i2 == 4) {
                return new dbms();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbmt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dbmt.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
