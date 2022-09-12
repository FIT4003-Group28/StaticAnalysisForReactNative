package defpackage;
/* compiled from: PG */
/* renamed from: dbno  reason: default package */
/* loaded from: classes5.dex */
public final class dbno extends dsqw<dbno, dbnm> implements dssk {
    public static final dbno f;
    private static volatile dssr<dbno> g;
    public int a;
    public dbod b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        dbno dbnoVar = new dbno();
        f = dbnoVar;
        dsqw.cc(dbno.class, dbnoVar);
    }

    private dbno() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", dbnn.a});
            }
            if (i2 == 3) {
                return new dbno();
            }
            if (i2 == 4) {
                return new dbnm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbno> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dbno.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
