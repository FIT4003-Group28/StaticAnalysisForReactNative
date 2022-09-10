package defpackage;
/* compiled from: PG */
/* renamed from: dbob  reason: default package */
/* loaded from: classes5.dex */
public final class dbob extends dsqw<dbob, dboa> implements dssk {
    public static final dbob d;
    private static volatile dssr<dbob> e;
    public int a;
    public int b;
    public int c;

    static {
        dbob dbobVar = new dbob();
        d = dbobVar;
        dsqw.cc(dbob.class, dbobVar);
    }

    private dbob() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dbob();
            }
            if (i2 == 4) {
                return new dboa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbob> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dbob.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
