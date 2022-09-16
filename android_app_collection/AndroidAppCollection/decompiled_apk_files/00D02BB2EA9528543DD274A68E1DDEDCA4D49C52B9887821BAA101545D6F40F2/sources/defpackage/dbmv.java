package defpackage;
/* compiled from: PG */
/* renamed from: dbmv  reason: default package */
/* loaded from: classes5.dex */
public final class dbmv extends dsqw<dbmv, dbmu> implements dssk {
    public static final dbmv a;
    private static volatile dssr<dbmv> b;

    static {
        dbmv dbmvVar = new dbmv();
        a = dbmvVar;
        dsqw.cc(dbmv.class, dbmvVar);
    }

    private dbmv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dbmv();
            }
            if (i2 == 4) {
                return new dbmu();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbmv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dbmv.class) {
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
