package defpackage;
/* compiled from: PG */
/* renamed from: dvvq  reason: default package */
/* loaded from: classes6.dex */
public final class dvvq extends dsqw<dvvq, dvvp> implements dssk {
    public static final dvvq f;
    private static volatile dssr<dvvq> g;
    public int a;
    public int b;
    public dsrj<dvvs> c = dssu.b;
    public boolean d;
    public dgly e;

    static {
        dvvq dvvqVar = new dvvq();
        f = dvvqVar;
        dsqw.cc(dvvq.class, dvvqVar);
    }

    private dvvq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", dpol.c(), "c", dvvs.class, "d", "e"});
            }
            if (i2 == 3) {
                return new dvvq();
            }
            if (i2 == 4) {
                return new dvvp();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvvq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvvq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
