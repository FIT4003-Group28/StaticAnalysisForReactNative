package defpackage;
/* compiled from: PG */
/* renamed from: dwzd  reason: default package */
/* loaded from: classes6.dex */
public final class dwzd extends dsqw<dwzd, dwza> implements dssk {
    public static final dwzd c;
    private static volatile dssr<dwzd> e;
    public int a;
    public dsra b = dspr.b;
    private int d;

    static {
        dwzd dwzdVar = new dwzd();
        c = dwzdVar;
        dsqw.cc(dwzd.class, dwzdVar);
    }

    private dwzd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0012", new Object[]{"d", "a", dwzb.a, "b"});
            }
            if (i2 == 3) {
                return new dwzd();
            }
            if (i2 == 4) {
                return new dwza();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwzd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwzd.class) {
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
