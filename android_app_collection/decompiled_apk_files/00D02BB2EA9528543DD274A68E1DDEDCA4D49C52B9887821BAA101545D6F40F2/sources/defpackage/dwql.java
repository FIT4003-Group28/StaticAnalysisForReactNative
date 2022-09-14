package defpackage;
/* compiled from: PG */
/* renamed from: dwql  reason: default package */
/* loaded from: classes6.dex */
public final class dwql extends dsqw<dwql, dwqk> implements dssk {
    public static final dwql b;
    private static volatile dssr<dwql> d;
    public boolean a;
    private int c;

    static {
        dwql dwqlVar = new dwql();
        b = dwqlVar;
        dsqw.cc(dwql.class, dwqlVar);
    }

    private dwql() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwql();
            }
            if (i2 == 4) {
                return new dwqk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwql> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwql.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
