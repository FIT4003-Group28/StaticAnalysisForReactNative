package defpackage;
/* compiled from: PG */
/* renamed from: dbmp  reason: default package */
/* loaded from: classes5.dex */
public final class dbmp extends dsqw<dbmp, dbmo> implements dssk {
    public static final dbmp a;
    private static volatile dssr<dbmp> b;

    static {
        dbmp dbmpVar = new dbmp();
        a = dbmpVar;
        dsqw.cc(dbmp.class, dbmpVar);
    }

    private dbmp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dbmp();
            }
            if (i2 == 4) {
                return new dbmo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbmp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dbmp.class) {
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
