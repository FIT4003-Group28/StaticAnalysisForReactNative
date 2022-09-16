package defpackage;
/* compiled from: PG */
/* renamed from: dvlb  reason: default package */
/* loaded from: classes.dex */
public final class dvlb extends dsqw<dvlb, dvla> implements dssk {
    public static final dvlb c;
    private static volatile dssr<dvlb> e;
    public int a;
    public boolean b;
    private int d;

    static {
        dvlb dvlbVar = new dvlb();
        c = dvlbVar;
        dsqw.cc(dvlb.class, dvlbVar);
    }

    private dvlb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", dvll.c(), "b"});
            }
            if (i2 == 3) {
                return new dvlb();
            }
            if (i2 == 4) {
                return new dvla();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvlb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvlb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
