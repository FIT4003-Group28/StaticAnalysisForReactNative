package defpackage;
/* compiled from: PG */
/* renamed from: dmjb  reason: default package */
/* loaded from: classes6.dex */
public final class dmjb extends dsqw<dmjb, dmiy> implements dssk {
    public static final dmjb d;
    public static final dsqv<dmfs, dmjb> e;
    private static volatile dssr<dmjb> g;
    public int a = 0;
    public Object b;
    public int c;
    private int f;

    static {
        dmjb dmjbVar = new dmjb();
        d = dmjbVar;
        dsqw.cc(dmjb.class, dmjbVar);
        e = dsqw.newSingularGeneratedExtension(dmfs.c, dmjbVar, dmjbVar, null, 1003, dsur.MESSAGE, dmjb.class);
    }

    private dmjb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ဌ\u0002\u0004ြ\u0000", new Object[]{"b", "a", "f", drqz.class, "c", dmiz.a, dqjt.class});
            }
            if (i2 == 3) {
                return new dmjb();
            }
            if (i2 == 4) {
                return new dmiy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmjb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmjb.class) {
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
