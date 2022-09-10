package defpackage;
/* compiled from: PG */
/* renamed from: dnuc  reason: default package */
/* loaded from: classes.dex */
public final class dnuc extends dsqw<dnuc, dntz> implements dssk {
    public static final dnuc g;
    private static volatile dssr<dnuc> h;
    public int a;
    public int b;
    public doqb c;
    public boolean d;
    public boolean e;
    public dsrj<dnub> f;

    static {
        dnuc dnucVar = new dnuc();
        g = dnucVar;
        dsqw.cc(dnuc.class, dnucVar);
    }

    private dnuc() {
        dssu<Object> dssuVar = dssu.b;
        this.f = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0005ဇ\u0004\u0007ဇ\u0005\t\u001b", new Object[]{"a", "b", "c", "d", "e", "f", dnub.class});
            }
            if (i2 == 3) {
                return new dnuc();
            }
            if (i2 == 4) {
                return new dntz();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnuc> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnuc.class) {
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
