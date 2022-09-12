package defpackage;
/* compiled from: PG */
/* renamed from: dbkr  reason: default package */
/* loaded from: classes5.dex */
public final class dbkr extends dsqw<dbkr, dbkq> implements dssk {
    public static final dbkr a;
    private static volatile dssr<dbkr> f;
    private int b;
    private dbky c;
    private dbku d;
    private byte e = 2;

    static {
        dbkr dbkrVar = new dbkr();
        a = dbkrVar;
        dsqw.cc(dbkr.class, dbkrVar);
    }

    private dbkr() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0006\u000f\u0002\u0000\u0000\u0001\u0006ᐉ\u0007\u000fဉ\u0010", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dbkr();
            }
            if (i2 == 4) {
                return new dbkq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dbkr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dbkr.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
