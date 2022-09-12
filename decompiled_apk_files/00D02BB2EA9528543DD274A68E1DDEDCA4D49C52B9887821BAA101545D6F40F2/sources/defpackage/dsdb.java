package defpackage;
/* compiled from: PG */
/* renamed from: dsdb  reason: default package */
/* loaded from: classes6.dex */
public final class dsdb extends dsqw<dsdb, dsda> implements dssk {
    public static final dsdb a;
    private static volatile dssr<dsdb> b;

    static {
        dsdb dsdbVar = new dsdb();
        a = dsdbVar;
        dsqw.cc(dsdb.class, dsdbVar);
    }

    private dsdb() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dsdb();
            }
            if (i2 == 4) {
                return new dsda();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsdb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsdb.class) {
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
