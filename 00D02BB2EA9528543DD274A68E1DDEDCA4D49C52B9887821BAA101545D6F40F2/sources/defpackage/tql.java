package defpackage;
/* compiled from: PG */
/* renamed from: tql  reason: default package */
/* loaded from: classes7.dex */
public final class tql extends dsqw<tql, tqk> implements dssk {
    public static final tql c;
    private static volatile dssr<tql> d;
    public int a;
    public int b;

    static {
        tql tqlVar = new tql();
        c = tqlVar;
        dsqw.cc(tql.class, tqlVar);
    }

    private tql() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", tnz.c()});
            }
            if (i2 == 3) {
                return new tql();
            }
            if (i2 == 4) {
                return new tqk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tql> dssrVar = d;
            if (dssrVar == null) {
                synchronized (tql.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
