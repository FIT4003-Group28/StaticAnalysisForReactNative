package defpackage;
/* compiled from: PG */
/* renamed from: dbmn  reason: default package */
/* loaded from: classes5.dex */
public final class dbmn extends dsqw<dbmn, dbmm> implements dssk {
    public static final dbmn a;
    private static volatile dssr<dbmn> b;

    static {
        dbmn dbmnVar = new dbmn();
        a = dbmnVar;
        dsqw.cc(dbmn.class, dbmnVar);
    }

    private dbmn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dbmn();
            }
            if (i2 == 4) {
                return new dbmm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbmn> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dbmn.class) {
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
