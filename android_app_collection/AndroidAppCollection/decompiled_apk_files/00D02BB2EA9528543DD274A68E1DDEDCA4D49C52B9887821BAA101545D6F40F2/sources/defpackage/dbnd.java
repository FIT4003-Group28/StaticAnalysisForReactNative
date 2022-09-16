package defpackage;
/* compiled from: PG */
/* renamed from: dbnd  reason: default package */
/* loaded from: classes5.dex */
public final class dbnd extends dsqw<dbnd, dbnc> implements dssk {
    public static final dbnd d;
    private static volatile dssr<dbnd> e;
    public int a;
    public String b = "";
    public dbnb c;

    static {
        dbnd dbndVar = new dbnd();
        d = dbndVar;
        dsqw.cc(dbnd.class, dbndVar);
    }

    private dbnd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dbnd();
            }
            if (i2 == 4) {
                return new dbnc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbnd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dbnd.class) {
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
