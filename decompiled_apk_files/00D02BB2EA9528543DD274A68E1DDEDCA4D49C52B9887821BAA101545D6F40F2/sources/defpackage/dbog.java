package defpackage;
/* compiled from: PG */
/* renamed from: dbog  reason: default package */
/* loaded from: classes5.dex */
public final class dbog extends dsqw<dbog, dbof> implements dssk {
    public static final dbog b;
    private static volatile dssr<dbog> c;
    public long a;

    static {
        dbog dbogVar = new dbog();
        b = dbogVar;
        dsqw.cc(dbog.class, dbogVar);
    }

    private dbog() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dbog();
            }
            if (i2 == 4) {
                return new dbof();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbog> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dbog.class) {
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
