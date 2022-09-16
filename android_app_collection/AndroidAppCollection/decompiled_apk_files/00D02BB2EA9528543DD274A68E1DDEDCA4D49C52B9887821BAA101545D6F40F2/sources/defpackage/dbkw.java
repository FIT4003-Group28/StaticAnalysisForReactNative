package defpackage;
/* compiled from: PG */
/* renamed from: dbkw  reason: default package */
/* loaded from: classes5.dex */
public final class dbkw extends dsqw<dbkw, dbkv> implements dssk {
    public static final dbkw a;
    private static volatile dssr<dbkw> e;
    private int b;
    private dstq c;
    private byte d = 2;

    static {
        dbkw dbkwVar = new dbkw();
        a = dbkwVar;
        dsqw.cc(dbkw.class, dbkwVar);
    }

    private dbkw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0003", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dbkw();
            }
            if (i2 == 4) {
                return new dbkv();
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
            dssr<dbkw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dbkw.class) {
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
