package defpackage;
/* compiled from: PG */
/* renamed from: ddru  reason: default package */
/* loaded from: classes6.dex */
public final class ddru extends dsqw<ddru, ddqv> implements dssk {
    public static final ddru g;
    private static volatile dssr<ddru> h;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public int e;
    public int f;

    static {
        ddru ddruVar = new ddru();
        g = ddruVar;
        dsqw.cc(ddru.class, ddruVar);
    }

    private ddru() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0013\u0001\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001င\u0000\u0002ဏ\u0001\u0003ဏ\u0002\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ဿ\u0000\bြ\u0000\tဿ\u0000\nြ\u0000\u000bြ\u0000\fဿ\u0000\r်\u0000\u000eြ\u0000\u000fြ\u0000\u0010်\u0000\u0011ြ\u0000\u0012ြ\u0000\u0013ြ\u0000", new Object[]{"c", "b", "a", "d", "e", "f", ddri.class, ddro.class, ddrs.class, ddrt.a, ddrq.class, dqvj.d(), ddrc.class, ddra.class, ddqy.a, ddrg.class, ddrk.class, ddqx.class, ddre.class, ddrm.class});
            }
            if (i2 == 3) {
                return new ddru();
            }
            if (i2 == 4) {
                return new ddqv();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddru> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddru.class) {
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

    public final void b(ddrm ddrmVar) {
        ddrmVar.getClass();
        this.c = ddrmVar;
        this.b = 19;
    }
}
