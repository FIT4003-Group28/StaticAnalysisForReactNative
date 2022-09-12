package defpackage;
/* compiled from: PG */
/* renamed from: dgbg  reason: default package */
/* loaded from: classes6.dex */
public final class dgbg extends dsqw<dgbg, dgbd> implements dssk {
    public static final dgbg e;
    private static volatile dssr<dgbg> f;
    public int a;
    public String b = "";
    public int c;
    public long d;

    static {
        dgbg dgbgVar = new dgbg();
        e = dgbgVar;
        dsqw.cc(dgbg.class, dgbgVar);
    }

    private dgbg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0004\u0003ဂ\u0005", new Object[]{"a", "b", "c", dgbf.c(), "d"});
            }
            if (i2 == 3) {
                return new dgbg();
            }
            if (i2 == 4) {
                return new dgbd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgbg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgbg.class) {
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
