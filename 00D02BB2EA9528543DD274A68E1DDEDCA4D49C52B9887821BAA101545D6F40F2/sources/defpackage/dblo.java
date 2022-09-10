package defpackage;
/* compiled from: PG */
/* renamed from: dblo  reason: default package */
/* loaded from: classes5.dex */
public final class dblo extends dsqw<dblo, dbln> implements dssk {
    public static final dblo a;
    private static volatile dssr<dblo> d;
    private int b;
    private dstq c;

    static {
        dblo dbloVar = new dblo();
        a = dbloVar;
        dsqw.cc(dblo.class, dbloVar);
    }

    private dblo() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0003", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dblo();
            }
            if (i2 == 4) {
                return new dbln();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dblo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dblo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
