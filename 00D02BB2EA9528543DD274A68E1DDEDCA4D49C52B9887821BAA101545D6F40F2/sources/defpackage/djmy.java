package defpackage;
/* compiled from: PG */
/* renamed from: djmy  reason: default package */
/* loaded from: classes6.dex */
public final class djmy extends dsqw<djmy, djmw> implements dssk {
    public static final djmy e;
    private static volatile dssr<djmy> f;
    public int a;
    public djnk b;
    public int c = 1;
    public djna d;

    static {
        djmy djmyVar = new djmy();
        e = djmyVar;
        dsqw.cc(djmy.class, djmyVar);
    }

    private djmy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", djmx.a, "d"});
            }
            if (i2 == 3) {
                return new djmy();
            }
            if (i2 == 4) {
                return new djmw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djmy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djmy.class) {
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
