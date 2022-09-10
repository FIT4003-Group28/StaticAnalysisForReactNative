package defpackage;
/* compiled from: PG */
/* renamed from: djbl  reason: default package */
/* loaded from: classes6.dex */
public final class djbl extends dsqw<djbl, djbi> implements dssk {
    public static final djbl e;
    private static volatile dssr<djbl> f;
    public int a;
    public djbk b;
    public String c = "";
    public String d = "";

    static {
        djbl djblVar = new djbl();
        e = djblVar;
        dsqw.cc(djbl.class, djblVar);
    }

    private djbl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djbl();
            }
            if (i2 == 4) {
                return new djbi();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djbl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djbl.class) {
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
