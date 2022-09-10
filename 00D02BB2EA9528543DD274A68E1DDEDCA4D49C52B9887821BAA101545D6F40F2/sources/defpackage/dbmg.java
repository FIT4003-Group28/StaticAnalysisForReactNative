package defpackage;
/* compiled from: PG */
/* renamed from: dbmg  reason: default package */
/* loaded from: classes5.dex */
public final class dbmg extends dsqw<dbmg, dbme> implements dssk {
    public static final dbmg d;
    private static volatile dssr<dbmg> e;
    public int a;
    public int b;
    public long c;

    static {
        dbmg dbmgVar = new dbmg();
        d = dbmgVar;
        dsqw.cc(dbmg.class, dbmgVar);
    }

    private dbmg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", dbmf.a, "c"});
            }
            if (i2 == 3) {
                return new dbmg();
            }
            if (i2 == 4) {
                return new dbme();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbmg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dbmg.class) {
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
