package defpackage;
/* compiled from: PG */
/* renamed from: dvjd  reason: default package */
/* loaded from: classes.dex */
public final class dvjd extends dsqw<dvjd, dvjc> implements dssk {
    public static final dvjd d;
    private static volatile dssr<dvjd> f;
    public dqpe a;
    public dsrj<dqig> b = dssu.b;
    public int c;
    private int e;

    static {
        dvjd dvjdVar = new dvjd();
        d = dvjdVar;
        dsqw.cc(dvjd.class, dvjdVar);
    }

    private dvjd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဌ\u0002", new Object[]{"e", "a", "b", dqig.class, "c", drbs.a});
            }
            if (i2 == 3) {
                return new dvjd();
            }
            if (i2 == 4) {
                return new dvjc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvjd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvjd.class) {
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
