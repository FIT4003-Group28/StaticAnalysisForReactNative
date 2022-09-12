package defpackage;
/* compiled from: PG */
/* renamed from: dvjj  reason: default package */
/* loaded from: classes.dex */
public final class dvjj extends dsqw<dvjj, dvji> implements dssk {
    public static final dvjj f;
    private static volatile dssr<dvjj> g;
    public int a;
    public dqpe c;
    public int e;
    public String b = "";
    public dsrj<dkei> d = dssu.b;

    static {
        dvjj dvjjVar = new dvjj();
        f = dvjjVar;
        dsqw.cc(dvjj.class, dvjjVar);
    }

    private dvjj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဌ\u0002", new Object[]{"a", "b", "c", "d", dkei.class, "e", drbs.a});
            }
            if (i2 == 3) {
                return new dvjj();
            }
            if (i2 == 4) {
                return new dvji();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvjj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvjj.class) {
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
