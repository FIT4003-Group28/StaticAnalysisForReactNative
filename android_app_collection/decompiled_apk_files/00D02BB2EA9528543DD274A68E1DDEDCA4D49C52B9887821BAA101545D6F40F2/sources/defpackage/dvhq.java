package defpackage;
/* compiled from: PG */
/* renamed from: dvhq  reason: default package */
/* loaded from: classes.dex */
public final class dvhq extends dsqw<dvhq, dvhp> implements dssk {
    public static final dvhq d;
    private static volatile dssr<dvhq> f;
    public dqpe a;
    public dsrj<dpte> b = dssu.b;
    public int c;
    private int e;

    static {
        dvhq dvhqVar = new dvhq();
        d = dvhqVar;
        dsqw.cc(dvhq.class, dvhqVar);
    }

    private dvhq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဌ\u0002", new Object[]{"e", "a", "b", dpte.class, "c", drbs.a});
            }
            if (i2 == 3) {
                return new dvhq();
            }
            if (i2 == 4) {
                return new dvhp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvhq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvhq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
