package defpackage;
/* compiled from: PG */
/* renamed from: djnm  reason: default package */
/* loaded from: classes6.dex */
public final class djnm extends dsqw<djnm, djnl> implements dssk {
    public static final djnm e;
    private static volatile dssr<djnm> f;
    public int a;
    public djjv b;
    public dqjj c;
    public int d;

    static {
        djnm djnmVar = new djnm();
        e = djnmVar;
        dsqw.cc(djnm.class, djnmVar);
    }

    private djnm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djnm();
            }
            if (i2 == 4) {
                return new djnl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djnm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djnm.class) {
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
