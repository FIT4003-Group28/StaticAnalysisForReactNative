package defpackage;
/* compiled from: PG */
/* renamed from: chty  reason: default package */
/* loaded from: classes4.dex */
public final class chty extends dsqw<chty, chtv> implements dssk {
    public static final chty e;
    private static volatile dssr<chty> f;
    public int a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        chty chtyVar = new chty();
        e = chtyVar;
        dsqw.cc(chty.class, chtyVar);
    }

    private chty() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", chtw.a, "c", "d"});
            }
            if (i2 == 3) {
                return new chty();
            }
            if (i2 == 4) {
                return new chtv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chty> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chty.class) {
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