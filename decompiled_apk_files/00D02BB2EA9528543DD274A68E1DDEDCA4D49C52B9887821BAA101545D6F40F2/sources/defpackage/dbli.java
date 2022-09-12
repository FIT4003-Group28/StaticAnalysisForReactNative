package defpackage;
/* compiled from: PG */
/* renamed from: dbli  reason: default package */
/* loaded from: classes5.dex */
public final class dbli extends dsqw<dbli, dblh> implements dssk {
    public static final dbli e;
    private static volatile dssr<dbli> g;
    public int a;
    public dgrh b;
    public dgrn d;
    private byte f = 2;
    public String c = "";

    static {
        dbli dbliVar = new dbli();
        e = dbliVar;
        dsqw.cc(dbli.class, dbliVar);
    }

    private dbli() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dbli();
            }
            if (i2 == 4) {
                return new dblh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dbli> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dbli.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
