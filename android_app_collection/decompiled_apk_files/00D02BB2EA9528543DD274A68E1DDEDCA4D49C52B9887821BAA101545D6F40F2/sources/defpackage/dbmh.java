package defpackage;
/* compiled from: PG */
/* renamed from: dbmh  reason: default package */
/* loaded from: classes5.dex */
public final class dbmh extends dsqw<dbmh, dbmd> implements dssk {
    public static final dbmh b;
    private static volatile dssr<dbmh> c;
    public dsrj<dbmg> a = dssu.b;

    static {
        dbmh dbmhVar = new dbmh();
        b = dbmhVar;
        dsqw.cc(dbmh.class, dbmhVar);
    }

    private dbmh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dbmg.class});
            }
            if (i2 == 3) {
                return new dbmh();
            }
            if (i2 == 4) {
                return new dbmd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbmh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dbmh.class) {
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
