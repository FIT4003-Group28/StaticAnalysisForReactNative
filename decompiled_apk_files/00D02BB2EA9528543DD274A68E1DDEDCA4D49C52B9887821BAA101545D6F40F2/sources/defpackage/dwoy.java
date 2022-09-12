package defpackage;
/* compiled from: PG */
/* renamed from: dwoy  reason: default package */
/* loaded from: classes.dex */
public final class dwoy extends dsqw<dwoy, dwot> implements dssk {
    public static final dwoy b;
    private static volatile dssr<dwoy> c;
    public dsrj<dwox> a = dssu.b;

    static {
        dwoy dwoyVar = new dwoy();
        b = dwoyVar;
        dsqw.cc(dwoy.class, dwoyVar);
    }

    private dwoy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dwox.class});
            }
            if (i2 == 3) {
                return new dwoy();
            }
            if (i2 == 4) {
                return new dwot();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwoy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dwoy.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
