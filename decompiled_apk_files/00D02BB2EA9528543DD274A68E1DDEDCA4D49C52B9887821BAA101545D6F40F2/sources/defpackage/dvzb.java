package defpackage;
/* compiled from: PG */
/* renamed from: dvzb  reason: default package */
/* loaded from: classes6.dex */
public final class dvzb extends dsqw<dvzb, dvza> implements dssk {
    public static final dvzb c;
    private static volatile dssr<dvzb> d;
    public int a;
    public boolean b;

    static {
        dvzb dvzbVar = new dvzb();
        c = dvzbVar;
        dsqw.cc(dvzb.class, dvzbVar);
    }

    private dvzb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvzb();
            }
            if (i2 == 4) {
                return new dvza();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvzb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvzb.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
