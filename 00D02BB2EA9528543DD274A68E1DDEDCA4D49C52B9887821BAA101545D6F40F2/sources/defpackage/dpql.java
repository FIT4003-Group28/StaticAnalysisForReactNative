package defpackage;
/* compiled from: PG */
/* renamed from: dpql  reason: default package */
/* loaded from: classes6.dex */
public final class dpql extends dsqw<dpql, dpqk> implements dssk {
    public static final dpql c;
    private static volatile dssr<dpql> e;
    public int a;
    public String b = "";
    private int d;

    static {
        dpql dpqlVar = new dpql();
        c = dpqlVar;
        dsqw.cc(dpql.class, dpqlVar);
    }

    private dpql() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", dqhy.c(), "b"});
            }
            if (i2 == 3) {
                return new dpql();
            }
            if (i2 == 4) {
                return new dpqk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpql> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpql.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
