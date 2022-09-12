package defpackage;
/* compiled from: PG */
/* renamed from: bzjd  reason: default package */
/* loaded from: classes4.dex */
public final class bzjd extends dsqw<bzjd, bzja> implements dssk {
    public static final bzjd g;
    private static volatile dssr<bzjd> h;
    public int a;
    public long b;
    public long c;
    public String d = "";
    public String e = "";
    public int f;

    static {
        bzjd bzjdVar = new bzjd();
        g = bzjdVar;
        dsqw.cc(bzjd.class, bzjdVar);
    }

    private bzjd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", bzjc.c()});
            }
            if (i2 == 3) {
                return new bzjd();
            }
            if (i2 == 4) {
                return new bzja();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzjd> dssrVar = h;
            if (dssrVar == null) {
                synchronized (bzjd.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
