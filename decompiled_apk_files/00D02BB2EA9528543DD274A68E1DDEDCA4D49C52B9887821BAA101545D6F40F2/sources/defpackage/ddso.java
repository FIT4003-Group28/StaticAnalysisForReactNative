package defpackage;
/* compiled from: PG */
/* renamed from: ddso  reason: default package */
/* loaded from: classes6.dex */
public final class ddso extends dsqw<ddso, ddsl> implements dssk {
    public static final ddso g;
    private static volatile dssr<ddso> h;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public dsrj<ddsn> f = dssu.b;

    static {
        ddso ddsoVar = new ddso();
        g = ddsoVar;
        dsqw.cc(ddso.class, ddsoVar);
    }

    private ddso() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", ddsn.class});
            }
            if (i2 == 3) {
                return new ddso();
            }
            if (i2 == 4) {
                return new ddsl();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddso> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddso.class) {
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
