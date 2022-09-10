package defpackage;
/* compiled from: PG */
/* renamed from: dbky  reason: default package */
/* loaded from: classes5.dex */
public final class dbky extends dsqw<dbky, dbkx> implements dssk {
    public static final dbky a;
    private static volatile dssr<dbky> e;
    private int b;
    private dbkw c;
    private byte d = 2;

    static {
        dbky dbkyVar = new dbky();
        a = dbkyVar;
        dsqw.cc(dbky.class, dbkyVar);
    }

    private dbky() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0007", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dbky();
            }
            if (i2 == 4) {
                return new dbkx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dbky> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dbky.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
