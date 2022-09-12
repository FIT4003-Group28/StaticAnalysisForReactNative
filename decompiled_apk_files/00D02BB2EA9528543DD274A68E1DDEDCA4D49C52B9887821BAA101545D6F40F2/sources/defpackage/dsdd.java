package defpackage;
/* compiled from: PG */
/* renamed from: dsdd  reason: default package */
/* loaded from: classes6.dex */
public final class dsdd extends dsqw<dsdd, dsdc> implements dssk {
    public static final dsdd b;
    private static volatile dssr<dsdd> c;
    public dsri a = dsrx.b;

    static {
        dsdd dsddVar = new dsdd();
        b = dsddVar;
        dsqw.cc(dsdd.class, dsddVar);
    }

    private dsdd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dsdd();
            }
            if (i2 == 4) {
                return new dsdc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsdd> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsdd.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
