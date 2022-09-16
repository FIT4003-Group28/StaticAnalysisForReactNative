package defpackage;
/* compiled from: PG */
/* renamed from: dmgg  reason: default package */
/* loaded from: classes6.dex */
public final class dmgg extends dsqw<dmgg, dmgb> implements dssk {
    public static final dmgg d;
    public static final dsqv<dmfs, dmgg> e;
    private static volatile dssr<dmgg> g;
    public dsrj<dmgd> a = dssu.b;
    public dmgf b;
    public int c;
    private int f;

    static {
        dmgg dmggVar = new dmgg();
        d = dmggVar;
        dsqw.cc(dmgg.class, dmggVar);
        e = dsqw.newSingularGeneratedExtension(dmfs.c, dmggVar, dmggVar, null, 1021, dsur.MESSAGE, dmgg.class);
    }

    private dmgg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003င\u0001", new Object[]{"f", "a", dmgd.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dmgg();
            }
            if (i2 == 4) {
                return new dmgb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmgg.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
