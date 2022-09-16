package defpackage;
/* compiled from: PG */
/* renamed from: dbns  reason: default package */
/* loaded from: classes5.dex */
public final class dbns extends dsqw<dbns, dbnr> implements dssk {
    public static final dbns c;
    private static volatile dssr<dbns> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dbns dbnsVar = new dbns();
        c = dbnsVar;
        dsqw.cc(dbns.class, dbnsVar);
    }

    private dbns() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dbns();
            }
            if (i2 == 4) {
                return new dbnr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbns> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dbns.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
