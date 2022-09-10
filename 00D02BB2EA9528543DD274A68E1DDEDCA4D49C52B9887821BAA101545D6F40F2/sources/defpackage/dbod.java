package defpackage;
/* compiled from: PG */
/* renamed from: dbod  reason: default package */
/* loaded from: classes5.dex */
public final class dbod extends dsqw<dbod, dbnz> implements dssk {
    public static final dbod e;
    private static volatile dssr<dbod> f;
    public int a;
    public String b = "";
    public int c;
    public dbob d;

    static {
        dbod dbodVar = new dbod();
        e = dbodVar;
        dsqw.cc(dbod.class, dbodVar);
    }

    private dbod() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0005ဌ\u0005\u0006ဉ\u0006", new Object[]{"a", "b", "c", dboc.a, "d"});
            }
            if (i2 == 3) {
                return new dbod();
            }
            if (i2 == 4) {
                return new dbnz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbod> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dbod.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
