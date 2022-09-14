package defpackage;
/* compiled from: PG */
/* renamed from: dbnu  reason: default package */
/* loaded from: classes5.dex */
public final class dbnu extends dsqw<dbnu, dbnt> implements dssk {
    public static final dbnu a;
    private static volatile dssr<dbnu> b;

    static {
        dbnu dbnuVar = new dbnu();
        a = dbnuVar;
        dsqw.cc(dbnu.class, dbnuVar);
    }

    private dbnu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dbnu();
            }
            if (i2 == 4) {
                return new dbnt();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbnu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dbnu.class) {
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
