package defpackage;
/* compiled from: PG */
/* renamed from: dweo  reason: default package */
/* loaded from: classes6.dex */
public final class dweo extends dsqw<dweo, dwel> implements dssk {
    public static final dweo d;
    private static volatile dssr<dweo> e;
    public int a;
    public dwfl b;
    public dwen c;

    static {
        dweo dweoVar = new dweo();
        d = dweoVar;
        dsqw.cc(dweo.class, dweoVar);
    }

    private dweo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dweo();
            }
            if (i2 == 4) {
                return new dwel();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dweo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dweo.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
