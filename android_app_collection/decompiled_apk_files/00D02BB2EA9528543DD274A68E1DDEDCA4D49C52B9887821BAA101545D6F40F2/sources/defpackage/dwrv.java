package defpackage;
/* compiled from: PG */
/* renamed from: dwrv  reason: default package */
/* loaded from: classes6.dex */
public final class dwrv extends dsqw<dwrv, dwru> implements dssk {
    public static final dwrv c;
    private static volatile dssr<dwrv> e;
    public dhjx a;
    public int b;
    private int d;

    static {
        dwrv dwrvVar = new dwrv();
        c = dwrvVar;
        dsqw.cc(dwrv.class, dwrvVar);
    }

    private dwrv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", dwrx.c()});
            }
            if (i2 == 3) {
                return new dwrv();
            }
            if (i2 == 4) {
                return new dwru();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwrv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwrv.class) {
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
