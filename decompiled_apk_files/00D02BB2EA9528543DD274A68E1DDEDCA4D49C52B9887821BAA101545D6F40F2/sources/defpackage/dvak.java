package defpackage;
/* compiled from: PG */
/* renamed from: dvak  reason: default package */
/* loaded from: classes6.dex */
public final class dvak extends dsqw<dvak, dvaj> implements dssk {
    public static final dvak e;
    private static volatile dssr<dvak> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dvak dvakVar = new dvak();
        e = dvakVar;
        dsqw.cc(dvak.class, dvakVar);
    }

    private dvak() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0004ဌ\u0002", new Object[]{"a", "b", dqjl.c(), "c", "d", dqki.a});
            }
            if (i2 == 3) {
                return new dvak();
            }
            if (i2 == 4) {
                return new dvaj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvak> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvak.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
