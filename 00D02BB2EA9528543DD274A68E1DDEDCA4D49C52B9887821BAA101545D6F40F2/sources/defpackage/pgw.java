package defpackage;
/* compiled from: PG */
/* renamed from: pgw  reason: default package */
/* loaded from: classes7.dex */
public final class pgw extends dsqw<pgw, pgv> implements dssk {
    public static final dsrg<Integer, dsyl> c = new pgu();
    public static final pgw e;
    private static volatile dssr<pgw> f;
    public int a;
    public dsrf b = dsqz.b;
    public int d;

    static {
        pgw pgwVar = new pgw();
        e = pgwVar;
        dsqw.cc(pgw.class, pgwVar);
    }

    private pgw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0001\u0000\u0002\u001e\u0004ဌ\u0000", new Object[]{"a", "b", dsyl.c(), "d", dsyt.a});
            }
            if (i2 == 3) {
                return new pgw();
            }
            if (i2 == 4) {
                return new pgv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<pgw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (pgw.class) {
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
