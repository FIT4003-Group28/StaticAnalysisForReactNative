package defpackage;
/* compiled from: PG */
/* renamed from: bzhr  reason: default package */
/* loaded from: classes4.dex */
public final class bzhr extends dsqw<bzhr, bzhq> implements dssk {
    public static final bzhr e;
    private static volatile dssr<bzhr> g;
    public int a;
    public bzjj b;
    public long c;
    public long d;
    private byte f = 2;

    static {
        bzhr bzhrVar = new bzhr();
        e = bzhrVar;
        dsqw.cc(bzhr.class, bzhrVar);
    }

    private bzhr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new bzhr();
            }
            if (i2 == 4) {
                return new bzhq();
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
            dssr<bzhr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (bzhr.class) {
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
