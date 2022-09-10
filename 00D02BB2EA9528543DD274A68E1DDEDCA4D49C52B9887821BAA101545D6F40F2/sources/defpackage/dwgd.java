package defpackage;
/* compiled from: PG */
/* renamed from: dwgd  reason: default package */
/* loaded from: classes6.dex */
public final class dwgd extends dsqw<dwgd, dwfz> implements dssk {
    public static final dwgd g;
    private static volatile dssr<dwgd> h;
    public int a;
    public int b;
    public dwgc c;
    public boolean d;
    public boolean e;
    public dsrj<dplt> f = dssu.b;

    static {
        dwgd dwgdVar = new dwgd();
        g = dwgdVar;
        dsqw.cc(dwgd.class, dwgdVar);
    }

    private dwgd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0001\u0002ဇ\u0002\u0003ဌ\u0000\u0004ဇ\u0003\u0005\u001b", new Object[]{"a", "c", "d", "b", dwga.a, "e", "f", dplt.class});
            }
            if (i2 == 3) {
                return new dwgd();
            }
            if (i2 == 4) {
                return new dwfz();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwgd> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwgd.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
